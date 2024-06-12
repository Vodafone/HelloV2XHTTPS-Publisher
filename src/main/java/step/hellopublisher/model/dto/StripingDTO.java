package step.hellopublisher.model.dto;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * Gets or Sets Striping
 */
public enum StripingDTO {
  
  STRIPETOCONNECTINGLANESREVOCABLELANE("stripeToConnectingLanesRevocableLane"),
  
  STRIPEDRAWONLEFT("stripeDrawOnLeft"),
  
  STRIPEDRAWONRIGHT("stripeDrawOnRight"),
  
  STRIPETOCONNECTINGLANESLEFT("stripeToConnectingLanesLeft"),
  
  STRIPETOCONNECTINGLANESRIGHT("stripeToConnectingLanesRight"),
  
  STRIPETOCONNECTINGLANESAHEAD("stripeToConnectingLanesAhead");

  private String value;

  StripingDTO(String value) {
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
  public static StripingDTO fromValue(String value) {
    for (StripingDTO b : StripingDTO.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}

