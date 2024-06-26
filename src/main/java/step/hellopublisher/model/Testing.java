package step.hellopublisher.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Testing
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-03-29T16:13:13.074580100+02:00[Africa/Cairo]")
public class Testing   {
  @JsonProperty("field1")
  private String field1;

  @JsonProperty("field2")
  private String field2;

  @JsonProperty("field3")
  private String field3;

  public Testing field1(String field1) {
    this.field1 = field1;
    return this;
  }

  /**
   * Get field1
   * @return field1
  */
  @ApiModelProperty(value = "")


  public String getField1() {
    return field1;
  }

  public void setField1(String field1) {
    this.field1 = field1;
  }

  public Testing field2(String field2) {
    this.field2 = field2;
    return this;
  }

  /**
   * Get field2
   * @return field2
  */
  @ApiModelProperty(value = "")


  public String getField2() {
    return field2;
  }

  public void setField2(String field2) {
    this.field2 = field2;
  }

  public Testing field3(String field3) {
    this.field3 = field3;
    return this;
  }

  /**
   * Get field3
   * @return field3
  */
  @ApiModelProperty(value = "")


  public String getField3() {
    return field3;
  }

  public void setField3(String field3) {
    this.field3 = field3;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Testing testing = (Testing) o;
    return Objects.equals(this.field1, testing.field1) &&
        Objects.equals(this.field2, testing.field2) &&
        Objects.equals(this.field3, testing.field3);
  }

  @Override
  public int hashCode() {
    return Objects.hash(field1, field2, field3);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Testing {\n");
    
    sb.append("    field1: ").append(toIndentedString(field1)).append("\n");
    sb.append("    field2: ").append(toIndentedString(field2)).append("\n");
    sb.append("    field3: ").append(toIndentedString(field3)).append("\n");
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

