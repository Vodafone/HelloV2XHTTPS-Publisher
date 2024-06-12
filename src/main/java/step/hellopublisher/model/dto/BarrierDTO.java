package step.hellopublisher.model.dto;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * Gets or Sets Barrier
 */
public enum BarrierDTO {
  
  MEDIAN_REVOCABLELANE("median-RevocableLane"),
  
  MEDIAN("median"),
  
  WHITELINEHASHING("whiteLineHashing"),
  
  STRIPEDLINES("stripedLines"),
  
  DOUBLESTRIPEDLINES("doubleStripedLines"),
  
  TRAFFICCONES("trafficCones"),
  
  CONSTRUCTIONBARRIER("constructionBarrier"),
  
  TRAFFICCHANNELS("trafficChannels"),
  
  LOWCURBS("lowCurbs"),
  
  HIGHCURBS("highCurbs");

  private String value;

  BarrierDTO(String value) {
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
  public static BarrierDTO fromValue(String value) {
    for (BarrierDTO b : BarrierDTO.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}

