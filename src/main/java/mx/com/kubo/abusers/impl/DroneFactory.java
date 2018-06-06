package mx.com.kubo.abusers.impl;

import mx.com.kubo.abusers.catalogs.DroneType;
import mx.com.kubo.abusers.vant.Vant;
import mx.com.kubo.abusers.vant.impl.FixedWing;
import mx.com.kubo.abusers.vant.impl.MultiRotor;
import mx.com.kubo.abusers.vant.impl.SingleRotor;

public class DroneFactory {
  
  public static Vant getVant(DroneType droneType) {
    if(droneType.equals(DroneType.FIXED_WING)) {
      return new FixedWing();
    }else if(droneType.equals(DroneType.SINGLE_ROTOR)){
      return new SingleRotor();
    }else {
      return new MultiRotor();
    }
  }
}
