package step.hellopublisher.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * Gets or Sets LaneType
 */
public enum LaneType {
  
  VEHICLE("vehicle"),
  
  CROSSWALK("crosswalk"),
  
  BIKE("bike"),
  
  SIDEWALK("sidewalk"),
  
  BARRIER("barrier"),
  
  STRIPING("striping"),
  
  TRACKEDVEHICLE("trackedVehicle"),
  
  PARKING("parking");

  private String value;

  LaneType(String value) {
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
  public static LaneType fromValue(String value) {
    for (LaneType b : LaneType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}

