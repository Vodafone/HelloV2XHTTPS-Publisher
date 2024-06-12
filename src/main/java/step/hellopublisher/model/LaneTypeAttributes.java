package step.hellopublisher.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import step.hellopublisher.model.LaneType;

import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * LaneTypeAttributes
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-03-29T16:13:13.074580100+02:00[Africa/Cairo]")
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.EXISTING_PROPERTY, property = "typeName", visible = true)
@JsonSubTypes({
  @JsonSubTypes.Type(value = LaneAttributesBarrier.class, name = "barrier"),
  @JsonSubTypes.Type(value = LaneAttributesBike.class, name = "bike"),
  @JsonSubTypes.Type(value = LaneAttributesCrosswalk.class, name = "crosswalk"),
  @JsonSubTypes.Type(value = LaneAttributesParking.class, name = "parking"),
  @JsonSubTypes.Type(value = LaneAttributesSidewalk.class, name = "sidewalk"),
  @JsonSubTypes.Type(value = LaneAttributesStriping.class, name = "striping"),
  @JsonSubTypes.Type(value = LaneAttributesTrackedVehicle.class, name = "trackedVehicle"),
  @JsonSubTypes.Type(value = LaneAttributesVehicle.class, name = "vehicle"),
})

public class LaneTypeAttributes   {
  @JsonProperty("typeName")
  private LaneType typeName = LaneType.VEHICLE;

  public LaneTypeAttributes typeName(LaneType typeName) {
    this.typeName = typeName;
    return this;
  }

  /**
   * Get typeName
   * @return typeName
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid

  public LaneType getTypeName() {
    return typeName;
  }

  public void setTypeName(LaneType typeName) {
    this.typeName = typeName;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LaneTypeAttributes laneTypeAttributes = (LaneTypeAttributes) o;
    return Objects.equals(this.typeName, laneTypeAttributes.typeName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(typeName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LaneTypeAttributes {\n");
    
    sb.append("    typeName: ").append(toIndentedString(typeName)).append("\n");
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

