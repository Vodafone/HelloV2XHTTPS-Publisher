package step.hellopublisher.model.dto;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import step.hellopublisher.model.dto.EventDTO;
import step.hellopublisher.model.dto.ReferencePositionDTO;
import step.hellopublisher.model.dto.StationTypeDTO;
import step.hellopublisher.model.dto.TimeDTO;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * PayloadDenmDTO
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-04-26T14:15:55.316729200+02:00[Africa/Cairo]")
public class PayloadDenmDTO   {
  @JsonProperty("identifier")
  private Integer identifier;

  @JsonProperty("sequence")
  private Integer sequence;

  @JsonProperty("stationType")
  private StationTypeDTO stationType;

  @JsonProperty("referencePosition")
  private ReferencePositionDTO referencePosition;

  @JsonProperty("distance")
  private Integer distance;

  /**
   * Gets or Sets trafficDirection
   */
  public enum TrafficDirectionEnum {
    SAMEDIRECTION("sameDirection"),
    
    OPPOSITEDIRECTION("oppositeDirection"),
    
    BOTHDIRECTIONS("bothDirections"),
    
    VALUENOTUSED("valueNotUsed");

    private String value;

    TrafficDirectionEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static TrafficDirectionEnum fromValue(String value) {
      for (TrafficDirectionEnum b : TrafficDirectionEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  @JsonProperty("trafficDirection")
  private TrafficDirectionEnum trafficDirection;

  @JsonProperty("validityDuration")
  private Integer validityDuration;

  @JsonProperty("transmissionInterval")
  private Integer transmissionInterval;

  @JsonProperty("time")
  private TimeDTO time;

  @JsonProperty("event")
  private EventDTO event;

  public PayloadDenmDTO identifier(Integer identifier) {
    this.identifier = identifier;
    return this;
  }

  /**
   * Get identifier
   * @return identifier
  */
  @ApiModelProperty(example = "123456789", required = true, value = "")
  @NotNull


  public Integer getIdentifier() {
    return identifier;
  }

  public void setIdentifier(Integer identifier) {
    this.identifier = identifier;
  }

  public PayloadDenmDTO sequence(Integer sequence) {
    this.sequence = sequence;
    return this;
  }

  /**
   * Get sequence
   * @return sequence
  */
  @ApiModelProperty(example = "123", required = true, value = "")
  @NotNull


  public Integer getSequence() {
    return sequence;
  }

  public void setSequence(Integer sequence) {
    this.sequence = sequence;
  }

  public PayloadDenmDTO stationType(StationTypeDTO stationType) {
    this.stationType = stationType;
    return this;
  }

  /**
   * Get stationType
   * @return stationType
  */
  @ApiModelProperty(value = "")

  @Valid

  public StationTypeDTO getStationType() {
    return stationType;
  }

  public void setStationType(StationTypeDTO stationType) {
    this.stationType = stationType;
  }

  public PayloadDenmDTO referencePosition(ReferencePositionDTO referencePosition) {
    this.referencePosition = referencePosition;
    return this;
  }

  /**
   * Get referencePosition
   * @return referencePosition
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid

  public ReferencePositionDTO getReferencePosition() {
    return referencePosition;
  }

  public void setReferencePosition(ReferencePositionDTO referencePosition) {
    this.referencePosition = referencePosition;
  }

  public PayloadDenmDTO distance(Integer distance) {
    this.distance = distance;
    return this;
  }

  /**
   * Get distance
   * @return distance
  */
  @ApiModelProperty(example = "199", required = true, value = "")
  @NotNull


  public Integer getDistance() {
    return distance;
  }

  public void setDistance(Integer distance) {
    this.distance = distance;
  }

  public PayloadDenmDTO trafficDirection(TrafficDirectionEnum trafficDirection) {
    this.trafficDirection = trafficDirection;
    return this;
  }

  /**
   * Get trafficDirection
   * @return trafficDirection
  */
  @ApiModelProperty(example = "sameDirection", required = true, value = "")
  @NotNull


  public TrafficDirectionEnum getTrafficDirection() {
    return trafficDirection;
  }

  public void setTrafficDirection(TrafficDirectionEnum trafficDirection) {
    this.trafficDirection = trafficDirection;
  }

  public PayloadDenmDTO validityDuration(Integer validityDuration) {
    this.validityDuration = validityDuration;
    return this;
  }

  /**
   * Get validityDuration
   * minimum: 0
   * maximum: 86400
   * @return validityDuration
  */
  @ApiModelProperty(example = "40", required = true, value = "")
  @NotNull

@Min(0) @Max(86400) 
  public Integer getValidityDuration() {
    return validityDuration;
  }

  public void setValidityDuration(Integer validityDuration) {
    this.validityDuration = validityDuration;
  }

  public PayloadDenmDTO transmissionInterval(Integer transmissionInterval) {
    this.transmissionInterval = transmissionInterval;
    return this;
  }

  /**
   * Get transmissionInterval
   * minimum: 1
   * maximum: 10000
   * @return transmissionInterval
  */
  @ApiModelProperty(example = "500", required = true, value = "")
  @NotNull

@Min(1) @Max(10000) 
  public Integer getTransmissionInterval() {
    return transmissionInterval;
  }

  public void setTransmissionInterval(Integer transmissionInterval) {
    this.transmissionInterval = transmissionInterval;
  }

  public PayloadDenmDTO time(TimeDTO time) {
    this.time = time;
    return this;
  }

  /**
   * Get time
   * @return time
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid

  public TimeDTO getTime() {
    return time;
  }

  public void setTime(TimeDTO time) {
    this.time = time;
  }

  public PayloadDenmDTO event(EventDTO event) {
    this.event = event;
    return this;
  }

  /**
   * Get event
   * @return event
  */
  @ApiModelProperty(value = "")

  @Valid

  public EventDTO getEvent() {
    return event;
  }

  public void setEvent(EventDTO event) {
    this.event = event;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PayloadDenmDTO payloadDenm = (PayloadDenmDTO) o;
    return Objects.equals(this.identifier, payloadDenm.identifier) &&
        Objects.equals(this.sequence, payloadDenm.sequence) &&
        Objects.equals(this.stationType, payloadDenm.stationType) &&
        Objects.equals(this.referencePosition, payloadDenm.referencePosition) &&
        Objects.equals(this.distance, payloadDenm.distance) &&
        Objects.equals(this.trafficDirection, payloadDenm.trafficDirection) &&
        Objects.equals(this.validityDuration, payloadDenm.validityDuration) &&
        Objects.equals(this.transmissionInterval, payloadDenm.transmissionInterval) &&
        Objects.equals(this.time, payloadDenm.time) &&
        Objects.equals(this.event, payloadDenm.event);
  }

  @Override
  public int hashCode() {
    return Objects.hash(identifier, sequence, stationType, referencePosition, distance, trafficDirection, validityDuration, transmissionInterval, time, event);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PayloadDenmDTO {\n");
    
    sb.append("    identifier: ").append(toIndentedString(identifier)).append("\n");
    sb.append("    sequence: ").append(toIndentedString(sequence)).append("\n");
    sb.append("    stationType: ").append(toIndentedString(stationType)).append("\n");
    sb.append("    referencePosition: ").append(toIndentedString(referencePosition)).append("\n");
    sb.append("    distance: ").append(toIndentedString(distance)).append("\n");
    sb.append("    trafficDirection: ").append(toIndentedString(trafficDirection)).append("\n");
    sb.append("    validityDuration: ").append(toIndentedString(validityDuration)).append("\n");
    sb.append("    transmissionInterval: ").append(toIndentedString(transmissionInterval)).append("\n");
    sb.append("    time: ").append(toIndentedString(time)).append("\n");
    sb.append("    event: ").append(toIndentedString(event)).append("\n");
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

