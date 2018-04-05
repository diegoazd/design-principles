package mx.com.kubo.bloaters;

public class UserCredentials {
    String user;
    String password;

    public UserCredentials(String user, String password) {
        this.user = user;
        this.password = password;
    }

    public String getUser() {
        return user;
    }

    public String getPassword() {
        return password;
    }
}
