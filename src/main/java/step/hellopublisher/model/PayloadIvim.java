package step.hellopublisher.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import step.hellopublisher.model.GeographicLocation;
import step.hellopublisher.model.IviLocation;
import step.hellopublisher.model.ReferencePosition;

import java.util.ArrayList;
import java.util.List;

import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * PayloadIvim
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-03-29T16:13:13.074580100+02:00[Africa/Cairo]")
public class PayloadIvim   {
  @JsonProperty("identifier")
  private Integer identifier;

  @JsonProperty("sequence")
  private Integer sequence;

  @JsonProperty("referencePosition")
  private ReferencePosition referencePosition;

  @JsonProperty("countryCode")
  private String countryCode;

  @JsonProperty("geographicLocations")
  @Valid
  private List<GeographicLocation> geographicLocations = null;

  @JsonProperty("iviLocations")
  @Valid
  private List<IviLocation> iviLocations = null;

  public PayloadIvim identifier(Integer identifier) {
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

  public PayloadIvim sequence(Integer sequence) {
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

  public PayloadIvim referencePosition(ReferencePosition referencePosition) {
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

  public ReferencePosition getReferencePosition() {
    return referencePosition;
  }

  public void setReferencePosition(ReferencePosition referencePosition) {
    this.referencePosition = referencePosition;
  }

  public PayloadIvim countryCode(String countryCode) {
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

  public PayloadIvim geographicLocations(List<GeographicLocation> geographicLocations) {
    this.geographicLocations = geographicLocations;
    return this;
  }

  public PayloadIvim addGeographicLocationsItem(GeographicLocation geographicLocationsItem) {
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

  public List<GeographicLocation> getGeographicLocations() {
    return geographicLocations;
  }

  public void setGeographicLocations(List<GeographicLocation> geographicLocations) {
    this.geographicLocations = geographicLocations;
  }

  public PayloadIvim iviLocations(List<IviLocation> iviLocations) {
    this.iviLocations = iviLocations;
    return this;
  }

  public PayloadIvim addIviLocationsItem(IviLocation iviLocationsItem) {
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

  public List<IviLocation> getIviLocations() {
    return iviLocations;
  }

  public void setIviLocations(List<IviLocation> iviLocations) {
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
    PayloadIvim payloadIvim = (PayloadIvim) o;
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
    sb.append("class PayloadIvim {\n");
    
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

