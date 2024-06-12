package step.hellopublisher.model.dto;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * DeltaReferencePositionDTO
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-04-26T14:15:55.316729200+02:00[Africa/Cairo]")
public class DeltaReferencePositionDTO   {
  @JsonProperty("deltaLatitude")
  private Long deltaLatitude;

  @JsonProperty("deltaLongitude")
  private Long deltaLongitude;

  @JsonProperty("deltaAltitude")
  private Long deltaAltitude;

  public DeltaReferencePositionDTO deltaLatitude(Long deltaLatitude) {
    this.deltaLatitude = deltaLatitude;
    return this;
  }

  /**
   * in microdegrees. 131072 for unavailable
   * minimum: -131071
   * maximum: 131072
   * @return deltaLatitude
  */
  @ApiModelProperty(example = "131072", required = true, value = "in microdegrees. 131072 for unavailable")
  @NotNull

@Min(-131071L) @Max(131072L) 
  public Long getDeltaLatitude() {
    return deltaLatitude;
  }

  public void setDeltaLatitude(Long deltaLatitude) {
    this.deltaLatitude = deltaLatitude;
  }

  public DeltaReferencePositionDTO deltaLongitude(Long deltaLongitude) {
    this.deltaLongitude = deltaLongitude;
    return this;
  }

  /**
   * in microdegrees. 131072 for unavailable
   * minimum: -131071
   * maximum: 131072
   * @return deltaLongitude
  */
  @ApiModelProperty(example = "131072", required = true, value = "in microdegrees. 131072 for unavailable")
  @NotNull

@Min(-131071L) @Max(131072L) 
  public Long getDeltaLongitude() {
    return deltaLongitude;
  }

  public void setDeltaLongitude(Long deltaLongitude) {
    this.deltaLongitude = deltaLongitude;
  }

  public DeltaReferencePositionDTO deltaAltitude(Long deltaAltitude) {
    this.deltaAltitude = deltaAltitude;
    return this;
  }

  /**
   * in centimeters
   * minimum: -12700
   * maximum: 12800
   * @return deltaAltitude
  */
  @ApiModelProperty(example = "12800", required = true, value = "in centimeters")
  @NotNull

@Min(-12700L) @Max(12800L) 
  public Long getDeltaAltitude() {
    return deltaAltitude;
  }

  public void setDeltaAltitude(Long deltaAltitude) {
    this.deltaAltitude = deltaAltitude;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DeltaReferencePositionDTO deltaReferencePosition = (DeltaReferencePositionDTO) o;
    return Objects.equals(this.deltaLatitude, deltaReferencePosition.deltaLatitude) &&
        Objects.equals(this.deltaLongitude, deltaReferencePosition.deltaLongitude) &&
        Objects.equals(this.deltaAltitude, deltaReferencePosition.deltaAltitude);
  }

  @Override
  public int hashCode() {
    return Objects.hash(deltaLatitude, deltaLongitude, deltaAltitude);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeltaReferencePositionDTO {\n");
    
    sb.append("    deltaLatitude: ").append(toIndentedString(deltaLatitude)).append("\n");
    sb.append("    deltaLongitude: ").append(toIndentedString(deltaLongitude)).append("\n");
    sb.append("    deltaAltitude: ").append(toIndentedString(deltaAltitude)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

