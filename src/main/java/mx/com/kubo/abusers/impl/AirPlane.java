package mx.com.kubo.abusers.impl;

import mx.com.kubo.abusers.catalogs.AirPlaneType;
import mx.com.kubo.abusers.AirVehicle;

public class AirPlane implements AirVehicle {
    AirPlaneType type;
    int loadFactor;

    public AirPlane(AirPlaneType type) {
        if(type == AirPlaneType.CARRIER) {
            throw new RuntimeException("Invalid argument");
        }
        this.type = type;
    }

    public AirPlane(AirPlaneType type, int loadFactor) {
        this.type = type;
        this.loadFactor = loadFactor;
    }

    @Override
    public double getSpeed() {
        double speed;

        switch (type) {
            case CONCORDE:
                speed =  2198.00d;
                break;
            case CARRIER:
                speed = 2000 - loadFactor * 0.5;
                break;
            default:
                speed = 100.00d;
        }

        return speed;
    }

    @Override
    public String getType() {
        return type.getType();
    }
}
