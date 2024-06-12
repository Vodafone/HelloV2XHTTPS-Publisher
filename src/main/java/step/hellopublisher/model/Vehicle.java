package step.hellopublisher.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * Gets or Sets Vehicle
 */
public enum Vehicle {
  
  ISVEHICLEREVOCABLELANE("isVehicleRevocableLane"),
  
  ISVEHICLEFLYOVERLANE("isVehicleFlyOverLane"),
  
  HOVLANEUSEONLY("hovLaneUseOnly"),
  
  RESTRICTEDTOBUSUSE("restrictedToBusUse"),
  
  RESTRICTEDTOTAXIUSE("restrictedToTaxiUse"),
  
  RESTRICTEDFROMPUBLICUSE("restrictedFromPublicUse"),
  
  HASIRBEACONCOVERAGE("hasIRbeaconCoverage"),
  
  PERMISSIONONREQUEST("permissionOnRequest");

  private String value;

  Vehicle(String value) {
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
  public static Vehicle fromValue(String value) {
    for (Vehicle b : Vehicle.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}

