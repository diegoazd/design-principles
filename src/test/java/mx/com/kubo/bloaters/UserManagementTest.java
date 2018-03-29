package mx.com.kubo.bloaters;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class UserManagementTest {

    UserManagement userManagement;

    @Before
    public void setup() {
        userManagement = new UserManagement();
    }

    @Test
    public void shouldLoginAsAdministrator() {
        User user = userManagement.login("admin", "securePassword");
        assertNotNull(user);
        assertEquals("admin", user.getUser());
        assertEquals(UserManagement.ADMIN_ROLE, user.getUserRole());
    }

    @Test
    public void shouldLoginAsManager() {
        User user = userManagement.login("manager", "securePassword");
        assertNotNull(user);
        assertEquals("manager", user.getUser());
        assertEquals(UserManagement.MANAGER_ROLE, user.getUserRole());
    }

    @Test
    public void shouldLoginAsCustomerService() {
        User user = userManagement.login("customer_service", "securePassword");
        assertNotNull(user);
        assertEquals("customer_service", user.getUser());
        assertEquals(UserManagement.CUSTOMER_SERVICE_ROLE, user.getUserRole());
    }

    @Test
    public void shouldLoginAsAccountant() {
        User user = userManagement.login("accountant", "securePassword");
        assertNotNull(user);
        assertEquals("accountant", user.getUser());
        assertEquals(UserManagement.ACCOUNTANT_ROLE, user.getUserRole());
    }

    @Test
    public void shouldLoginAsUser() {
        User user = userManagement.login("user", "securePassword");
        assertNotNull(user);
        assertEquals("user", user.getUser());
        assertEquals(UserManagement.USER_ROLE, user.getUserRole());
    }

    @Test(expected = RuntimeException.class)
    public void shouldThrowExceptionWHenUserNotFound() {
        userManagement.login("foo", "securePassword");
    }

    @Test
    public void shouldRegisterUser() {
        User user = userManagement.register("abcde", "securePassword");
        assertEquals("abcde", user.getUser());
        assertEquals("securePassword", user.getPassword());
        assertEquals(UserManagement.USER_ROLE, user.getUserRole());
    }

    @Test(expected = RuntimeException.class)
    public void shouldThrowExceptionWhenRegisterUser() {
        userManagement.register("admin", "securePassword");
    }

}