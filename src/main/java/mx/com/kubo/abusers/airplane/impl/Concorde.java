package mx.com.kubo.abusers.airplane.impl;

import mx.com.kubo.abusers.airplane.AirVehicle;
import mx.com.kubo.abusers.airplane.catalogs.AirPlaneType;

public class Concorde implements AirVehicle {
  
  private final double BASE_SPEED = 2198.00d;
  private final String TYPE = "Concorde";
  
  @Override
  public double getSpeed() {
    return BASE_SPEED;
  }
  
  @Override
  public String getType() {
    return AirPlaneType.CONCORDE.getType();
  }
}
