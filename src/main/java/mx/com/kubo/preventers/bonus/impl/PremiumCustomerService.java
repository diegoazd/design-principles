package mx.com.kubo.preventers.bonus.impl;

import mx.com.kubo.preventers.bonus.Employee;

public class PremiumCustomerService implements Employee {

    private int premiumCustomerServiceId;
    private String name;
    private String type = "Premium Customer Service";

    public PremiumCustomerService(int premiumCustomerServiceId, String name) {
        this.name = name;
        this.premiumCustomerServiceId = premiumCustomerServiceId;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getId() {
        return premiumCustomerServiceId;
    }

    @Override
    public String getType() {
        return type;
    }
}
