package step.hellopublisher.model.dto;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * Gets or Sets LaneDirection
 */
public enum LaneDirectionDTO {
  
  INGRESSPATH("ingressPath"),
  
  EGRESSPATH("egressPath");

  private String value;

  LaneDirectionDTO(String value) {
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
  public static LaneDirectionDTO fromValue(String value) {
    for (LaneDirectionDTO b : LaneDirectionDTO.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}

