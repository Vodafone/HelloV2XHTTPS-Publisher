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
 * DeltaPositionDTO
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-04-26T14:15:55.316729200+02:00[Africa/Cairo]")
public class DeltaPositionDTO   {
  @JsonProperty("deltaLatitude")
  private Integer deltaLatitude;

  @JsonProperty("deltaLongitude")
  private Integer deltaLongitude;

  public DeltaPositionDTO deltaLatitude(Integer deltaLatitude) {
    this.deltaLatitude = deltaLatitude;
    return this;
  }

  /**
   * Get deltaLatitude
   * @return deltaLatitude
  */
  @ApiModelProperty(example = "-340", required = true, value = "")
  @NotNull


  public Integer getDeltaLatitude() {
    return deltaLatitude;
  }

  public void setDeltaLatitude(Integer deltaLatitude) {
    this.deltaLatitude = deltaLatitude;
  }

  public DeltaPositionDTO deltaLongitude(Integer deltaLongitude) {
    this.deltaLongitude = deltaLongitude;
    return this;
  }

  /**
   * Get deltaLongitude
   * @return deltaLongitude
  */
  @ApiModelProperty(example = "2345", required = true, value = "")
  @NotNull


  public Integer getDeltaLongitude() {
    return deltaLongitude;
  }

  public void setDeltaLongitude(Integer deltaLongitude) {
    this.deltaLongitude = deltaLongitude;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DeltaPositionDTO deltaPosition = (DeltaPositionDTO) o;
    return Objects.equals(this.deltaLatitude, deltaPosition.deltaLatitude) &&
        Objects.equals(this.deltaLongitude, deltaPosition.deltaLongitude);
  }

  @Override
  public int hashCode() {
    return Objects.hash(deltaLatitude, deltaLongitude);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeltaPositionDTO {\n");
    
    sb.append("    deltaLatitude: ").append(toIndentedString(deltaLatitude)).append("\n");
    sb.append("    deltaLongitude: ").append(toIndentedString(deltaLongitude)).append("\n");
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

