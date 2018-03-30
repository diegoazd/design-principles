package mx.com.kubo.preventers.bonus;

import mx.com.kubo.preventers.impl.Invoice;

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
}
