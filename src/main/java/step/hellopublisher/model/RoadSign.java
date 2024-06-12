package step.hellopublisher.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import step.hellopublisher.model.PictogramCategory;

import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * RoadSign
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-03-29T16:13:13.074580100+02:00[Africa/Cairo]")
public class RoadSign   {
  @JsonProperty("countryCode")
  private String countryCode;

  @JsonProperty("serviceCategory")
  private Object serviceCategory = null;

  @JsonProperty("pictogramCategory")
  private PictogramCategory pictogramCategory;

  public RoadSign countryCode(String countryCode) {
    this.countryCode = countryCode;
    return this;
  }

  /**
   * Get countryCode
   * @return countryCode
  */
  @ApiModelProperty(example = "GB", required = true, value = "")
  @NotNull

@Pattern(regexp = "^[A-Z]{2}$") @Size(min = 2, max = 2) 
  public String getCountryCode() {
    return countryCode;
  }

  public void setCountryCode(String countryCode) {
    this.countryCode = countryCode;
  }

  public RoadSign serviceCategory(Object serviceCategory) {
    this.serviceCategory = serviceCategory;
    return this;
  }

  /**
   * Get serviceCategory
   * @return serviceCategory
  */
  @ApiModelProperty(value = "")


  public Object getServiceCategory() {
    return serviceCategory;
  }

  public void setServiceCategory(Object serviceCategory) {
    this.serviceCategory = serviceCategory;
  }

  public RoadSign pictogramCategory(PictogramCategory pictogramCategory) {
    this.pictogramCategory = pictogramCategory;
    return this;
  }

  /**
   * Get pictogramCategory
   * @return pictogramCategory
  */
  @ApiModelProperty(value = "")

  @Valid

  public PictogramCategory getPictogramCategory() {
    return pictogramCategory;
  }

  public void setPictogramCategory(PictogramCategory pictogramCategory) {
    this.pictogramCategory = pictogramCategory;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RoadSign roadSign = (RoadSign) o;
    return Objects.equals(this.countryCode, roadSign.countryCode) &&
        Objects.equals(this.serviceCategory, roadSign.serviceCategory) &&
        Objects.equals(this.pictogramCategory, roadSign.pictogramCategory);
  }

  @Override
  public int hashCode() {
    return Objects.hash(countryCode, serviceCategory, pictogramCategory);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RoadSign {\n");
    
    sb.append("    countryCode: ").append(toIndentedString(countryCode)).append("\n");
    sb.append("    serviceCategory: ").append(toIndentedString(serviceCategory)).append("\n");
    sb.append("    pictogramCategory: ").append(toIndentedString(pictogramCategory)).append("\n");
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

