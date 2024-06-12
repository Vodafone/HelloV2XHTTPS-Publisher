package step.hellopublisher.model.dto;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * Gets or Sets LaneType
 */
public enum LaneTypeDTO {
  
  VEHICLE("vehicle"),
  
  CROSSWALK("crosswalk"),
  
  BIKE("bike"),
  
  SIDEWALK("sidewalk"),
  
  BARRIER("barrier"),
  
  STRIPING("striping"),
  
  TRACKEDVEHICLE("trackedVehicle"),
  
  PARKING("parking");

  private String value;

  LaneTypeDTO(String value) {
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
  public static LaneTypeDTO fromValue(String value) {
    for (LaneTypeDTO b : LaneTypeDTO.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}

