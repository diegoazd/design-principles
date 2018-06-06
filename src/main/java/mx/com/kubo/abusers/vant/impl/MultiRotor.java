package mx.com.kubo.abusers.vant.impl;

import mx.com.kubo.abusers.catalogs.DroneType;
import mx.com.kubo.abusers.vant.Vant;

public class MultiRotor implements Vant {
  
  private final double BASE_SPEED = 60.00d;
  
  @Override
  public double getSpeed() {
    return BASE_SPEED;
  }
  
  @Override
  public int getDroneType() {
    return DroneType.MULTI_ROTOR.getDroneType();
  }
}
