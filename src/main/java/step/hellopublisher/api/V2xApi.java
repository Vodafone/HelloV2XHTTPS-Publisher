/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (5.3.0).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package step.hellopublisher.api;

import step.hellopublisher.model.dto.ErrorDTO;
import step.hellopublisher.model.dto.ResponseDTO;
import io.swagger.annotations.*;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.Valid;
import javax.validation.constraints.*;
import java.util.List;
import java.util.Map;
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-04-26T14:15:55.316729200+02:00[Africa/Cairo]")
@Validated
@Api(value = "v2x", description = "the v2x API")
public interface V2xApi {

    default V2xApiDelegate getDelegate() {
        return new V2xApiDelegate() {};
    }

    /**
     * GET /v2x/publish : Service for generating DENM and IVIM (ETSI) messages 
     * Receives and publishes a message back into the Event stream
     *
     * @return The received message was in a correct format and successfully processed (status code 200)
     *         or The received message was not in a correct format (status code 400)
     */
    @ApiOperation(value = "Service for generating DENM and IVIM (ETSI) messages ", nickname = "publishV2x", notes = "Receives and publishes a message back into the Event stream", response = ResponseDTO.class, authorizations = {
        
        @Authorization(value = "bearerAuth")
         }, tags={ "V2X", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "The received message was in a correct format and successfully processed", response = ResponseDTO.class),
        @ApiResponse(code = 400, message = "The received message was not in a correct format", response = ErrorDTO.class) })
    @RequestMapping(
        method = RequestMethod.GET,
        value = "/v2x/publish",
        produces = { "application/json" }
    )
    default ResponseEntity<ResponseDTO> publishV2x() {
        return getDelegate().publishV2x();
    }

}
