package step.hellopublisher.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * Gets or Sets TrackedVehicle
 */
public enum TrackedVehicle {
  
  REVOCABLELANE("spec-RevocableLane"),
  
  COMMUTERRAILROADTRACK("spec-commuterRailRoadTrack"),
  
  LIGHTRAILROADTRACK("spec-lightRailRoadTrack"),
  
  HEAVYRAILROADTRACK("spec-heavyRailRoadTrack"),
  
  OTHERRAILTYPE("spec-otherRailType");

  private String value;

  TrackedVehicle(String value) {
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
  public static TrackedVehicle fromValue(String value) {
    for (TrackedVehicle b : TrackedVehicle.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}

