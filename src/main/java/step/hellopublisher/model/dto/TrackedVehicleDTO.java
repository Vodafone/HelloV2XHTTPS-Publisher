package step.hellopublisher.model.dto;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * Gets or Sets TrackedVehicle
 */
public enum TrackedVehicleDTO {
  
  REVOCABLELANE("spec-RevocableLane"),
  
  COMMUTERRAILROADTRACK("spec-commuterRailRoadTrack"),
  
  LIGHTRAILROADTRACK("spec-lightRailRoadTrack"),
  
  HEAVYRAILROADTRACK("spec-heavyRailRoadTrack"),
  
  OTHERRAILTYPE("spec-otherRailType");

  private String value;

  TrackedVehicleDTO(String value) {
    this.value = value;
  }

  @JsonValue
  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static TrackedVehicleDTO fromValue(String value) {
    for (TrackedVehicleDTO b : TrackedVehicleDTO.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}

