package step.hellopublisher.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * Gets or Sets Parking
 */
public enum Parking {
  
  PARKINGREVOCABLELANE("parkingRevocableLane"),
  
  PARALLELPARKINGINUSE("parallelParkingInUse"),
  
  HEADINPARKINGINUSE("headInParkingInUse"),
  
  DONOTPARKZONE("doNotParkZone"),
  
  PARKINGFORBUSUSE("parkingForBusUse"),
  
  PARKINGFORTAXIUSE("parkingForTaxiUse"),
  
  NOPUBLICPARKINGUSE("noPublicParkingUse");

  private String value;

  Parking(String value) {
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
  public static Parking fromValue(String value) {
    for (Parking b : Parking.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}

