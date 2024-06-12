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
 * PictogramCategoryDTO
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-04-26T14:15:55.316729200+02:00[Africa/Cairo]")
public class PictogramCategoryDTO   {
  @JsonProperty("nature")
  private Integer nature;

  @JsonProperty("serialNumber")
  private Integer serialNumber;

  public PictogramCategoryDTO nature(Integer nature) {
    this.nature = nature;
    return this;
  }

  /**
   * Get nature
   * @return nature
  */
  @ApiModelProperty(example = "9", required = true, value = "")
  @NotNull


  public Integer getNature() {
    return nature;
  }

  public void setNature(Integer nature) {
    this.nature = nature;
  }

  public PictogramCategoryDTO serialNumber(Integer serialNumber) {
    this.serialNumber = serialNumber;
    return this;
  }

  /**
   * Get serialNumber
   * @return serialNumber
  */
  @ApiModelProperty(example = "53", required = true, value = "")
  @NotNull


  public Integer getSerialNumber() {
    return serialNumber;
  }

  public void setSerialNumber(Integer serialNumber) {
    this.serialNumber = serialNumber;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PictogramCategoryDTO pictogramCategory = (PictogramCategoryDTO) o;
    return Objects.equals(this.nature, pictogramCategory.nature) &&
        Objects.equals(this.serialNumber, pictogramCategory.serialNumber);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nature, serialNumber);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PictogramCategoryDTO {\n");
    
    sb.append("    nature: ").append(toIndentedString(nature)).append("\n");
    sb.append("    serialNumber: ").append(toIndentedString(serialNumber)).append("\n");
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

