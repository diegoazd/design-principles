package mx.com.kubo.bloaters;

public enum UserRoles {
    ADMIN_ROLE(1), MANAGER_ROLE(2), CUSTOMER_SERVICE_ROLE(3),
    ACCOUNTANT_ROLE(4), USER_ROLE(5);

    private int role;

    UserRoles(int role) {
        this.role = role;
    }
}
