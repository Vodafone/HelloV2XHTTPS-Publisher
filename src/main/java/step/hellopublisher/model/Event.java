package step.hellopublisher.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import step.hellopublisher.model.Cause;
import step.hellopublisher.model.EventPoint;
import step.hellopublisher.model.PathPoint;
import step.hellopublisher.model.RoadType;

import java.util.ArrayList;
import java.util.List;

import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Event
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-03-29T16:13:13.074580100+02:00[Africa/Cairo]")
public class Event   {
  @JsonProperty("heading")
  private Integer heading;

  @JsonProperty("speed")
  private Integer speed;

  @JsonProperty("roadType")
  private RoadType roadType;

  @JsonProperty("eventCause")
  private Cause eventCause;

  @JsonProperty("linkedEventCause")
  private Cause linkedEventCause;

  @JsonProperty("eventHistory")
  @Valid
  private List<EventPoint> eventHistory = null;

  @JsonProperty("traces")
  @Valid
  private List<List<PathPoint>> traces = null;

  @JsonProperty("informationQuality")
  private Integer informationQuality;

  public Event heading(Integer heading) {
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

  public Event speed(Integer speed) {
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

  public Event roadType(RoadType roadType) {
    this.roadType = roadType;
    return this;
  }

  /**
   * Get roadType
   * @return roadType
  */
  @ApiModelProperty(value = "")

  @Valid

  public RoadType getRoadType() {
    return roadType;
  }

  public void setRoadType(RoadType roadType) {
    this.roadType = roadType;
  }

  public Event eventCause(Cause eventCause) {
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

  public Cause getEventCause() {
    return eventCause;
  }

  public void setEventCause(Cause eventCause) {
    this.eventCause = eventCause;
  }

  public Event linkedEventCause(Cause linkedEventCause) {
    this.linkedEventCause = linkedEventCause;
    return this;
  }

  /**
   * Get linkedEventCause
   * @return linkedEventCause
  */
  @ApiModelProperty(value = "")

  @Valid

  public Cause getLinkedEventCause() {
    return linkedEventCause;
  }

  public void setLinkedEventCause(Cause linkedEventCause) {
    this.linkedEventCause = linkedEventCause;
  }

  public Event eventHistory(List<EventPoint> eventHistory) {
    this.eventHistory = eventHistory;
    return this;
  }

  public Event addEventHistoryItem(EventPoint eventHistoryItem) {
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

  public List<EventPoint> getEventHistory() {
    return eventHistory;
  }

  public void setEventHistory(List<EventPoint> eventHistory) {
    this.eventHistory = eventHistory;
  }

  public Event traces(List<List<PathPoint>> traces) {
    this.traces = traces;
    return this;
  }

  public Event addTracesItem(List<PathPoint> tracesItem) {
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

  public List<List<PathPoint>> getTraces() {
    return traces;
  }

  public void setTraces(List<List<PathPoint>> traces) {
    this.traces = traces;
  }

  public Event informationQuality(Integer informationQuality) {
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
    Event event = (Event) o;
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
    sb.append("class Event {\n");
    
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

