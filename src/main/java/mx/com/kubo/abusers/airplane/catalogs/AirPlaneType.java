package mx.com.kubo.abusers.airplane.catalogs;

public enum AirPlaneType {
    CONCORDE("Concorde"), CARRIER("Carrier");

    private String type;

    AirPlaneType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }
}
