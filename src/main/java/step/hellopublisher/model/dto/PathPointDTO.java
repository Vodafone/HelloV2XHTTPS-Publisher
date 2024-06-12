package step.hellopublisher.model.dto;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import step.hellopublisher.model.dto.DeltaReferencePositionDTO;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * PathPointDTO
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-04-26T14:15:55.316729200+02:00[Africa/Cairo]")
public class PathPointDTO   {
  @JsonProperty("pathPosition")
  private DeltaReferencePositionDTO pathPosition;

  @JsonProperty("pathDeltaTime")
  private BigDecimal pathDeltaTime;

  public PathPointDTO pathPosition(DeltaReferencePositionDTO pathPosition) {
    this.pathPosition = pathPosition;
    return this;
  }

  /**
   * Get pathPosition
   * @return pathPosition
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid

  public DeltaReferencePositionDTO getPathPosition() {
    return pathPosition;
  }

  public void setPathPosition(DeltaReferencePositionDTO pathPosition) {
    this.pathPosition = pathPosition;
  }

  public PathPointDTO pathDeltaTime(BigDecimal pathDeltaTime) {
    this.pathDeltaTime = pathDeltaTime;
    return this;
  }

  /**
   * Get pathDeltaTime
   * @return pathDeltaTime
  */
  @ApiModelProperty(example = "1606733817", value = "")

  @Valid

  public BigDecimal getPathDeltaTime() {
    return pathDeltaTime;
  }

  public void setPathDeltaTime(BigDecimal pathDeltaTime) {
    this.pathDeltaTime = pathDeltaTime;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PathPointDTO pathPoint = (PathPointDTO) o;
    return Objects.equals(this.pathPosition, pathPoint.pathPosition) &&
        Objects.equals(this.pathDeltaTime, pathPoint.pathDeltaTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pathPosition, pathDeltaTime);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PathPointDTO {\n");
    
    sb.append("    pathPosition: ").append(toIndentedString(pathPosition)).append("\n");
    sb.append("    pathDeltaTime: ").append(toIndentedString(pathDeltaTime)).append("\n");
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

