package step.hellopublisher.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * Gets or Sets Bike
 */
public enum Bike {
  
  BIKEREVOCABLELANE("bikeRevocableLane"),
  
  PEDESTRIANUSEALLOWED("pedestrianUseAllowed"),
  
  ISBIKEFLYOVERLANE("isBikeFlyOverLane"),
  
  FIXEDCYCLETIME("fixedCycleTime"),
  
  BIDIRECTIONALCYCLETIMES("biDirectionalCycleTimes"),
  
  ISOLATEDBYBARRIER("isolatedByBarrier"),
  
  UNSIGNALIZEDSEGMENTSPRESENT("unsignalizedSegmentsPresent");

  private String value;

  Bike(String value) {
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
  public static Bike fromValue(String value) {
    for (Bike b : Bike.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}

