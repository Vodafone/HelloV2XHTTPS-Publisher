package step.hellopublisher.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import step.hellopublisher.model.LaneType;
import step.hellopublisher.model.LaneTypeAttributes;
import step.hellopublisher.model.Sidewalk;

import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * LaneAttributesSidewalk
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-03-29T16:13:13.074580100+02:00[Africa/Cairo]")
public class LaneAttributesSidewalk extends LaneTypeAttributes  {
  @JsonProperty("content")
  private Sidewalk content;

  public LaneAttributesSidewalk content(Sidewalk content) {
    this.content = content;
    return this;
  }

  /**
   * Get content
   * @return content
  */
  @ApiModelProperty(value = "")

  @Valid

  public Sidewalk getContent() {
    return content;
  }

  public void setContent(Sidewalk content) {
    this.content = content;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LaneAttributesSidewalk laneAttributesSidewalk = (LaneAttributesSidewalk) o;
    return Objects.equals(this.content, laneAttributesSidewalk.content) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(content, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LaneAttributesSidewalk {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    content: ").append(toIndentedString(content)).append("\n");
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

