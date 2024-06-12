package step.hellopublisher.model.dto;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * Gets or Sets RoadType
 */
public enum RoadTypeDTO {
  
  URBAN_NOSTRUCTURALSEPARATIONTOOPPOSITELANES("urban-NoStructuralSeparationToOppositeLanes"),
  
  URBAN_WITHSTRUCTURALSEPARATIONTOOPPOSITELANES("urban-WithStructuralSeparationToOppositeLanes"),
  
  NONURBAN_NOSTRUCTURALSEPARATIONTOOPPOSITELANES("nonUrban-NoStructuralSeparationToOppositeLanes"),
  
  NONURBAN_WITHSTRUCTURALSEPARATIONTOOPPOSITELANES("nonUrban-WithStructuralSeparationToOppositeLanes");

  private String value;

  RoadTypeDTO(String value) {
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
  public static RoadTypeDTO fromValue(String value) {
    for (RoadTypeDTO b : RoadTypeDTO.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}

