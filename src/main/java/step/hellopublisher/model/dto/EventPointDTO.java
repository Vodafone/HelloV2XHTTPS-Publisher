package step.hellopublisher.model.dto;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import step.hellopublisher.model.dto.DeltaReferencePositionDTO;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * EventPointDTO
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-04-26T14:15:55.316729200+02:00[Africa/Cairo]")
public class EventPointDTO   {
  @JsonProperty("deltaPosition")
  private DeltaReferencePositionDTO deltaPosition;

  @JsonProperty("deltaTime")
  private BigDecimal deltaTime;

  @JsonProperty("informationQuality")
  private Integer informationQuality;

  public EventPointDTO deltaPosition(DeltaReferencePositionDTO deltaPosition) {
    this.deltaPosition = deltaPosition;
    return this;
  }

  /**
   * Get deltaPosition
   * @return deltaPosition
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid

  public DeltaReferencePositionDTO getDeltaPosition() {
    return deltaPosition;
  }

  public void setDeltaPosition(DeltaReferencePositionDTO deltaPosition) {
    this.deltaPosition = deltaPosition;
  }

  public EventPointDTO deltaTime(BigDecimal deltaTime) {
    this.deltaTime = deltaTime;
    return this;
  }

  /**
   * Get deltaTime
   * @return deltaTime
  */
  @ApiModelProperty(example = "1606733817", value = "")

  @Valid

  public BigDecimal getDeltaTime() {
    return deltaTime;
  }

  public void setDeltaTime(BigDecimal deltaTime) {
    this.deltaTime = deltaTime;
  }

  public EventPointDTO informationQuality(Integer informationQuality) {
    this.informationQuality = informationQuality;
    return this;
  }

  /**
   * Get informationQuality
   * minimum: 0
   * maximum: 7
   * @return informationQuality
  */
  @ApiModelProperty(example = "5", required = true, value = "")
  @NotNull

@Min(0) @Max(7) 
  public Integer getInformationQuality() {
    return informationQuality;
  }

  public void setInformationQuality(Integer informationQuality) {
    this.informationQuality = informationQuality;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EventPointDTO eventPoint = (EventPointDTO) o;
    return Objects.equals(this.deltaPosition, eventPoint.deltaPosition) &&
        Objects.equals(this.deltaTime, eventPoint.deltaTime) &&
        Objects.equals(this.informationQuality, eventPoint.informationQuality);
  }

  @Override
  public int hashCode() {
    return Objects.hash(deltaPosition, deltaTime, informationQuality);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EventPointDTO {\n");
    
    sb.append("    deltaPosition: ").append(toIndentedString(deltaPosition)).append("\n");
    sb.append("    deltaTime: ").append(toIndentedString(deltaTime)).append("\n");
    sb.append("    informationQuality: ").append(toIndentedString(informationQuality)).append("\n");
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

