package mx.com.kubo.preventers.bonus.impl;

import mx.com.kubo.preventers.bonus.Bonus;
import mx.com.kubo.preventers.bonus.Employee;
import mx.com.kubo.preventers.reports.impl.Invoice;

import java.math.BigDecimal;

public class BonusPremiumCustomerService implements Bonus {

    private Employee employee;
    private Invoice invoice;

    public BonusPremiumCustomerService(Employee employee, Invoice invoice) {
        this.employee = employee;
        this.invoice = invoice;
    }


    @Override
    public BigDecimal calculateBonus() {
        return invoice.getLineItem().stream().map(item -> item.getPrice())
                .reduce(BigDecimal.ZERO, BigDecimal::add)
                .multiply(BigDecimal.valueOf(0.07d));
    }

    @Override
    public String bonusType() {
        return "Premium customer service";
    }

    @Override
    public String getHeader() {
        return employee.getId()+" - "+employee.getName()+" - "+employee.getType();
    }
}
