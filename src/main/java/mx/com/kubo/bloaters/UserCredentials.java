package mx.com.kubo.bloaters;

public class UserCredentials {
    private String user;
    private String password;

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

    @Override
    public boolean equals(Object o) {
        if(o == null) return false;
        final UserCredentials compare = (UserCredentials)o;
        return user.equals(compare.getUser()) && password.equals(compare.getPassword());
    }
}
