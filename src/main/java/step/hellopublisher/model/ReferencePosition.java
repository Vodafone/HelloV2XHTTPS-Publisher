package step.hellopublisher.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ReferencePosition
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-03-29T16:13:13.074580100+02:00[Africa/Cairo]")
public class ReferencePosition   {
  @JsonProperty("heading")
  private Integer heading;

  @JsonProperty("speed")
  private Integer speed;

  @JsonProperty("latitude")
  private Double latitude;

  @JsonProperty("longitude")
  private Double longitude;

  @JsonProperty("altitude")
  private Float altitude;

  public ReferencePosition heading(Integer heading) {
    this.heading = heading;
    return this;
  }

  /**
   * Get heading
   * minimum: 0
   * maximum: 3600
   * @return heading
  */
  @ApiModelProperty(example = "10", value = "")

@Min(0) @Max(3600) 
  public Integer getHeading() {
    return heading;
  }

  public void setHeading(Integer heading) {
    this.heading = heading;
  }

  public ReferencePosition speed(Integer speed) {
    this.speed = speed;
    return this;
  }

  /**
   * Get speed
   * minimum: 0
   * maximum: 16383
   * @return speed
  */
  @ApiModelProperty(example = "10", value = "")

@Min(0) @Max(16383) 
  public Integer getSpeed() {
    return speed;
  }

  public void setSpeed(Integer speed) {
    this.speed = speed;
  }

  public ReferencePosition latitude(Double latitude) {
    this.latitude = latitude;
    return this;
  }

  /**
   * Get latitude
   * minimum: -90.0
   * maximum: 90.0
   * @return latitude
  */
  @ApiModelProperty(example = "43.6640935", required = true, value = "")
  @NotNull

@DecimalMin("-90.0") @DecimalMax("90.0") 
  public Double getLatitude() {
    return latitude;
  }

  public void setLatitude(Double latitude) {
    this.latitude = latitude;
  }

  public ReferencePosition longitude(Double longitude) {
    this.longitude = longitude;
    return this;
  }

  /**
   * Get longitude
   * minimum: -180.0
   * maximum: 180.0
   * @return longitude
  */
  @ApiModelProperty(example = "6.9321627", required = true, value = "")
  @NotNull

@DecimalMin("-180.0") @DecimalMax("180.0") 
  public Double getLongitude() {
    return longitude;
  }

  public void setLongitude(Double longitude) {
    this.longitude = longitude;
  }

  public ReferencePosition altitude(Float altitude) {
    this.altitude = altitude;
    return this;
  }

  /**
   * Get altitude
   * minimum: -100000
   * maximum: 800001
   * @return altitude
  */
  @ApiModelProperty(example = "30.205", required = true, value = "")
  @NotNull

@DecimalMin("-100000") @DecimalMax("800001") 
  public Float getAltitude() {
    return altitude;
  }

  public void setAltitude(Float altitude) {
    this.altitude = altitude;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReferencePosition referencePosition = (ReferencePosition) o;
    return Objects.equals(this.heading, referencePosition.heading) &&
        Objects.equals(this.speed, referencePosition.speed) &&
        Objects.equals(this.latitude, referencePosition.latitude) &&
        Objects.equals(this.longitude, referencePosition.longitude) &&
        Objects.equals(this.altitude, referencePosition.altitude);
  }

  @Override
  public int hashCode() {
    return Objects.hash(heading, speed, latitude, longitude, altitude);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReferencePosition {\n");
    
    sb.append("    heading: ").append(toIndentedString(heading)).append("\n");
    sb.append("    speed: ").append(toIndentedString(speed)).append("\n");
    sb.append("    latitude: ").append(toIndentedString(latitude)).append("\n");
    sb.append("    longitude: ").append(toIndentedString(longitude)).append("\n");
    sb.append("    altitude: ").append(toIndentedString(altitude)).append("\n");
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

