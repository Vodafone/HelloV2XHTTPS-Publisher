package step.hellopublisher.model.dto;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ServiceCategoryDTO
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-04-26T14:15:55.316729200+02:00[Africa/Cairo]")
public class ServiceCategoryDTO   {
  /**
   * Gets or Sets type
   */
  public enum TypeEnum {
    TRAFFICSIGN("TrafficSign"),
    
    PUBLICFACILITIES("PublicFacilities"),
    
    AMBIENTORROADCONDITION("AmbientOrRoadCondition");

    private String value;

    TypeEnum(String value) {
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
    public static TypeEnum fromValue(String value) {
      for (TypeEnum b : TypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  @JsonProperty("type")
  private TypeEnum type;

  /**
   * Gets or Sets traffic
   */
  public enum TrafficEnum {
    DANGERWARNING("dangerWarning"),
    
    REGULATORY("regulatory"),
    
    INFORMATIVE("informative");

    private String value;

    TrafficEnum(String value) {
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
    public static TrafficEnum fromValue(String value) {
      for (TrafficEnum b : TrafficEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  @JsonProperty("traffic")
  private TrafficEnum traffic = TrafficEnum.DANGERWARNING;

  /**
   * Gets or Sets publicFacilities
   */
  public enum PublicFacilitiesEnum {
    PUBLICFACILITIES("publicFacilities");

    private String value;

    PublicFacilitiesEnum(String value) {
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
    public static PublicFacilitiesEnum fromValue(String value) {
      for (PublicFacilitiesEnum b : PublicFacilitiesEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  @JsonProperty("publicFacilities")
  private PublicFacilitiesEnum publicFacilities = PublicFacilitiesEnum.PUBLICFACILITIES;

  /**
   * Gets or Sets ambienteOrRoadConditions
   */
  public enum AmbienteOrRoadConditionsEnum {
    AMBIENTCONDITION("ambientCondition"),
    
    ROADCONDITION("roadCondition");

    private String value;

    AmbienteOrRoadConditionsEnum(String value) {
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
    public static AmbienteOrRoadConditionsEnum fromValue(String value) {
      for (AmbienteOrRoadConditionsEnum b : AmbienteOrRoadConditionsEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  @JsonProperty("ambienteOrRoadConditions")
  private AmbienteOrRoadConditionsEnum ambienteOrRoadConditions = AmbienteOrRoadConditionsEnum.AMBIENTCONDITION;

  public ServiceCategoryDTO type(TypeEnum type) {
    this.type = type;
    return this;
  }

  /**
   * Get type
   * @return type
  */
  @ApiModelProperty(example = "TrafficSign", required = true, value = "")
  @NotNull


  public TypeEnum getType() {
    return type;
  }

  public void setType(TypeEnum type) {
    this.type = type;
  }

  public ServiceCategoryDTO traffic(TrafficEnum traffic) {
    this.traffic = traffic;
    return this;
  }

  /**
   * Get traffic
   * @return traffic
  */
  @ApiModelProperty(example = "dangerWarning", value = "")


  public TrafficEnum getTraffic() {
    return traffic;
  }

  public void setTraffic(TrafficEnum traffic) {
    this.traffic = traffic;
  }

  public ServiceCategoryDTO publicFacilities(PublicFacilitiesEnum publicFacilities) {
    this.publicFacilities = publicFacilities;
    return this;
  }

  /**
   * Get publicFacilities
   * @return publicFacilities
  */
  @ApiModelProperty(example = "publicFacilities", value = "")


  public PublicFacilitiesEnum getPublicFacilities() {
    return publicFacilities;
  }

  public void setPublicFacilities(PublicFacilitiesEnum publicFacilities) {
    this.publicFacilities = publicFacilities;
  }

  public ServiceCategoryDTO ambienteOrRoadConditions(AmbienteOrRoadConditionsEnum ambienteOrRoadConditions) {
    this.ambienteOrRoadConditions = ambienteOrRoadConditions;
    return this;
  }

  /**
   * Get ambienteOrRoadConditions
   * @return ambienteOrRoadConditions
  */
  @ApiModelProperty(example = "ambientCondition", value = "")


  public AmbienteOrRoadConditionsEnum getAmbienteOrRoadConditions() {
    return ambienteOrRoadConditions;
  }

  public void setAmbienteOrRoadConditions(AmbienteOrRoadConditionsEnum ambienteOrRoadConditions) {
    this.ambienteOrRoadConditions = ambienteOrRoadConditions;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ServiceCategoryDTO serviceCategory = (ServiceCategoryDTO) o;
    return Objects.equals(this.type, serviceCategory.type) &&
        Objects.equals(this.traffic, serviceCategory.traffic) &&
        Objects.equals(this.publicFacilities, serviceCategory.publicFacilities) &&
        Objects.equals(this.ambienteOrRoadConditions, serviceCategory.ambienteOrRoadConditions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, traffic, publicFacilities, ambienteOrRoadConditions);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ServiceCategoryDTO {\n");
    
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    traffic: ").append(toIndentedString(traffic)).append("\n");
    sb.append("    publicFacilities: ").append(toIndentedString(publicFacilities)).append("\n");
    sb.append("    ambienteOrRoadConditions: ").append(toIndentedString(ambienteOrRoadConditions)).append("\n");
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

