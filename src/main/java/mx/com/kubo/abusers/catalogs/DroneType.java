package mx.com.kubo.abusers.catalogs;

public enum DroneType {
    MULTI_ROTOR(1), FIXED_WING(2), SINGLE_ROTOR(3);

    private int droneType;

    DroneType(int droneType) {
        this.droneType = droneType;
    }

    public int getDroneType() {
        return droneType;
    }
}
