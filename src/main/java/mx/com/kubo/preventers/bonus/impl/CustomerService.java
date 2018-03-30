package mx.com.kubo.preventers;

import mx.com.kubo.preventers.bonus.Employee;

public class CustomerService implements Employee {
    private int customerServiceId;
    private String name;
    private String type = "Customer Service";

    public CustomerService(int customerServiceId, String name) {
        this.name = name;
        this.customerServiceId = customerServiceId;
    }

    public String getName() {
        return name;
    }

    @Override
    public int getId() {
        return customerServiceId;
    }

    @Override
    public String getType() {
        return type;
    }
}
