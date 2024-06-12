package step.hellopublisher.model.dto;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import step.hellopublisher.model.dto.PictogramCategoryDTO;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * RoadSignDTO
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-04-26T14:15:55.316729200+02:00[Africa/Cairo]")
public class RoadSignDTO   {
  @JsonProperty("countryCode")
  private String countryCode;

  @JsonProperty("serviceCategory")
  private Object serviceCategory = null;

  @JsonProperty("pictogramCategory")
  private PictogramCategoryDTO pictogramCategory;

  public RoadSignDTO countryCode(String countryCode) {
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

  public RoadSignDTO serviceCategory(Object serviceCategory) {
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

  public RoadSignDTO pictogramCategory(PictogramCategoryDTO pictogramCategory) {
    this.pictogramCategory = pictogramCategory;
    return this;
  }

  /**
   * Get pictogramCategory
   * @return pictogramCategory
  */
  @ApiModelProperty(value = "")

  @Valid

  public PictogramCategoryDTO getPictogramCategory() {
    return pictogramCategory;
  }

  public void setPictogramCategory(PictogramCategoryDTO pictogramCategory) {
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
    RoadSignDTO roadSign = (RoadSignDTO) o;
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
    sb.append("class RoadSignDTO {\n");
    
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

