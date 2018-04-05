package mx.com.kubo.bloaters;

public class User {
    private UserCredentials credentials;
    private UserRoles userRole;

    public User(UserCredentials credentials, UserRoles userRole) {
        this.credentials = credentials;
        this.userRole = userRole;
    }

    public UserCredentials getCredentials() {
        return credentials;
    }

    public UserRoles getUserRole() {
        return userRole;
    }

}
