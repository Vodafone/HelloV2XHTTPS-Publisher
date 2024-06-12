package step.hellopublisher.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * Gets or Sets RoadType
 */
public enum RoadType {
  
  URBAN_NOSTRUCTURALSEPARATIONTOOPPOSITELANES("urban-NoStructuralSeparationToOppositeLanes"),
  
  URBAN_WITHSTRUCTURALSEPARATIONTOOPPOSITELANES("urban-WithStructuralSeparationToOppositeLanes"),
  
  NONURBAN_NOSTRUCTURALSEPARATIONTOOPPOSITELANES("nonUrban-NoStructuralSeparationToOppositeLanes"),
  
  NONURBAN_WITHSTRUCTURALSEPARATIONTOOPPOSITELANES("nonUrban-WithStructuralSeparationToOppositeLanes");

  private String value;

  RoadType(String value) {
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
  public static RoadType fromValue(String value) {
    for (RoadType b : RoadType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}

