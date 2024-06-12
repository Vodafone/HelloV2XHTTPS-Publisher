package step.hellopublisher.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import step.hellopublisher.model.Metadata;
import step.hellopublisher.model.ServiceType;

import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * BaseMessage
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-03-29T16:13:13.074580100+02:00[Africa/Cairo]")
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.EXISTING_PROPERTY, property = "service", visible = true)
@JsonSubTypes({
  @JsonSubTypes.Type(value = MessageDenm.class, name = "DENM"),
  @JsonSubTypes.Type(value = MessageIvim.class, name = "IVIM"),
})

public class BaseMessage   {
  @JsonProperty("publisher")
  private String publisher;

  @JsonProperty("service")
  private ServiceType service = ServiceType.UNKNOWN;

  @JsonProperty("metadata")
  private Metadata metadata;

  @JsonProperty("uuid")
  private String uuid;

  @JsonProperty("topic")
  private String topic;

  public BaseMessage publisher(String publisher) {
    this.publisher = publisher;
    return this;
  }

  /**
   * Get publisher
   * @return publisher
  */
  @ApiModelProperty(example = "nokia", required = true, value = "")
  @NotNull

@Pattern(regexp = "^(?!\\s*$).+") 
  public String getPublisher() {
    return publisher;
  }

  public void setPublisher(String publisher) {
    this.publisher = publisher;
  }

  public BaseMessage service(ServiceType service) {
    this.service = service;
    return this;
  }

  /**
   * Get service
   * @return service
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid

  public ServiceType getService() {
    return service;
  }

  public void setService(ServiceType service) {
    this.service = service;
  }

  public BaseMessage metadata(Metadata metadata) {
    this.metadata = metadata;
    return this;
  }

  /**
   * Get metadata
   * @return metadata
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid

  public Metadata getMetadata() {
    return metadata;
  }

  public void setMetadata(Metadata metadata) {
    this.metadata = metadata;
  }

  public BaseMessage uuid(String uuid) {
    this.uuid = uuid;
    return this;
  }

  /**
   * Get uuid
   * @return uuid
  */
  @ApiModelProperty(example = "Gcc55edda-8acd-5128-977d-12b94430896a", value = "")

@Pattern(regexp = "^[0-9a-f]{8}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{12}$") @Size(min = 36, max = 36) 
  public String getUuid() {
    return uuid;
  }

  public void setUuid(String uuid) {
    this.uuid = uuid;
  }

  public BaseMessage topic(String topic) {
    this.topic = topic;
    return this;
  }

  /**
   * Get topic
   * @return topic
  */
  @ApiModelProperty(value = "")


  public String getTopic() {
    return topic;
  }

  public void setTopic(String topic) {
    this.topic = topic;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BaseMessage baseMessage = (BaseMessage) o;
    return Objects.equals(this.publisher, baseMessage.publisher) &&
        Objects.equals(this.service, baseMessage.service) &&
        Objects.equals(this.metadata, baseMessage.metadata) &&
        Objects.equals(this.uuid, baseMessage.uuid) &&
        Objects.equals(this.topic, baseMessage.topic);
  }

  @Override
  public int hashCode() {
    return Objects.hash(publisher, service, metadata, uuid, topic);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BaseMessage {\n");
    
    sb.append("    publisher: ").append(toIndentedString(publisher)).append("\n");
    sb.append("    service: ").append(toIndentedString(service)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    uuid: ").append(toIndentedString(uuid)).append("\n");
    sb.append("    topic: ").append(toIndentedString(topic)).append("\n");
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

