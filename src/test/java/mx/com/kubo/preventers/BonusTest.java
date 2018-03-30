package mx.com.kubo.preventers;

import org.junit.Before;
import org.junit.Test;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class ComissionCustomerServiceTest {

    List<Item> items;
    String user;
    Invoice invoice;
    CustomerService customerService;

    @Before
    public void setup() {
        items = new ArrayList<>();
        Item item = new Item(1, "item 1", BigDecimal.valueOf(10.00d));
        Item item2= new Item(2, "item 2", BigDecimal.valueOf(15.00d));
        items.add(item);
        items.add(item2);
        user = "user";

        invoice = new Invoice(items, user);
        customerService = new CustomerService(1, "foo");
    }

    @Test
    public void calculateBonus() throws Exception {
        CustomerService customerService = new CustomerService(1, "foo");
        ComissionCustomerService comissionCustomerService = new ComissionCustomerService()
        assertEquals(BigDecimal.valueOf(1.25d), );
    }

}