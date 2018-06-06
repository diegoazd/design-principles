package mx.com.kubo.abusers.airplane.impl;

import mx.com.kubo.abusers.airplane.catalogs.AirPlaneType;
import mx.com.kubo.abusers.airplane.AirVehicle;

//FACADE PATTERN
public class AirPlane {
    AirVehicle airVehicle;

    public AirPlane(AirPlaneType type) {
        if(type == AirPlaneType.CARRIER) {
            throw new RuntimeException("Invalid argument");
        }
        
        this.airVehicle = new Concorde();
    }

    public AirPlane(int loadFactor) {
        this.airVehicle = new Carrier(loadFactor);
    }

    public double getSpeed() {
      return airVehicle.getSpeed();
    }

    public String getType() {
      return airVehicle.getType();
    }
}
