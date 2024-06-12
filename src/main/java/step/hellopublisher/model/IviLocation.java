package step.hellopublisher.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import step.hellopublisher.model.RoadSign;

import java.util.ArrayList;
import java.util.List;

import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * IviLocation
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-03-29T16:13:13.074580100+02:00[Africa/Cairo]")
public class IviLocation   {
  @JsonProperty("detectionZones")
  @Valid
  private List<Integer> detectionZones = new ArrayList<>();

  @JsonProperty("relevanceZones")
  @Valid
  private List<Integer> relevanceZones = new ArrayList<>();

  @JsonProperty("applicableLanes")
  @Valid
  private List<Integer> applicableLanes = new ArrayList<>();

  @JsonProperty("roadSigns")
  @Valid
  private List<RoadSign> roadSigns = new ArrayList<>();

  @JsonProperty("direction")
  private Integer direction;

  @JsonProperty("type")
  private Integer type;

  public IviLocation detectionZones(List<Integer> detectionZones) {
    this.detectionZones = detectionZones;
    return this;
  }

  public IviLocation addDetectionZonesItem(Integer detectionZonesItem) {
    this.detectionZones.add(detectionZonesItem);
    return this;
  }

  /**
   * Get detectionZones
   * @return detectionZones
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull


  public List<Integer> getDetectionZones() {
    return detectionZones;
  }

  public void setDetectionZones(List<Integer> detectionZones) {
    this.detectionZones = detectionZones;
  }

  public IviLocation relevanceZones(List<Integer> relevanceZones) {
    this.relevanceZones = relevanceZones;
    return this;
  }

  public IviLocation addRelevanceZonesItem(Integer relevanceZonesItem) {
    this.relevanceZones.add(relevanceZonesItem);
    return this;
  }

  /**
   * Get relevanceZones
   * @return relevanceZones
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull


  public List<Integer> getRelevanceZones() {
    return relevanceZones;
  }

  public void setRelevanceZones(List<Integer> relevanceZones) {
    this.relevanceZones = relevanceZones;
  }

  public IviLocation applicableLanes(List<Integer> applicableLanes) {
    this.applicableLanes = applicableLanes;
    return this;
  }

  public IviLocation addApplicableLanesItem(Integer applicableLanesItem) {
    this.applicableLanes.add(applicableLanesItem);
    return this;
  }

  /**
   * Get applicableLanes
   * @return applicableLanes
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull


  public List<Integer> getApplicableLanes() {
    return applicableLanes;
  }

  public void setApplicableLanes(List<Integer> applicableLanes) {
    this.applicableLanes = applicableLanes;
  }

  public IviLocation roadSigns(List<RoadSign> roadSigns) {
    this.roadSigns = roadSigns;
    return this;
  }

  public IviLocation addRoadSignsItem(RoadSign roadSignsItem) {
    this.roadSigns.add(roadSignsItem);
    return this;
  }

  /**
   * Get roadSigns
   * @return roadSigns
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid

  public List<RoadSign> getRoadSigns() {
    return roadSigns;
  }

  public void setRoadSigns(List<RoadSign> roadSigns) {
    this.roadSigns = roadSigns;
  }

  public IviLocation direction(Integer direction) {
    this.direction = direction;
    return this;
  }

  /**
   * Get direction
   * @return direction
  */
  @ApiModelProperty(example = "1", required = true, value = "")
  @NotNull


  public Integer getDirection() {
    return direction;
  }

  public void setDirection(Integer direction) {
    this.direction = direction;
  }

  public IviLocation type(Integer type) {
    this.type = type;
    return this;
  }

  /**
   * Get type
   * @return type
  */
  @ApiModelProperty(example = "0", required = true, value = "")
  @NotNull


  public Integer getType() {
    return type;
  }

  public void setType(Integer type) {
    this.type = type;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IviLocation iviLocation = (IviLocation) o;
    return Objects.equals(this.detectionZones, iviLocation.detectionZones) &&
        Objects.equals(this.relevanceZones, iviLocation.relevanceZones) &&
        Objects.equals(this.applicableLanes, iviLocation.applicableLanes) &&
        Objects.equals(this.roadSigns, iviLocation.roadSigns) &&
        Objects.equals(this.direction, iviLocation.direction) &&
        Objects.equals(this.type, iviLocation.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(detectionZones, relevanceZones, applicableLanes, roadSigns, direction, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IviLocation {\n");
    
    sb.append("    detectionZones: ").append(toIndentedString(detectionZones)).append("\n");
    sb.append("    relevanceZones: ").append(toIndentedString(relevanceZones)).append("\n");
    sb.append("    applicableLanes: ").append(toIndentedString(applicableLanes)).append("\n");
    sb.append("    roadSigns: ").append(toIndentedString(roadSigns)).append("\n");
    sb.append("    direction: ").append(toIndentedString(direction)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

