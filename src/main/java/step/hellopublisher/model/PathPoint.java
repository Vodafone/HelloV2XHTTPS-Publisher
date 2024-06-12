package step.hellopublisher.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import step.hellopublisher.model.DeltaReferencePosition;

import java.math.BigDecimal;

import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * PathPoint
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-03-29T16:13:13.074580100+02:00[Africa/Cairo]")
public class PathPoint   {
  @JsonProperty("pathPosition")
  private DeltaReferencePosition pathPosition;

  @JsonProperty("pathDeltaTime")
  private BigDecimal pathDeltaTime;

  public PathPoint pathPosition(DeltaReferencePosition pathPosition) {
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

  public DeltaReferencePosition getPathPosition() {
    return pathPosition;
  }

  public void setPathPosition(DeltaReferencePosition pathPosition) {
    this.pathPosition = pathPosition;
  }

  public PathPoint pathDeltaTime(BigDecimal pathDeltaTime) {
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
    PathPoint pathPoint = (PathPoint) o;
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
    sb.append("class PathPoint {\n");
    
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

