package step.hellopublisher.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import step.hellopublisher.model.BaseMessage;
import step.hellopublisher.model.ContentDenm;
import step.hellopublisher.model.Metadata;
import step.hellopublisher.model.ServiceType;

import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * MessageDenm
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-03-29T16:13:13.074580100+02:00[Africa/Cairo]")
public class MessageDenm extends BaseMessage  {
  @JsonProperty("content")
  private ContentDenm content;

  public MessageDenm content(ContentDenm content) {
    this.content = content;
    return this;
  }

  /**
   * Get content
   * @return content
  */
  @ApiModelProperty(value = "")

  @Valid

  public ContentDenm getContent() {
    return content;
  }

  public void setContent(ContentDenm content) {
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
    MessageDenm messageDenm = (MessageDenm) o;
    return Objects.equals(this.content, messageDenm.content) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(content, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MessageDenm {\n");
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

