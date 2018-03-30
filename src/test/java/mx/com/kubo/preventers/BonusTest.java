package mx.com.kubo.preventers;

import mx.com.kubo.preventers.bonus.*;
import mx.com.kubo.preventers.bonus.impl.BonusCustomerService;
import mx.com.kubo.preventers.bonus.impl.BonusPremiumCustomerService;
import mx.com.kubo.preventers.bonus.impl.CustomerService;
import mx.com.kubo.preventers.bonus.impl.PremiumCustomerService;
import mx.com.kubo.preventers.reports.impl.Invoice;
import mx.com.kubo.preventers.reports.impl.Item;
import org.junit.Before;
import org.junit.Test;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class BonusTest {

    List<Item> items;
    String user;
    Invoice invoice;

    @Before
    public void setup() {
        items = new ArrayList<>();
        Item item = new Item(1, "item 1", BigDecimal.valueOf(10.00d));
        Item item2= new Item(2, "item 2", BigDecimal.valueOf(15.00d));
        items.add(item);
        items.add(item2);
        user = "user";

        invoice = new Invoice(items, user);
    }

    @Test
    public void calculateBonus() throws Exception {
        Employee employee = new CustomerService(1, "foo");
        Bonus bonus = new BonusCustomerService(employee, invoice);
        assertEquals(new BigDecimal("1.250"), bonus.calculateBonus());
        assertEquals("Customer service bonus", bonus.bonusType());
        assertEquals("1 - foo - Customer Service", bonus.getHeader());
    }

    @Test
    public void calculatePremiumCustomerServiceBonus() throws Exception {
        Employee employee = new PremiumCustomerService(1, "foo");
        Bonus bonus = new BonusPremiumCustomerService(employee, invoice);
        assertEquals(new BigDecimal("1.750"), bonus.calculateBonus());
        assertEquals("Premium customer service", bonus.bonusType());
        assertEquals("1 - foo - Premium Customer Service", bonus.getHeader());
    }

}