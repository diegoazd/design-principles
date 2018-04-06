package mx.com.kubo.bloaters;

import java.util.HashMap;
import java.util.Map;

public class UserManagement {

    private Map<String, User> users;

    public UserManagement() {
        users = new HashMap<>();
        buildUsers();
    }

    public User login(UserCredentials userCredentials) {
        return fetchUser(userCredentials, users.get(userCredentials.getUser()));
    }

    private User fetchUser(UserCredentials userCredentials, User loggedUser) {
        if(isValid(userCredentials, loggedUser)) {
            throw new RuntimeException("user not found");
        }

        return loggedUser;
    }

    private boolean isValid(UserCredentials userCredentials, User loggedUser) {
        return loggedUser == null || !match(userCredentials, loggedUser);
    }

    private boolean match(UserCredentials userCredentials, User user) {
       return user.getCredentials().equals(userCredentials);
    }

    public User register(UserCredentials userCredentials) {
        if(users.get(userCredentials.getUser()) == null) {
           return new User(userCredentials, UserRoles.USER_ROLE);
        }else {
            throw new RuntimeException("Users cant be registere");
        }
    }

    public boolean validateAddress(String street, String numberInt, String numberExt, String postalCode,
                                   String colony, String city, String state, String country) {
        return new Address(street, numberInt, numberExt, postalCode, colony, city, state, country).isValid();
    }

    private void buildUsers() {
        addUser("admin", "securePassword", UserRoles.ADMIN_ROLE);
        addUser("manager", "securePassword", UserRoles.MANAGER_ROLE);
        addUser("accountant", "securePassword", UserRoles.ACCOUNTANT_ROLE);
        addUser("user", "securePassword", UserRoles.USER_ROLE);
        addUser("customer_service", "securePassword", UserRoles.CUSTOMER_SERVICE_ROLE);
    }

    private void addUser(String user, String password, UserRoles userRoles) {
        users.put(user, new User(new UserCredentials(user, password), userRoles));
    }
}
