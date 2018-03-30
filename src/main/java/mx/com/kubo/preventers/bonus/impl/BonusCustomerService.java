package mx.com.kubo.preventers.bonus;

import mx.com.kubo.preventers.impl.Invoice;

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


}
