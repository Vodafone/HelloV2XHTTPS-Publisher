package step.hellopublisher.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * Gets or Sets StationType
 */
public enum StationType {
  
  UNKNOWN("unknown"),
  
  PEDESTRIAN("pedestrian"),
  
  CYCLIST("cyclist"),
  
  MOPED("moped"),
  
  MOTORCYCLE("motorcycle"),
  
  PASSENGERCAR("passengerCar"),
  
  BUS("bus"),
  
  LIGHTTRUCK("lightTruck"),
  
  HEAVYTRUCK("heavyTruck"),
  
  TRAILER("trailer"),
  
  SPECIALVEHICLES("specialVehicles"),
  
  TRAM("tram"),
  
  ROADSIDEUNIT("roadSideUnit");

  private String value;

  StationType(String value) {
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
  public static StationType fromValue(String value) {
    for (StationType b : StationType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}

