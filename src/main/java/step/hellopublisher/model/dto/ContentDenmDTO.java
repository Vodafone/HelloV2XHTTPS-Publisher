package step.hellopublisher.model.dto;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Arrays;
import step.hellopublisher.model.dto.ContentDTO;
import step.hellopublisher.model.dto.PayloadDenmDTO;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ContentDenmDTO
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-04-26T14:15:55.316729200+02:00[Africa/Cairo]")
public class ContentDenmDTO   {
  @JsonProperty("object")
  private PayloadDenmDTO _object;

  @JsonProperty("binary")
  private byte[] binary;

  @JsonProperty("hex")
  private String hex;

  public ContentDenmDTO _object(PayloadDenmDTO _object) {
    this._object = _object;
    return this;
  }

  /**
   * Get _object
   * @return _object
  */
  @ApiModelProperty(value = "")

  @Valid

  public PayloadDenmDTO getObject() {
    return _object;
  }

  public void setObject(PayloadDenmDTO _object) {
    this._object = _object;
  }

  public ContentDenmDTO binary(byte[] binary) {
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

  public ContentDenmDTO hex(String hex) {
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
    ContentDenmDTO contentDenm = (ContentDenmDTO) o;
    return Objects.equals(this._object, contentDenm._object) &&
        Arrays.equals(this.binary, contentDenm.binary) &&
        Objects.equals(this.hex, contentDenm.hex);
  }

  @Override
  public int hashCode() {
    return Objects.hash(_object, Arrays.hashCode(binary), hex);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ContentDenmDTO {\n");
    
    sb.append("    _object: ").append(toIndentedString(_object)).append("\n");
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

