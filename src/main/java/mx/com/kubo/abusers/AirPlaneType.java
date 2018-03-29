package mx.com.kubo.abusers;

public enum AirPlaneType {
    CONCORDE("Concorde"), CARRIER("Carrier"), DRONE("Drone");

    private String type;

    AirPlaneType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }
}
