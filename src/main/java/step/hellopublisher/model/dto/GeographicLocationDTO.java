package step.hellopublisher.model.dto;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import step.hellopublisher.model.dto.DeltaPositionDTO;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * GeographicLocationDTO
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-04-26T14:15:55.316729200+02:00[Africa/Cairo]")
public class GeographicLocationDTO   {
  @JsonProperty("id")
  private Integer id;

  @JsonProperty("heading")
  private Integer heading;

  @JsonProperty("line")
  @Valid
  private List<DeltaPositionDTO> line = null;

  public GeographicLocationDTO id(Integer id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
  */
  @ApiModelProperty(example = "123456789", required = true, value = "")
  @NotNull


  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public GeographicLocationDTO heading(Integer heading) {
    this.heading = heading;
    return this;
  }

  /**
   * Get heading
   * @return heading
  */
  @ApiModelProperty(example = "2345", required = true, value = "")
  @NotNull


  public Integer getHeading() {
    return heading;
  }

  public void setHeading(Integer heading) {
    this.heading = heading;
  }

  public GeographicLocationDTO line(List<DeltaPositionDTO> line) {
    this.line = line;
    return this;
  }

  public GeographicLocationDTO addLineItem(DeltaPositionDTO lineItem) {
    if (this.line == null) {
      this.line = new ArrayList<>();
    }
    this.line.add(lineItem);
    return this;
  }

  /**
   * Get line
   * @return line
  */
  @ApiModelProperty(value = "")

  @Valid

  public List<DeltaPositionDTO> getLine() {
    return line;
  }

  public void setLine(List<DeltaPositionDTO> line) {
    this.line = line;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GeographicLocationDTO geographicLocation = (GeographicLocationDTO) o;
    return Objects.equals(this.id, geographicLocation.id) &&
        Objects.equals(this.heading, geographicLocation.heading) &&
        Objects.equals(this.line, geographicLocation.line);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, heading, line);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GeographicLocationDTO {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    heading: ").append(toIndentedString(heading)).append("\n");
    sb.append("    line: ").append(toIndentedString(line)).append("\n");
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

