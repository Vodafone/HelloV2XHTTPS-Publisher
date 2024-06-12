package step.hellopublisher.model.dto;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import step.hellopublisher.model.dto.GeoAddressDTO;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * MetadataDTO
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-04-26T14:15:55.316729200+02:00[Africa/Cairo]")
public class MetadataDTO   {
  @JsonProperty("restricted")
  private Boolean restricted = false;

  @JsonProperty("project")
  private String project = "";

  @JsonProperty("timestamp")
  private String timestamp;

  @JsonProperty("geoaddress")
  private GeoAddressDTO geoaddress;

  public MetadataDTO restricted(Boolean restricted) {
    this.restricted = restricted;
    return this;
  }

  /**
   * Get restricted
   * @return restricted
  */
  @ApiModelProperty(value = "")


  public Boolean getRestricted() {
    return restricted;
  }

  public void setRestricted(Boolean restricted) {
    this.restricted = restricted;
  }

  public MetadataDTO project(String project) {
    this.project = project;
    return this;
  }

  /**
   * Get project
   * @return project
  */
  @ApiModelProperty(value = "")

@Size(max = 255) 
  public String getProject() {
    return project;
  }

  public void setProject(String project) {
    this.project = project;
  }

  public MetadataDTO timestamp(String timestamp) {
    this.timestamp = timestamp;
    return this;
  }

  /**
   * Get timestamp
   * @return timestamp
  */
  @ApiModelProperty(example = "1632838789", value = "")

@Size(max = 10) 
  public String getTimestamp() {
    return timestamp;
  }

  public void setTimestamp(String timestamp) {
    this.timestamp = timestamp;
  }

  public MetadataDTO geoaddress(GeoAddressDTO geoaddress) {
    this.geoaddress = geoaddress;
    return this;
  }

  /**
   * Get geoaddress
   * @return geoaddress
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid

  public GeoAddressDTO getGeoaddress() {
    return geoaddress;
  }

  public void setGeoaddress(GeoAddressDTO geoaddress) {
    this.geoaddress = geoaddress;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MetadataDTO metadata = (MetadataDTO) o;
    return Objects.equals(this.restricted, metadata.restricted) &&
        Objects.equals(this.project, metadata.project) &&
        Objects.equals(this.timestamp, metadata.timestamp) &&
        Objects.equals(this.geoaddress, metadata.geoaddress);
  }

  @Override
  public int hashCode() {
    return Objects.hash(restricted, project, timestamp, geoaddress);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MetadataDTO {\n");
    
    sb.append("    restricted: ").append(toIndentedString(restricted)).append("\n");
    sb.append("    project: ").append(toIndentedString(project)).append("\n");
    sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
    sb.append("    geoaddress: ").append(toIndentedString(geoaddress)).append("\n");
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

