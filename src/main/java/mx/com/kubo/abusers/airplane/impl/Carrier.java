package mx.com.kubo.abusers.airplane.impl;

import mx.com.kubo.abusers.airplane.AirVehicle;
import mx.com.kubo.abusers.airplane.catalogs.AirPlaneType;

public class Carrier implements AirVehicle {
  private final double BASE_SPEED = 2000.00d;
  private int loadFactor;
  
  public Carrier(int loadFactor) {
    this.loadFactor = loadFactor;
  }
  
  @Override
  public double getSpeed() {
    return BASE_SPEED - loadFactor * 0.5;
  }
  
  @Override
  public String getType() {
    return AirPlaneType.CARRIER.getType();
  }
}
