package mx.com.kubo.abusers.vant.impl;

import mx.com.kubo.abusers.catalogs.DroneType;
import mx.com.kubo.abusers.vant.Vant;

public class FixedWing implements Vant {
  public final double BASE_SPEED = 150.00d;
  
  @Override
  public double getSpeed() {
    return BASE_SPEED;
  }
  
  @Override
  public int getDroneType() {
    return DroneType.FIXED_WING.getDroneType();
  }
}
