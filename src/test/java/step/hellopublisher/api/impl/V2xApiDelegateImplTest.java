package step.hellopublisher.api.impl;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.ArgumentMatchers;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.Spy;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.HttpStatusCodeException;
import org.springframework.web.client.RestTemplate;

import junit.framework.TestCase;
import step.hellopublisher.exceptions.PublisherException;
import step.hellopublisher.model.Response;
import step.hellopublisher.model.ServiceType;
import step.hellopublisher.model.dto.BaseMessageDTO;
import step.hellopublisher.model.dto.ServiceTypeDTO;

@RunWith(MockitoJUnitRunner.class)
public class V2xApiDelegateImplTest extends TestCase {

	@Mock
	private RestTemplate restTemplate = new RestTemplate();
	@InjectMocks
	@Spy
	private V2xApiDelegateImpl service;
//

	@Test
	public void testPublishV2x() {

//		ResponseEntity<Response> response = restTemplate.exchange(uri, HttpMethod.POST, requestEntity,
//				Response.class);

		Response response = new Response();
		response.setKey("v2x/ivim/public/g8/s/6/k/j/9/r/3/x");
		response.setService(ServiceType.IVIM);

		ResponseEntity<Response> responseEntity = new ResponseEntity<Response>(response, HttpStatus.OK);

		Mockito.when(restTemplate.exchange(Mockito.anyString(), Mockito.any(), Mockito.any(),
				ArgumentMatchers.any(Class.class))).thenReturn(responseEntity);
//		service.publishV2x();
//	     verify(service.buildIVIM(),times(1));
//		String serviceType = service.publishV2x().getBody().getService().getValue();
//		System.out.println("serviceType "+ serviceType);

		assertEquals(ServiceTypeDTO.IVIM, service.publishV2x().getBody().getService());
	}

	@Test
	public void testUnAuthorizedPublish() {
		HttpStatusCodeException exception = new HttpStatusCodeException(HttpStatus.UNAUTHORIZED) {
		};
		Mockito.when(restTemplate.exchange(Mockito.anyString(), Mockito.any(), Mockito.any(),
				ArgumentMatchers.eq(Response.class))).thenThrow(exception);

		

		Mockito.doNothing().when(service).generateAccessToken();

		
		assertThrows(PublisherException.class, () -> service.publishV2x());
        verify(service,times(1)).publishV2x( Mockito.any(), eq(false));
		verify(service, times(1)).generateAccessToken();
	}
}
