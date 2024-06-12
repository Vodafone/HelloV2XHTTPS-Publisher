package step.hellopublisher.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import step.hellopublisher.model.Content;
import step.hellopublisher.model.PayloadDenm;

import java.util.Arrays;

import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ContentDenm
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-03-29T16:13:13.074580100+02:00[Africa/Cairo]")
public class ContentDenm   {
  @JsonProperty("object")
  private PayloadDenm _object;

  @JsonProperty("binary")
  private byte[] binary;

  @JsonProperty("hex")
  private String hex;

  public ContentDenm _object(PayloadDenm _object) {
    this._object = _object;
    return this;
  }

  /**
   * Get _object
   * @return _object
  */
  @ApiModelProperty(value = "")

  @Valid

  public PayloadDenm getObject() {
    return _object;
  }

  public void setObject(PayloadDenm _object) {
    this._object = _object;
  }

  public ContentDenm binary(byte[] binary) {
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

  public ContentDenm hex(String hex) {
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
    ContentDenm contentDenm = (ContentDenm) o;
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
    sb.append("class ContentDenm {\n");
    
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

