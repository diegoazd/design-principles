package mx.com.kubo.bloaters.primitive.obsession;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class LoginTest {

    Login login;

    @Before
    public void setup() {
        login = new Login();
    }

    @Test
    public void shouldLoginAsAdministrator() {
        User user = login.Login("admin", "securePassword");
        assertNotNull(user);
        assertEquals("admin", user.getUser());
        assertEquals(Login.ADMIN_ROLE, user.getUserRole());
    }

    @Test
    public void shouldLoginAsManager() {
        User user = login.Login("manager", "securePassword");
        assertNotNull(user);
        assertEquals("manager", user.getUser());
        assertEquals(Login.MANAGER_ROLE, user.getUserRole());
    }

    @Test
    public void shouldLoginAsCustomerService() {
        User user = login.Login("customer_service", "securePassword");
        assertNotNull(user);
        assertEquals("customer_service", user.getUser());
        assertEquals(Login.CUSTOMER_SERVICE, user.getUserRole());
    }

    @Test
    public void shouldLoginAsAccountant() {
        User user = login.Login("accountant", "securePassword");
        assertNotNull(user);
        assertEquals("accountant", user.getUser());
        assertEquals(Login.ACCOUNTANT, user.getUserRole());
    }

    @Test
    public void shouldLoginAsUser() {
        User user = login.Login("user", "securePassword");
        assertNotNull(user);
        assertEquals("user", user.getUser());
        assertEquals(Login.USER, user.getUserRole());
    }

    @Test(expected = RuntimeException.class)
    public void shouldThrowExceptionWHenUserNotFound() {
        login.Login("foo", "securePassword");
    }

}