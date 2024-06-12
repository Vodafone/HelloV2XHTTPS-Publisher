package step.hellopublisher.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * Gets or Sets Striping
 */
public enum Striping {
  
  STRIPETOCONNECTINGLANESREVOCABLELANE("stripeToConnectingLanesRevocableLane"),
  
  STRIPEDRAWONLEFT("stripeDrawOnLeft"),
  
  STRIPEDRAWONRIGHT("stripeDrawOnRight"),
  
  STRIPETOCONNECTINGLANESLEFT("stripeToConnectingLanesLeft"),
  
  STRIPETOCONNECTINGLANESRIGHT("stripeToConnectingLanesRight"),
  
  STRIPETOCONNECTINGLANESAHEAD("stripeToConnectingLanesAhead");

  private String value;

  Striping(String value) {
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
  public static Striping fromValue(String value) {
    for (Striping b : Striping.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}

