package step.hellopublisher.model.dto;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * GeoAddressDTO
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-04-26T14:15:55.316729200+02:00[Africa/Cairo]")
public class GeoAddressDTO   {
  @JsonProperty("lat")
  private Double lat;

  @JsonProperty("lon")
  private Double lon;

  public GeoAddressDTO lat(Double lat) {
    this.lat = lat;
    return this;
  }

  /**
   * Get lat
   * minimum: -90.0
   * maximum: 90.0
   * @return lat
  */
  @ApiModelProperty(example = "43.6640935", required = true, value = "")
  @NotNull

@DecimalMin("-90.0") @DecimalMax("90.0") 
  public Double getLat() {
    return lat;
  }

  public void setLat(Double lat) {
    this.lat = lat;
  }

  public GeoAddressDTO lon(Double lon) {
    this.lon = lon;
    return this;
  }

  /**
   * Get lon
   * minimum: -180.0
   * maximum: 180.0
   * @return lon
  */
  @ApiModelProperty(example = "6.9321627", required = true, value = "")
  @NotNull

@DecimalMin("-180.0") @DecimalMax("180.0") 
  public Double getLon() {
    return lon;
  }

  public void setLon(Double lon) {
    this.lon = lon;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GeoAddressDTO geoAddress = (GeoAddressDTO) o;
    return Objects.equals(this.lat, geoAddress.lat) &&
        Objects.equals(this.lon, geoAddress.lon);
  }

  @Override
  public int hashCode() {
    return Objects.hash(lat, lon);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GeoAddressDTO {\n");
    
    sb.append("    lat: ").append(toIndentedString(lat)).append("\n");
    sb.append("    lon: ").append(toIndentedString(lon)).append("\n");
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

