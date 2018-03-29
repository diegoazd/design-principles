package mx.com.kubo.bloaters.primitive.obsession;

public class Login {

    public static final int ADMIN_ROLE = 1;
    public static final int MANAGER_ROLE = 2;
    public static final int CUSTOMER_SERVICE = 3;
    public static final int ACCOUNTANT = 4;
    public static final int USER = 5;

    public User Login(String user, String password) {
        if(user.equals("admin")) {
            return new User(user, password, ADMIN_ROLE);
        }else if(user.equals("manager")){
            return new User(user, password, MANAGER_ROLE);
        }else if(user.equals("accountant")){
            return new User(user, password, ACCOUNTANT);
        }else if(user.equals("user")){
            return new User(user, password, USER);
        }else if(user.equals("customer_service")){
            return new User(user, password, CUSTOMER_SERVICE);
        }

        throw new RuntimeException("user not found");
    }
}
