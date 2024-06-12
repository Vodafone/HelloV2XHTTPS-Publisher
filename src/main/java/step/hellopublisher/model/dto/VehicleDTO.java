package step.hellopublisher.model.dto;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * Gets or Sets Vehicle
 */
public enum VehicleDTO {
  
  ISVEHICLEREVOCABLELANE("isVehicleRevocableLane"),
  
  ISVEHICLEFLYOVERLANE("isVehicleFlyOverLane"),
  
  HOVLANEUSEONLY("hovLaneUseOnly"),
  
  RESTRICTEDTOBUSUSE("restrictedToBusUse"),
  
  RESTRICTEDTOTAXIUSE("restrictedToTaxiUse"),
  
  RESTRICTEDFROMPUBLICUSE("restrictedFromPublicUse"),
  
  HASIRBEACONCOVERAGE("hasIRbeaconCoverage"),
  
  PERMISSIONONREQUEST("permissionOnRequest");

  private String value;

  VehicleDTO(String value) {
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
  public static VehicleDTO fromValue(String value) {
    for (VehicleDTO b : VehicleDTO.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}

