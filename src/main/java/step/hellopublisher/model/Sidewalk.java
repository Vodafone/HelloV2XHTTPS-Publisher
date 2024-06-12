package step.hellopublisher.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * Gets or Sets Sidewalk
 */
public enum Sidewalk {
  
  SIDEWALK_REVOCABLELANE("sidewalk-RevocableLane"),
  
  BICYLEUSEALLOWED("bicyleUseAllowed"),
  
  ISSIDEWALKFLYOVERLANE("isSidewalkFlyOverLane"),
  
  WALKBIKES("walkBikes");

  private String value;

  Sidewalk(String value) {
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
  public static Sidewalk fromValue(String value) {
    for (Sidewalk b : Sidewalk.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}

