package step.hellopublisher.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * Gets or Sets Crosswalk
 */
public enum Crosswalk {
  
  CROSSWALKREVOCABLELANE("crosswalkRevocableLane"),
  
  BICYLEUSEALLOWED("bicyleUseAllowed"),
  
  ISXWALKFLYOVERLANE("isXwalkFlyOverLane"),
  
  FIXEDCYCLETIME("fixedCycleTime"),
  
  BIDIRECTIONALCYCLETIMES("biDirectionalCycleTimes"),
  
  HASPUSHTOWALKBUTTON("hasPushToWalkButton"),
  
  AUDIOSUPPORT("audioSupport"),
  
  RFSIGNALREQUESTPRESENT("rfSignalRequestPresent"),
  
  UNSIGNALIZEDSEGMENTSPRESENT("unsignalizedSegmentsPresent");

  private String value;

  Crosswalk(String value) {
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
  public static Crosswalk fromValue(String value) {
    for (Crosswalk b : Crosswalk.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}

