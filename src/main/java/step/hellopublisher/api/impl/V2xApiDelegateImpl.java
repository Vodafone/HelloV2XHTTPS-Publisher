package step.hellopublisher.api.impl;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.FormHttpMessageConverter;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.stereotype.Service;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.HttpStatusCodeException;
import org.springframework.web.client.RestTemplate;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import step.hellopublisher.api.V2xApiDelegate;
import step.hellopublisher.exceptions.PublisherException;
import step.hellopublisher.model.Response;
import step.hellopublisher.model.dto.BaseMessageDTO;
import step.hellopublisher.model.dto.CauseDTO;
import step.hellopublisher.model.dto.ContentDenmDTO;
import step.hellopublisher.model.dto.ContentIvimDTO;
import step.hellopublisher.model.dto.DeltaPositionDTO;
import step.hellopublisher.model.dto.DeltaReferencePositionDTO;
import step.hellopublisher.model.dto.EventDTO;
import step.hellopublisher.model.dto.EventPointDTO;
import step.hellopublisher.model.dto.GeoAddressDTO;
import step.hellopublisher.model.dto.GeographicLocationDTO;
import step.hellopublisher.model.dto.IviLocationDTO;
import step.hellopublisher.model.dto.MessageDenmDTO;
import step.hellopublisher.model.dto.MessageIvimDTO;
import step.hellopublisher.model.dto.MetadataDTO;
import step.hellopublisher.model.dto.PathPointDTO;
import step.hellopublisher.model.dto.PayloadDenmDTO;
import step.hellopublisher.model.dto.PayloadDenmDTO.TrafficDirectionEnum;
import step.hellopublisher.model.dto.PayloadIvimDTO;
import step.hellopublisher.model.dto.PictogramCategoryDTO;
import step.hellopublisher.model.dto.ReferencePositionDTO;
import step.hellopublisher.model.dto.ResponseDTO;
import step.hellopublisher.model.dto.RoadSignDTO;
import step.hellopublisher.model.dto.RoadTypeDTO;
import step.hellopublisher.model.dto.ServiceCategoryDTO;
import step.hellopublisher.model.dto.ServiceCategoryDTO.TrafficEnum;
import step.hellopublisher.model.dto.ServiceCategoryDTO.TypeEnum;
import step.hellopublisher.model.dto.ServiceTypeDTO;
import step.hellopublisher.model.dto.StationTypeDTO;
import step.hellopublisher.model.dto.TimeDTO;


@Slf4j
@Service
@RequiredArgsConstructor
@EnableScheduling
public class V2xApiDelegateImpl implements V2xApiDelegate {

	private static final String HEADER_GRANT_TYPE = "grant_type";
	private static final String HEADER_CLIENT_CREDENTIALS = "client_credentials";
	private static final String HEADER_CLIENT_ID = "client_id";
	private static final String HEADER_CLIENT_SECRET = "client_secret";


	@Autowired
	HttpServletRequest request;

	private String authToken;
    
	
	private RestTemplate restTemplate = new RestTemplate();

	@Value("${apix.server}")
	private String server;

	@Value("${apix.path}")
	private String apixPath;

	@Value("${apix.grantType}")
	private String grantType;

	@Value("${apix.clientId}")
	private String clientId;

	@Value("${apix.clientSecret}")
	private String clientSecret;

	@Value("${apix.scope}")
	private String scope;

	@Value("${publisher.path}")
	private String path;

	@Value("${apix.urlPathIntrospect}")
	private String urlPathIntrospect;

	public void generateAccessToken() {

		String endpoint = server + apixPath;
		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_FORM_URLENCODED);
		headers.setAccept(Collections.singletonList(MediaType.APPLICATION_JSON));
		headers.setBasicAuth(clientId, clientSecret);

		MultiValueMap<String, String> formData = new LinkedMultiValueMap<>();
		formData.add(HEADER_GRANT_TYPE, HEADER_CLIENT_CREDENTIALS);
		formData.add(HEADER_CLIENT_ID, clientId);
		formData.add(HEADER_CLIENT_SECRET, clientSecret);

		restTemplate.getMessageConverters().add(new FormHttpMessageConverter());

		HttpEntity<MultiValueMap<String, String>> requestFields = new HttpEntity<>(formData, headers);

		try {
			log.info("Generating new token from ({})", endpoint);
			log.debug("Client_id ({}) - Client_credencials ({})", clientId, clientSecret);
			ResponseEntity<AuthDTO> response = this.restTemplate.exchange(endpoint, HttpMethod.POST, requestFields,
					AuthDTO.class);
			this.authToken = Objects.requireNonNull(response.getBody()).getAccessToken();
			log.debug("New token Apix created ({}).", authToken);

		} catch (Exception e) {
			log.error("Error while creating Apix token. {}", e.toString());
			throw new PublisherException(e.toString());
		}

	}

	public ResponseEntity<ResponseDTO> publishV2x() {
		

		//Build IVIM message
		MessageIvimDTO ivimDTO = buildIVIM();
		

		//Build DENM message
		MessageDenmDTO denmDTO = buildDENM();
		
		// publishV2x((BaseMessageDTO) denmDTO, true);
		ResponseEntity<ResponseDTO> response = publishV2x((BaseMessageDTO) ivimDTO, true);
		
		return response;
		

	}

	public ResponseEntity<ResponseDTO> publishV2x(BaseMessageDTO message, Boolean retry) {

		try {
			String uri = server + path;
			HttpHeaders headers = new HttpHeaders();
			headers.setContentType(MediaType.APPLICATION_JSON);
			headers.setBearerAuth(this.authToken);

			HttpEntity<BaseMessageDTO> requestEntity = new HttpEntity<BaseMessageDTO>(message, headers);

			ResponseEntity<Response> response = this.restTemplate.exchange(uri, HttpMethod.POST, requestEntity,
					Response.class);
			log.info("publisher response: " + response.getBody());
			
			return ResponseEntity.ok(new ResponseDTO().service(message != null ? message.getService() : ServiceTypeDTO.UNKNOWN)
					.key(response.getBody().getKey()).uuid(response.getBody().getUuid())

					.success(true));


		} catch (HttpStatusCodeException e) {
			// TODO Auto-generated catch block

			if (e.getStatusCode() == HttpStatus.UNAUTHORIZED && retry) {
				generateAccessToken();
				return publishV2x(message, false);
			}
			throw new PublisherException(e.getMessage());
		}
	}

	private MessageDenmDTO buildDENM() {
		// TODO Auto-generated method stub

		ContentDenmDTO contentDenmDTO = new ContentDenmDTO();
		PayloadDenmDTO payloadDenmDTO = new PayloadDenmDTO();
		MessageDenmDTO messageDenmDTO = new MessageDenmDTO();

		GeoAddressDTO geoAddress = new GeoAddressDTO();
		geoAddress.setLat(13.6640935);
		geoAddress.setLon(16.9321627);

		MetadataDTO metadata = new MetadataDTO();
		metadata.setGeoaddress(geoAddress);
		metadata.setRestricted(false);
		metadata.setTimestamp("1632838789");

		payloadDenmDTO.setIdentifier(123456789);
		payloadDenmDTO.setSequence(123);
		payloadDenmDTO.setStationType(StationTypeDTO.MOPED);

		ReferencePositionDTO referencePositionDTO = new ReferencePositionDTO();
		referencePositionDTO.setAltitude(24F);
		referencePositionDTO.setLatitude(41.2338676);
		referencePositionDTO.setLatitude(0.0);
		referencePositionDTO.setLongitude(-8.6204712);
		referencePositionDTO.setLongitude(0.0);
		referencePositionDTO.setHeading(28);
		referencePositionDTO.setSpeed(26);

		payloadDenmDTO.setReferencePosition(referencePositionDTO);
		payloadDenmDTO.setDistance(10);
		payloadDenmDTO.trafficDirection(TrafficDirectionEnum.BOTHDIRECTIONS);
		payloadDenmDTO.setValidityDuration(86400);
		payloadDenmDTO.setTransmissionInterval(500);

		TimeDTO timeDTO = new TimeDTO();

		BigDecimal detectionTime = new BigDecimal("1606733817");
		BigDecimal referenceTime = new BigDecimal("1635587817");

		timeDTO.setDetectionTime(detectionTime);
		timeDTO.setReferenceTime(referenceTime);

		payloadDenmDTO.setTime(timeDTO);

		EventDTO eventDTO = new EventDTO();
		eventDTO.setSpeed(13);
		eventDTO.setHeading(14);
		eventDTO.setRoadType(RoadTypeDTO.URBAN_NOSTRUCTURALSEPARATIONTOOPPOSITELANES);
		eventDTO.setEventCause(CauseDTO.ACCIDENT);
		eventDTO.setLinkedEventCause(CauseDTO.WRONGWAYDRIVING);

		List<EventPointDTO> eventHistory = new ArrayList<>();

		EventPointDTO event = new EventPointDTO();
		DeltaReferencePositionDTO deltaReferencePosition = new DeltaReferencePositionDTO();

		deltaReferencePosition.setDeltaLatitude(-123L);
		deltaReferencePosition.setDeltaLongitude(897L);
		deltaReferencePosition.setDeltaAltitude(0L);

		event.setDeltaPosition(deltaReferencePosition);

		BigDecimal deltaTime = new BigDecimal("1706733817");
		event.setDeltaTime(deltaTime);
		event.setInformationQuality(1);

		eventHistory.add(event);
		eventDTO.setEventHistory(eventHistory);
		payloadDenmDTO.setEvent(eventDTO);
		
		List<PathPointDTO> pathPoints = new ArrayList<>();
		PathPointDTO pathPointDTO = new PathPointDTO();
		pathPointDTO.setPathDeltaTime(deltaTime);

		DeltaReferencePositionDTO deltaReferencePosition1 = new DeltaReferencePositionDTO();

		deltaReferencePosition1.setDeltaLatitude(0L);
		deltaReferencePosition1.setDeltaLongitude(0L);
		deltaReferencePosition1.setDeltaAltitude(12800L);
		
		pathPointDTO.setPathPosition(deltaReferencePosition);
		pathPoints.add(pathPointDTO);
		List<List<PathPointDTO>> traces = new ArrayList<>();
		traces.add(pathPoints);
		
		eventDTO.setTraces(traces);
		
		contentDenmDTO._object(payloadDenmDTO);
		messageDenmDTO.setContent(contentDenmDTO);
		messageDenmDTO.setMetadata(metadata);
		messageDenmDTO.setPublisher("nokia");
		messageDenmDTO.setService(ServiceTypeDTO.DENM);
		
		
		
		return messageDenmDTO;
	}
	
	
	private MessageIvimDTO buildIVIM() {
		// TODO Auto-generated method stub

		ContentIvimDTO contentIvimDTO  = new ContentIvimDTO();
		PayloadIvimDTO payloadIvimDTO = new PayloadIvimDTO();
		MessageIvimDTO messageIvimDTO = new MessageIvimDTO();
		
	

		GeoAddressDTO geoAddress = new GeoAddressDTO();
		geoAddress.setLat(13.6640935);
		geoAddress.setLon(16.9321627);

		MetadataDTO metadata = new MetadataDTO();
		metadata.setGeoaddress(geoAddress);
		metadata.setRestricted(false);
		metadata.setTimestamp("1632838789");

		payloadIvimDTO.setIdentifier(123456789);
		payloadIvimDTO.setSequence(123);
		

		ReferencePositionDTO referencePositionDTO = new ReferencePositionDTO();
		referencePositionDTO.setAltitude(24F);
		referencePositionDTO.setLatitude(41.2338676);
		referencePositionDTO.setLatitude(0.0);
		referencePositionDTO.setLongitude(-8.6204712);
		referencePositionDTO.setLongitude(0.0);
		referencePositionDTO.setHeading(28);
		referencePositionDTO.setSpeed(26);

		payloadIvimDTO.setReferencePosition(referencePositionDTO);

		DeltaPositionDTO deltaPositionDTO = new DeltaPositionDTO();

		deltaPositionDTO.setDeltaLatitude(123);
		deltaPositionDTO.setDeltaLongitude(897);
		
		
		List<DeltaPositionDTO> deltaPositions = new ArrayList<>();
		deltaPositions.add(deltaPositionDTO);
		
		GeographicLocationDTO geographicLocationDTO = new  GeographicLocationDTO();
		geographicLocationDTO.setHeading(1);
		geographicLocationDTO.setId(12);
		geographicLocationDTO.setLine(deltaPositions);
		
		List<GeographicLocationDTO> geographicLocations = new ArrayList<>();
		geographicLocations.add(geographicLocationDTO);
		payloadIvimDTO.setGeographicLocations(geographicLocations);
		
		payloadIvimDTO.setCountryCode("GB");
		
		List<IviLocationDTO> iviLocations = new ArrayList<>();
		IviLocationDTO iviLocationDTO = new IviLocationDTO();
		
		iviLocationDTO.setType(1);
		iviLocationDTO.setDirection(1);
		List<RoadSignDTO> roadSigns = new ArrayList<>();
		RoadSignDTO roadSign = new RoadSignDTO();
		roadSign.setCountryCode("GB");
	
		ServiceCategoryDTO serviceCategory = new ServiceCategoryDTO();
        serviceCategory.setType(TypeEnum.TRAFFICSIGN);
        serviceCategory.setTraffic(TrafficEnum.DANGERWARNING);
        roadSign.setServiceCategory(serviceCategory);
		
        PictogramCategoryDTO pictogramCategory = new PictogramCategoryDTO();
		pictogramCategory.setNature(9);
		pictogramCategory.setSerialNumber(53);
		roadSign.setPictogramCategory(pictogramCategory);
		
		roadSigns.add(roadSign);
		iviLocationDTO.setRoadSigns(roadSigns);
		
		List<Integer> applicableLanes = new ArrayList<>();
		applicableLanes.add(2);
		applicableLanes.add(3);
		applicableLanes.add(4);
		iviLocationDTO.setApplicableLanes(applicableLanes);
		
		List<Integer> detectionZones = new ArrayList<>();
		detectionZones.add(4);
		detectionZones.add(5);	
		iviLocationDTO.setDetectionZones(detectionZones);
		
		iviLocations.add(iviLocationDTO);
		payloadIvimDTO.setIviLocations(iviLocations);
      
	
		
		
		contentIvimDTO._object(payloadIvimDTO);
		
		messageIvimDTO.setContent(contentIvimDTO);
		messageIvimDTO.setMetadata(metadata);
		messageIvimDTO.setPublisher("nokia");
		messageIvimDTO.setService(ServiceTypeDTO.IVIM);

		
		
		
		return messageIvimDTO;
	}
	
	

}
