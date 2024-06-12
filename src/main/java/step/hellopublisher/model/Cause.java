package step.hellopublisher.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * Gets or Sets Cause
 */
public enum Cause {
  
  RESERVED("reserved"),
  
  TRAFFICCONDITION("trafficCondition"),
  
  ACCIDENT("accident"),
  
  ROADWORKS("roadworks"),
  
  IMPASSABILITY("impassability"),
  
  ADVERSEWEATHERCONDITION_ADHESION("adverseWeatherCondition-Adhesion"),
  
  AQUAPLANNNING("aquaplannning"),
  
  HAZARDOUSLOCATION_SURFACECONDITION("hazardousLocation-SurfaceCondition"),
  
  HAZARDOUSLOCATION_OBSTACLEONTHEROAD("hazardousLocation-ObstacleOnTheRoad"),
  
  HAZARDOUSLOCATION_ANIMALONTHEROAD("hazardousLocation-AnimalOnTheRoad"),
  
  HUMANPRESENCEONTHEROAD("humanPresenceOnTheRoad"),
  
  WRONGWAYDRIVING("wrongWayDriving"),
  
  RESCUEANDRECOVERYWORKINPROGRESS("rescueAndRecoveryWorkInProgress"),
  
  ADVERSEWEATHERCONDITION_EXTREMEWEATHERCONDITION("adverseWeatherCondition-ExtremeWeatherCondition"),
  
  ADVERSEWEATHERCONDITION_VISIBILITY("adverseWeatherCondition-Visibility"),
  
  ADVERSEWEATHERCONDITION_PRECIPITATION("adverseWeatherCondition-Precipitation"),
  
  SLOWVEHICLE("slowVehicle"),
  
  DANGEROUSENDOFQUEUE("dangerousEndOfQueue"),
  
  VEHICLEBREAKDOWN("vehicleBreakdown"),
  
  POSTCRASH("postCrash"),
  
  HUMANPROBLEM("humanProblem"),
  
  STATIONARYVEHICLE("stationaryVehicle"),
  
  EMERGENCYVEHICLEAPPROACHING("emergencyVehicleApproaching"),
  
  HAZARDOUSLOCATION_DANGEROUSCURVE("hazardousLocation-DangerousCurve"),
  
  COLLISIONRISK("collisionRisk"),
  
  SIGNALVIOLATION("signalViolation"),
  
  DANGEROUSSITUATION("dangerousSituation");

  private String value;

  Cause(String value) {
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
  public static Cause fromValue(String value) {
    for (Cause b : Cause.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}

