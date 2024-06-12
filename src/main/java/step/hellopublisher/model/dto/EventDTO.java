package step.hellopublisher.model.dto;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import step.hellopublisher.model.dto.CauseDTO;
import step.hellopublisher.model.dto.EventPointDTO;
import step.hellopublisher.model.dto.PathPointDTO;
import step.hellopublisher.model.dto.RoadTypeDTO;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * EventDTO
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-04-26T14:15:55.316729200+02:00[Africa/Cairo]")
public class EventDTO   {
  @JsonProperty("heading")
  private Integer heading;

  @JsonProperty("speed")
  private Integer speed;

  @JsonProperty("roadType")
  private RoadTypeDTO roadType;

  @JsonProperty("eventCause")
  private CauseDTO eventCause;

  @JsonProperty("linkedEventCause")
  private CauseDTO linkedEventCause;

  @JsonProperty("eventHistory")
  @Valid
  private List<EventPointDTO> eventHistory = null;

  @JsonProperty("traces")
  @Valid
  private List<List<PathPointDTO>> traces = null;

  @JsonProperty("informationQuality")
  private Integer informationQuality;

  public EventDTO heading(Integer heading) {
    this.heading = heading;
    return this;
  }

  /**
   * Get heading
   * minimum: 0
   * maximum: 3600
   * @return heading
  */
  @ApiModelProperty(example = "10", required = true, value = "")
  @NotNull

@Min(0) @Max(3600) 
  public Integer getHeading() {
    return heading;
  }

  public void setHeading(Integer heading) {
    this.heading = heading;
  }

  public EventDTO speed(Integer speed) {
    this.speed = speed;
    return this;
  }

  /**
   * Get speed
   * minimum: 0
   * maximum: 16383
   * @return speed
  */
  @ApiModelProperty(example = "10", required = true, value = "")
  @NotNull

@Min(0) @Max(16383) 
  public Integer getSpeed() {
    return speed;
  }

  public void setSpeed(Integer speed) {
    this.speed = speed;
  }

  public EventDTO roadType(RoadTypeDTO roadType) {
    this.roadType = roadType;
    return this;
  }

  /**
   * Get roadType
   * @return roadType
  */
  @ApiModelProperty(value = "")

  @Valid

  public RoadTypeDTO getRoadType() {
    return roadType;
  }

  public void setRoadType(RoadTypeDTO roadType) {
    this.roadType = roadType;
  }

  public EventDTO eventCause(CauseDTO eventCause) {
    this.eventCause = eventCause;
    return this;
  }

  /**
   * Get eventCause
   * @return eventCause
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid

  public CauseDTO getEventCause() {
    return eventCause;
  }

  public void setEventCause(CauseDTO eventCause) {
    this.eventCause = eventCause;
  }

  public EventDTO linkedEventCause(CauseDTO linkedEventCause) {
    this.linkedEventCause = linkedEventCause;
    return this;
  }

  /**
   * Get linkedEventCause
   * @return linkedEventCause
  */
  @ApiModelProperty(value = "")

  @Valid

  public CauseDTO getLinkedEventCause() {
    return linkedEventCause;
  }

  public void setLinkedEventCause(CauseDTO linkedEventCause) {
    this.linkedEventCause = linkedEventCause;
  }

  public EventDTO eventHistory(List<EventPointDTO> eventHistory) {
    this.eventHistory = eventHistory;
    return this;
  }

  public EventDTO addEventHistoryItem(EventPointDTO eventHistoryItem) {
    if (this.eventHistory == null) {
      this.eventHistory = new ArrayList<>();
    }
    this.eventHistory.add(eventHistoryItem);
    return this;
  }

  /**
   * Get eventHistory
   * @return eventHistory
  */
  @ApiModelProperty(value = "")

  @Valid

  public List<EventPointDTO> getEventHistory() {
    return eventHistory;
  }

  public void setEventHistory(List<EventPointDTO> eventHistory) {
    this.eventHistory = eventHistory;
  }

  public EventDTO traces(List<List<PathPointDTO>> traces) {
    this.traces = traces;
    return this;
  }

  public EventDTO addTracesItem(List<PathPointDTO> tracesItem) {
    if (this.traces == null) {
      this.traces = new ArrayList<>();
    }
    this.traces.add(tracesItem);
    return this;
  }

  /**
   * Get traces
   * @return traces
  */
  @ApiModelProperty(value = "")

  @Valid

  public List<List<PathPointDTO>> getTraces() {
    return traces;
  }

  public void setTraces(List<List<PathPointDTO>> traces) {
    this.traces = traces;
  }

  public EventDTO informationQuality(Integer informationQuality) {
    this.informationQuality = informationQuality;
    return this;
  }

  /**
   * Get informationQuality
   * minimum: 0
   * maximum: 7
   * @return informationQuality
  */
  @ApiModelProperty(example = "5", value = "")

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
    EventDTO event = (EventDTO) o;
    return Objects.equals(this.heading, event.heading) &&
        Objects.equals(this.speed, event.speed) &&
        Objects.equals(this.roadType, event.roadType) &&
        Objects.equals(this.eventCause, event.eventCause) &&
        Objects.equals(this.linkedEventCause, event.linkedEventCause) &&
        Objects.equals(this.eventHistory, event.eventHistory) &&
        Objects.equals(this.traces, event.traces) &&
        Objects.equals(this.informationQuality, event.informationQuality);
  }

  @Override
  public int hashCode() {
    return Objects.hash(heading, speed, roadType, eventCause, linkedEventCause, eventHistory, traces, informationQuality);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EventDTO {\n");
    
    sb.append("    heading: ").append(toIndentedString(heading)).append("\n");
    sb.append("    speed: ").append(toIndentedString(speed)).append("\n");
    sb.append("    roadType: ").append(toIndentedString(roadType)).append("\n");
    sb.append("    eventCause: ").append(toIndentedString(eventCause)).append("\n");
    sb.append("    linkedEventCause: ").append(toIndentedString(linkedEventCause)).append("\n");
    sb.append("    eventHistory: ").append(toIndentedString(eventHistory)).append("\n");
    sb.append("    traces: ").append(toIndentedString(traces)).append("\n");
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

