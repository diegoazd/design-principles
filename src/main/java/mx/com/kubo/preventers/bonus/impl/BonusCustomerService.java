package mx.com.kubo.preventers.bonus.impl;

import mx.com.kubo.preventers.bonus.Bonus;
import mx.com.kubo.preventers.bonus.Employee;
import mx.com.kubo.preventers.reports.impl.Invoice;

import java.math.BigDecimal;

public class BonusCustomerService implements Bonus {

   private Employee customerService;
   private Invoice invoice;

   public BonusCustomerService(Employee employee, Invoice invoice) {
       this.customerService = employee;
       this.invoice = invoice;
   }


    @Override
    public BigDecimal calculateBonus() {
       return invoice.getLineItem().stream().map(item -> item.getPrice())
               .reduce(BigDecimal.ZERO, BigDecimal::add)
               .multiply(BigDecimal.valueOf(0.05d));
    }

    @Override
    public String bonusType() {
        return "Customer service bonus";
    }

    @Override
    public String getHeader() {
       return customerService.getId()+" - "+customerService.getName()+" - "+customerService.getType();
    }


}
