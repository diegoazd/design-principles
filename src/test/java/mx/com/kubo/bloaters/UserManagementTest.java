package mx.com.kubo.bloaters;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class UserManagementTest {

    UserManagement userManagement;

    @Before
    public void setup() {
        userManagement = new UserManagement();
    }

    @Test
    public void shouldLoginAsAdministrator() {
        User user = userManagement.login(new UserCredentials("admin", "securePassword"));
        assertNotNull(user);
        assertEquals("admin", user.getCredentials().getUser());
        assertEquals(UserRoles.ADMIN_ROLE, user.getUserRole());
    }

    @Test
    public void shouldLoginAsManager() {
        User user = userManagement.login(new UserCredentials("manager", "securePassword"));
        assertNotNull(user);
        assertEquals("manager", user.getCredentials().getUser());
        assertEquals(UserRoles.MANAGER_ROLE, user.getUserRole());
    }

    @Test
    public void shouldLoginAsCustomerService() {
        User user = userManagement.login(new UserCredentials("customer_service", "securePassword"));
        assertNotNull(user);
        assertEquals("customer_service", user.getCredentials().getUser());
        assertEquals(UserRoles.CUSTOMER_SERVICE_ROLE, user.getUserRole());
    }

    @Test
    public void shouldLoginAsAccountant() {
        User user = userManagement.login(new UserCredentials("accountant", "securePassword"));
        assertNotNull(user);
        assertEquals("accountant", user.getCredentials().getUser());
        assertEquals(UserRoles.ACCOUNTANT_ROLE, user.getUserRole());
    }

    @Test
    public void shouldLoginAsUser() {
        User user = userManagement.login(new UserCredentials("user", "securePassword"));
        assertNotNull(user);
        assertEquals("user", user.getCredentials().getUser());
        assertEquals(UserRoles.USER_ROLE, user.getUserRole());
    }

    @Test(expected = RuntimeException.class)
    public void shouldThrowExceptionWHenUserNotFound() {
        userManagement.login(new UserCredentials("foo", "securePasssword"));
    }

    @Test(expected = RuntimeException.class)
    public void shouldThrowExceptionWhenUserPasswordNotMatch() {
        userManagement.login(new UserCredentials("user", "incorrectPassword"));
    }


        @Test
    public void shouldRegisterUser() {
        User user = userManagement.register(new UserCredentials("abcde", "securePassword"));
        assertEquals("abcde", user.getCredentials().getUser());
        assertEquals("securePassword", user.getCredentials().getPassword());
        assertEquals(UserRoles.USER_ROLE, user.getUserRole());
    }

    @Test(expected = RuntimeException.class)
    public void shouldThrowExceptionWhenRegisterUser() {
        userManagement.register(new UserCredentials("admin","securePassword"));
    }

    @Test
    public void shouldCreateAddress() {
        assertTrue(userManagement.validateAddress("street", "number int", "number int", "" +
                "postal code", "colony", "city", "state", "country"));
    }

}