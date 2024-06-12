package step.hellopublisher.model.dto;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import step.hellopublisher.model.dto.GeographicLocationDTO;
import step.hellopublisher.model.dto.IviLocationDTO;
import step.hellopublisher.model.dto.ReferencePositionDTO;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * PayloadIvimDTO
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-04-26T14:15:55.316729200+02:00[Africa/Cairo]")
public class PayloadIvimDTO   {
  @JsonProperty("identifier")
  private Integer identifier;

  @JsonProperty("sequence")
  private Integer sequence;

  @JsonProperty("referencePosition")
  private ReferencePositionDTO referencePosition;

  @JsonProperty("countryCode")
  private String countryCode;

  @JsonProperty("geographicLocations")
  @Valid
  private List<GeographicLocationDTO> geographicLocations = null;

  @JsonProperty("iviLocations")
  @Valid
  private List<IviLocationDTO> iviLocations = null;

  public PayloadIvimDTO identifier(Integer identifier) {
    this.identifier = identifier;
    return this;
  }

  /**
   * Get identifier
   * @return identifier
  */
  @ApiModelProperty(example = "123456789", required = true, value = "")
  @NotNull


  public Integer getIdentifier() {
    return identifier;
  }

  public void setIdentifier(Integer identifier) {
    this.identifier = identifier;
  }

  public PayloadIvimDTO sequence(Integer sequence) {
    this.sequence = sequence;
    return this;
  }

  /**
   * Get sequence
   * @return sequence
  */
  @ApiModelProperty(example = "123", required = true, value = "")
  @NotNull


  public Integer getSequence() {
    return sequence;
  }

  public void setSequence(Integer sequence) {
    this.sequence = sequence;
  }

  public PayloadIvimDTO referencePosition(ReferencePositionDTO referencePosition) {
    this.referencePosition = referencePosition;
    return this;
  }

  /**
   * Get referencePosition
   * @return referencePosition
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid

  public ReferencePositionDTO getReferencePosition() {
    return referencePosition;
  }

  public void setReferencePosition(ReferencePositionDTO referencePosition) {
    this.referencePosition = referencePosition;
  }

  public PayloadIvimDTO countryCode(String countryCode) {
    this.countryCode = countryCode;
    return this;
  }

  /**
   * Get countryCode
   * @return countryCode
  */
  @ApiModelProperty(example = "GB", required = true, value = "")
  @NotNull

@Pattern(regexp = "^[A-Z]{2}$") @Size(min = 2, max = 2) 
  public String getCountryCode() {
    return countryCode;
  }

  public void setCountryCode(String countryCode) {
    this.countryCode = countryCode;
  }

  public PayloadIvimDTO geographicLocations(List<GeographicLocationDTO> geographicLocations) {
    this.geographicLocations = geographicLocations;
    return this;
  }

  public PayloadIvimDTO addGeographicLocationsItem(GeographicLocationDTO geographicLocationsItem) {
    if (this.geographicLocations == null) {
      this.geographicLocations = new ArrayList<>();
    }
    this.geographicLocations.add(geographicLocationsItem);
    return this;
  }

  /**
   * Get geographicLocations
   * @return geographicLocations
  */
  @ApiModelProperty(value = "")

  @Valid

  public List<GeographicLocationDTO> getGeographicLocations() {
    return geographicLocations;
  }

  public void setGeographicLocations(List<GeographicLocationDTO> geographicLocations) {
    this.geographicLocations = geographicLocations;
  }

  public PayloadIvimDTO iviLocations(List<IviLocationDTO> iviLocations) {
    this.iviLocations = iviLocations;
    return this;
  }

  public PayloadIvimDTO addIviLocationsItem(IviLocationDTO iviLocationsItem) {
    if (this.iviLocations == null) {
      this.iviLocations = new ArrayList<>();
    }
    this.iviLocations.add(iviLocationsItem);
    return this;
  }

  /**
   * Get iviLocations
   * @return iviLocations
  */
  @ApiModelProperty(value = "")

  @Valid

  public List<IviLocationDTO> getIviLocations() {
    return iviLocations;
  }

  public void setIviLocations(List<IviLocationDTO> iviLocations) {
    this.iviLocations = iviLocations;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PayloadIvimDTO payloadIvim = (PayloadIvimDTO) o;
    return Objects.equals(this.identifier, payloadIvim.identifier) &&
        Objects.equals(this.sequence, payloadIvim.sequence) &&
        Objects.equals(this.referencePosition, payloadIvim.referencePosition) &&
        Objects.equals(this.countryCode, payloadIvim.countryCode) &&
        Objects.equals(this.geographicLocations, payloadIvim.geographicLocations) &&
        Objects.equals(this.iviLocations, payloadIvim.iviLocations);
  }

  @Override
  public int hashCode() {
    return Objects.hash(identifier, sequence, referencePosition, countryCode, geographicLocations, iviLocations);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PayloadIvimDTO {\n");
    
    sb.append("    identifier: ").append(toIndentedString(identifier)).append("\n");
    sb.append("    sequence: ").append(toIndentedString(sequence)).append("\n");
    sb.append("    referencePosition: ").append(toIndentedString(referencePosition)).append("\n");
    sb.append("    countryCode: ").append(toIndentedString(countryCode)).append("\n");
    sb.append("    geographicLocations: ").append(toIndentedString(geographicLocations)).append("\n");
    sb.append("    iviLocations: ").append(toIndentedString(iviLocations)).append("\n");
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

