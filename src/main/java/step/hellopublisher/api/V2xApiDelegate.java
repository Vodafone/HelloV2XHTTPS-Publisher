package step.hellopublisher.api;

import step.hellopublisher.model.dto.ErrorDTO;
import step.hellopublisher.model.dto.ResponseDTO;
import io.swagger.annotations.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;
import java.util.Map;
import java.util.Optional;

/**
 * A delegate to be called by the {@link V2xApiController}}.
 * Implement this interface with a {@link org.springframework.stereotype.Service} annotated class.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-04-26T14:15:55.316729200+02:00[Africa/Cairo]")
public interface V2xApiDelegate {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    /**
     * GET /v2x/publish : Service for generating DENM and IVIM (ETSI) messages 
     * Receives and publishes a message back into the Event stream
     *
     * @return The received message was in a correct format and successfully processed (status code 200)
     *         or The received message was not in a correct format (status code 400)
     * @see V2xApi#publishV2x
     */
    default ResponseEntity<ResponseDTO> publishV2x() {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"partition\" : \"partition\", \"offset\" : \"offset\", \"success\" : true, \"uuid\" : \"uuid\", \"key\" : \"key\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

}
