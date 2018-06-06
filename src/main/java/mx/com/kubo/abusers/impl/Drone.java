package mx.com.kubo.abusers.impl;

import mx.com.kubo.abusers.catalogs.AirPlaneType;
import mx.com.kubo.abusers.catalogs.DroneType;

public class Drone extends AirPlane {

    public DroneType droneType;

    public Drone(DroneType droneType) {
        super(AirPlaneType.DRONE);
        this.droneType = droneType;
    }

    @Override
    public double getSpeed() {
        switch (droneType) {
            case SINGLE_ROTOR:
                return 100.00d;
            case FIXED_WING:
                return 150.00d;
            default:
                return 60.00d;
        }
    }

    @Override
    @Deprecated
    public String getType() {
        return null;
    }

    public int getDroneType() {
        return droneType.getDroneType();
    }

}
