package step.hellopublisher.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Arrays;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Content
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-03-29T16:13:13.074580100+02:00[Africa/Cairo]")
public class Content   {
  @JsonProperty("binary")
  private byte[] binary;

  @JsonProperty("hex")
  private String hex;

  public Content binary(byte[] binary) {
    this.binary = binary;
    return this;
  }

  /**
   * Get binary
   * @return binary
  */
  @ApiModelProperty(value = "")


  public byte[] getBinary() {
    return binary;
  }

  public void setBinary(byte[] binary) {
    this.binary = binary;
  }

  public Content hex(String hex) {
    this.hex = hex;
    return this;
  }

  /**
   * Get hex
   * @return hex
  */
  @ApiModelProperty(value = "")


  public String getHex() {
    return hex;
  }

  public void setHex(String hex) {
    this.hex = hex;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Content content = (Content) o;
    return Arrays.equals(this.binary, content.binary) &&
        Objects.equals(this.hex, content.hex);
  }

  @Override
  public int hashCode() {
    return Objects.hash(Arrays.hashCode(binary), hex);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Content {\n");
    
    sb.append("    binary: ").append(toIndentedString(binary)).append("\n");
    sb.append("    hex: ").append(toIndentedString(hex)).append("\n");
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

