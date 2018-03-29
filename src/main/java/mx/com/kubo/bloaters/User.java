package mx.com.kubo.bloaters;

public class User {
    private String user;
    private String password;
    private int userRole;

    public User(String user, String password, int userRole) {
        this.user = user;
        this.password = password;
        this.userRole = userRole;
    }

    public int getUserRole() {
        return userRole;
    }

    public String getPassword() {
        return password;
    }

    public String getUser() {
        return user;
    }
}
