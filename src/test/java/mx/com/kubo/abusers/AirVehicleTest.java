package mx.com.kubo.abusers;

import mx.com.kubo.abusers.airplane.AirVehicle;
import mx.com.kubo.abusers.airplane.catalogs.AirPlaneType;
import mx.com.kubo.abusers.catalogs.DroneType;
import mx.com.kubo.abusers.airplane.impl.AirPlane;
import mx.com.kubo.abusers.impl.DroneFactory;
import mx.com.kubo.abusers.vant.Vant;
import org.junit.Test;

import static org.junit.Assert.*;

public class AirVehicleTest {
    
    AirPlane airPlane;
    
    @Test
    public void shouldReturnConcorde() {
        airPlane = new AirPlane(AirPlaneType.CONCORDE);
        assertTrue(2198.00d == airPlane.getSpeed());
        assertEquals("Concorde", airPlane.getType());
    }
    
    @Test(expected = RuntimeException.class)
    public void shouldThrowExpcetionWhenInstanceCarrierWithOneParameterConstructor() {
        new AirPlane(AirPlaneType.CARRIER);
    }
    
    @Test
    public void shouldReturnCarrier() {
        airPlane = new AirPlane(250);
        assertTrue(1875.00d == airPlane.getSpeed());
        assertEquals("Carrier", airPlane.getType());
    }
    
    @Test
    public void shouldReturnDroneSingleRotor() {
        Vant vant = DroneFactory.getVant(DroneType.SINGLE_ROTOR);
        assertTrue(100.00d == vant.getSpeed());
        assertTrue(3 == vant.getDroneType());
    }
    
    @Test
    public void shouldReturnDroneFixedWing() {
        Vant vant = DroneFactory.getVant(DroneType.FIXED_WING);
        assertTrue(150.00d == vant.getSpeed());
        assertTrue(2 == vant.getDroneType());
    }
    
    @Test
    public void shouldReturnDroneMultiRotor() {
        Vant vant = DroneFactory.getVant(DroneType.MULTI_ROTOR);
        assertTrue(60.00d == vant.getSpeed());
        assertTrue(1 == vant.getDroneType());
    }
}