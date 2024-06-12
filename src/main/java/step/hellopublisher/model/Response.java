package step.hellopublisher.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import step.hellopublisher.model.ServiceType;

import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Response
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-03-29T16:13:13.074580100+02:00[Africa/Cairo]")
public class Response   {
  @JsonProperty("service")
  private ServiceType service = ServiceType.UNKNOWN;

  @JsonProperty("success")
  private Boolean success;

  @JsonProperty("key")
  private String key;

  @JsonProperty("offset")
  private String offset;

  @JsonProperty("partition")
  private String partition;

  @JsonProperty("uuid")
  private String uuid;

  public Response service(ServiceType service) {
    this.service = service;
    return this;
  }

  /**
   * Get service
   * @return service
  */
  @ApiModelProperty(value = "")

  @Valid

  public ServiceType getService() {
    return service;
  }

  public void setService(ServiceType service) {
    this.service = service;
  }

  public Response success(Boolean success) {
    this.success = success;
    return this;
  }

  /**
   * Get success
   * @return success
  */
  @ApiModelProperty(example = "true", value = "")


  public Boolean getSuccess() {
    return success;
  }

  public void setSuccess(Boolean success) {
    this.success = success;
  }

  public Response key(String key) {
    this.key = key;
    return this;
  }

  /**
   * Get key
   * @return key
  */
  @ApiModelProperty(value = "")

@Size(max = 255) 
  public String getKey() {
    return key;
  }

  public void setKey(String key) {
    this.key = key;
  }

  public Response offset(String offset) {
    this.offset = offset;
    return this;
  }

  /**
   * Get offset
   * @return offset
  */
  @ApiModelProperty(value = "")

@Size(max = 255) 
  public String getOffset() {
    return offset;
  }

  public void setOffset(String offset) {
    this.offset = offset;
  }

  public Response partition(String partition) {
    this.partition = partition;
    return this;
  }

  /**
   * Get partition
   * @return partition
  */
  @ApiModelProperty(value = "")

@Size(max = 255) 
  public String getPartition() {
    return partition;
  }

  public void setPartition(String partition) {
    this.partition = partition;
  }

  public Response uuid(String uuid) {
    this.uuid = uuid;
    return this;
  }

  /**
   * Get uuid
   * @return uuid
  */
  @ApiModelProperty(value = "")

@Size(max = 255) 
  public String getUuid() {
    return uuid;
  }

  public void setUuid(String uuid) {
    this.uuid = uuid;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Response response = (Response) o;
    return Objects.equals(this.service, response.service) &&
        Objects.equals(this.success, response.success) &&
        Objects.equals(this.key, response.key) &&
        Objects.equals(this.offset, response.offset) &&
        Objects.equals(this.partition, response.partition) &&
        Objects.equals(this.uuid, response.uuid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(service, success, key, offset, partition, uuid);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Response {\n");
    
    sb.append("    service: ").append(toIndentedString(service)).append("\n");
    sb.append("    success: ").append(toIndentedString(success)).append("\n");
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
    sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
    sb.append("    partition: ").append(toIndentedString(partition)).append("\n");
    sb.append("    uuid: ").append(toIndentedString(uuid)).append("\n");
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

