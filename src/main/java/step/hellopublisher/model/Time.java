package step.hellopublisher.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Time
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-03-29T16:13:13.074580100+02:00[Africa/Cairo]")
public class Time   {
  @JsonProperty("detectionTime")
  private BigDecimal detectionTime;

  @JsonProperty("referenceTime")
  private BigDecimal referenceTime;

  public Time detectionTime(BigDecimal detectionTime) {
    this.detectionTime = detectionTime;
    return this;
  }

  /**
   * Get detectionTime
   * @return detectionTime
  */
  @ApiModelProperty(example = "1606733817", required = true, value = "")
  @NotNull

  @Valid

  public BigDecimal getDetectionTime() {
    return detectionTime;
  }

  public void setDetectionTime(BigDecimal detectionTime) {
    this.detectionTime = detectionTime;
  }

  public Time referenceTime(BigDecimal referenceTime) {
    this.referenceTime = referenceTime;
    return this;
  }

  /**
   * Get referenceTime
   * @return referenceTime
  */
  @ApiModelProperty(example = "1635587817", required = true, value = "")
  @NotNull

  @Valid

  public BigDecimal getReferenceTime() {
    return referenceTime;
  }

  public void setReferenceTime(BigDecimal referenceTime) {
    this.referenceTime = referenceTime;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Time time = (Time) o;
    return Objects.equals(this.detectionTime, time.detectionTime) &&
        Objects.equals(this.referenceTime, time.referenceTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(detectionTime, referenceTime);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Time {\n");
    
    sb.append("    detectionTime: ").append(toIndentedString(detectionTime)).append("\n");
    sb.append("    referenceTime: ").append(toIndentedString(referenceTime)).append("\n");
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

