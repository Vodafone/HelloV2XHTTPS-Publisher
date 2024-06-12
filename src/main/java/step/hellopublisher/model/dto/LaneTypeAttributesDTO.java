package step.hellopublisher.model.dto;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import step.hellopublisher.model.dto.LaneTypeDTO;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * LaneTypeAttributesDTO
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-04-26T14:15:55.316729200+02:00[Africa/Cairo]")
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.EXISTING_PROPERTY, property = "typeName", visible = true)
@JsonSubTypes({
  @JsonSubTypes.Type(value = LaneAttributesBarrierDTO.class, name = "barrier"),
  @JsonSubTypes.Type(value = LaneAttributesBikeDTO.class, name = "bike"),
  @JsonSubTypes.Type(value = LaneAttributesCrosswalkDTO.class, name = "crosswalk"),
  @JsonSubTypes.Type(value = LaneAttributesParkingDTO.class, name = "parking"),
  @JsonSubTypes.Type(value = LaneAttributesSidewalkDTO.class, name = "sidewalk"),
  @JsonSubTypes.Type(value = LaneAttributesStripingDTO.class, name = "striping"),
  @JsonSubTypes.Type(value = LaneAttributesTrackedVehicleDTO.class, name = "trackedVehicle"),
  @JsonSubTypes.Type(value = LaneAttributesVehicleDTO.class, name = "vehicle"),
})

public class LaneTypeAttributesDTO   {
  @JsonProperty("typeName")
  private LaneTypeDTO typeName = LaneTypeDTO.VEHICLE;

  public LaneTypeAttributesDTO typeName(LaneTypeDTO typeName) {
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

  public LaneTypeDTO getTypeName() {
    return typeName;
  }

  public void setTypeName(LaneTypeDTO typeName) {
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
    LaneTypeAttributesDTO laneTypeAttributes = (LaneTypeAttributesDTO) o;
    return Objects.equals(this.typeName, laneTypeAttributes.typeName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(typeName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LaneTypeAttributesDTO {\n");
    
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

