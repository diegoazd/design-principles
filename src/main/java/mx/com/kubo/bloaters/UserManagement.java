package mx.com.kubo.bloaters;

import java.util.HashMap;
import java.util.Map;

public class UserManagement {

    private Map<String, User> users;

    public UserManagement() {
        users = new HashMap<>();
        users.put("admin", new User(new UserCredentials("admin", "securePassword"), UserRoles.ADMIN_ROLE));
        users.put("manager", new User(new UserCredentials("manager", "securePassword"), UserRoles.MANAGER_ROLE));
        users.put("accountant", new User(new UserCredentials("accountant", "securePassword"), UserRoles.ACCOUNTANT_ROLE));
        users.put("user", new User(new UserCredentials("user", "securePassword"), UserRoles.USER_ROLE));
        users.put("customer_service", new User(new UserCredentials("customer_service", "securePassword"), UserRoles.CUSTOMER_SERVICE_ROLE));
    }


    public User login(UserCredentials userCredentials) {
        User loggedUser = users.get(userCredentials.getUser());

        if(loggedUser != null && verifyUser(userCredentials, loggedUser)) {
           return  loggedUser;
        }

        throw new RuntimeException("user not found");
    }

    private boolean verifyUser(UserCredentials userCredentials, User user) {
       return user.getCredentials().getPassword().equals(userCredentials.getPassword());
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
}
