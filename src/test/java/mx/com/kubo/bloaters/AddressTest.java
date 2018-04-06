package mx.com.kubo.bloaters;

import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.*;

public class AddressTest {

    Address address;

    @Test
    public void shouldBeInvalidByEmptyStreet() {
        address = new Address(null, null, null, null, null,
                null, null, null);
        assertFalse(address.isValid());

        address = new Address("", null, null, null, null,
                null, null, null);
        assertFalse(address.isValid());
    }

    @Test
    public void shouldBeInvalidByEmptyNumberInt() {
        address = new Address("street", null, null, null, null,
                null, null, null);
        assertFalse(address.isValid());
    }

    @Test
    public void shouldBeInvalidByEmptyNumberExt() {
        address = new Address("street", "numb Int", null, null, null,
                null, null, null);
        assertFalse(address.isValid());
    }

    @Test
    public void shouldBeInvalidByEmptyPostalCode() {
        address = new Address("street", "numb Int", "numb ext", null, null,
                null, null, null);
        assertFalse(address.isValid());
    }

    @Test
    public void shouldBeInvalidByEmptyColony() {
        address = new Address("street", "numb Int", "numb ext",
                "postal code", null,
                null, null, null);
        assertFalse(address.isValid());
    }

    @Test
    public void shouldBeInvalidByEmptyCity() {
        address = new Address("street", "numb Int", "numb ext",
                "postal code", "colony",
                null, null, null);
        assertFalse(address.isValid());
    }

    @Test
    public void shouldBeInvalidByEmptyState() {
        address = new Address("street", "numb Int", "numb ext",
                "postal code", "colony",
                "city", "", null);
        assertFalse(address.isValid());
    }

    @Test
    public void shouldBeValidAddress() {
        address = new Address("street", "numb Int", "numb ext",
                "postal code", "colony",
                "city", "state", "country");
        assertTrue(address.isValid());
    }
}