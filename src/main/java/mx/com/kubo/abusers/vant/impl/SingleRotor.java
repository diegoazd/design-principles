package mx.com.kubo.abusers.vant.impl;

import mx.com.kubo.abusers.catalogs.DroneType;
import mx.com.kubo.abusers.vant.Vant;

public class SingleRotor implements Vant {
  
  public final double BASE_SPEED = 100.00d;
  
  @Override
  public double getSpeed() {
    return BASE_SPEED;
  }
  
  @Override
  public int getDroneType() {
    return DroneType.SINGLE_ROTOR.getDroneType();
  }
}
