package step.hellopublisher.model.dto;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import step.hellopublisher.model.dto.LaneTypeAttributesDTO;
import step.hellopublisher.model.dto.LaneTypeDTO;
import step.hellopublisher.model.dto.StripingDTO;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * LaneAttributesStripingDTO
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-04-26T14:15:55.316729200+02:00[Africa/Cairo]")
public class LaneAttributesStripingDTO extends LaneTypeAttributesDTO  {
  @JsonProperty("content")
  private StripingDTO content;

  public LaneAttributesStripingDTO content(StripingDTO content) {
    this.content = content;
    return this;
  }

  /**
   * Get content
   * @return content
  */
  @ApiModelProperty(value = "")

  @Valid

  public StripingDTO getContent() {
    return content;
  }

  public void setContent(StripingDTO content) {
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
    LaneAttributesStripingDTO laneAttributesStriping = (LaneAttributesStripingDTO) o;
    return Objects.equals(this.content, laneAttributesStriping.content) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(content, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LaneAttributesStripingDTO {\n");
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

