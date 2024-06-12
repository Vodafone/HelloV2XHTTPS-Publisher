package step.hellopublisher.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import step.hellopublisher.model.DeltaPosition;

import java.util.ArrayList;
import java.util.List;

import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * GeographicLocation
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-03-29T16:13:13.074580100+02:00[Africa/Cairo]")
public class GeographicLocation   {
  @JsonProperty("id")
  private Integer id;

  @JsonProperty("heading")
  private Integer heading;

  @JsonProperty("line")
  @Valid
  private List<DeltaPosition> line = null;

  public GeographicLocation id(Integer id) {
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

  public GeographicLocation heading(Integer heading) {
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

  public GeographicLocation line(List<DeltaPosition> line) {
    this.line = line;
    return this;
  }

  public GeographicLocation addLineItem(DeltaPosition lineItem) {
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

  public List<DeltaPosition> getLine() {
    return line;
  }

  public void setLine(List<DeltaPosition> line) {
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
    GeographicLocation geographicLocation = (GeographicLocation) o;
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
    sb.append("class GeographicLocation {\n");
    
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

