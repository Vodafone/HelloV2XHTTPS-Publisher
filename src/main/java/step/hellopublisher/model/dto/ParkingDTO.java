package step.hellopublisher.model.dto;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * Gets or Sets Parking
 */
public enum ParkingDTO {
  
  PARKINGREVOCABLELANE("parkingRevocableLane"),
  
  PARALLELPARKINGINUSE("parallelParkingInUse"),
  
  HEADINPARKINGINUSE("headInParkingInUse"),
  
  DONOTPARKZONE("doNotParkZone"),
  
  PARKINGFORBUSUSE("parkingForBusUse"),
  
  PARKINGFORTAXIUSE("parkingForTaxiUse"),
  
  NOPUBLICPARKINGUSE("noPublicParkingUse");

  private String value;

  ParkingDTO(String value) {
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
  public static ParkingDTO fromValue(String value) {
    for (ParkingDTO b : ParkingDTO.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}

