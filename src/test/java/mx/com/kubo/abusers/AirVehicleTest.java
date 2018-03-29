package mx.com.kubo.abusers;

import mx.com.kubo.abusers.impl.AirPlane;
import mx.com.kubo.abusers.impl.Drone;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class AirVehicleTest {

    AirVehicle airVehicle;

    @Test
    public void shouldReturnConcorde() {
        airVehicle = new AirPlane(AirPlaneType.CONCORDE);
        assertTrue(2198.00d == airVehicle.getSpeed());
        assertEquals("Concorde", airVehicle.getType());
    }

    @Test(expected = RuntimeException.class)
    public void shouldThrowExpcetionWhenInstanceCarrierWithOneParameterConstructor() {
       new AirPlane(AirPlaneType.CARRIER);
    }

    @Test
    public void shouldReturnCarrier() {
        airVehicle = new AirPlane(AirPlaneType.CARRIER, 250);
        assertTrue(1875.00d == airVehicle.getSpeed());
        assertEquals("Carrier", airVehicle.getType());
    }

    @Test
    public void shouldReturnDrone() {
        airVehicle = new AirPlane(AirPlaneType.DRONE);
        assertTrue(100.00d == airVehicle.getSpeed());
        assertEquals("Drone", airVehicle.getType());
    }

    @Test
    public void shouldReturnDroneSingleRotor() {
        airVehicle = new Drone(DroneType.SINGLE_ROTOR);
        assertTrue(100.00d == airVehicle.getSpeed());
        assertTrue(3 == ((Drone)airVehicle).getDroneType());
    }

    @Test
    public void shouldReturnDroneFixedWing() {
        airVehicle = new Drone(DroneType.FIXED_WING);
        assertTrue(150.00d == airVehicle.getSpeed());
        assertTrue(2 == ((Drone)airVehicle).getDroneType());
    }

    @Test
    public void shouldReturnDroneMultiRotor() {
        airVehicle = new Drone(DroneType.MULTI_ROTOR);
        assertTrue(60.00d == airVehicle.getSpeed());
        assertTrue(1 == ((Drone)airVehicle).getDroneType());
    }
}