package mx.com.kubo.preventers;

import mx.com.kubo.preventers.reports.impl.Invoice;
import mx.com.kubo.preventers.reports.impl.Item;
import org.junit.Before;
import org.junit.Test;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class InvoiceTest {

    Invoice invoice;
    List<Item> items;
    String user;

    String asciiStatement = "Bill for user\n\titem 1\t\t10.0\n\titem 2\t\t15.0\ntotal owed: 25.0";
    String htmlStatement = "<p>Bill for <i>user</i></p><table><tr><td>item 1</td><td>10.0</td></tr><tr><td>item 2</td><td>15.0</td></tr></table>"+
            "<p>total owed: <b>25.0</b></p>";

    String xmlStatement = "<bill><to>Bill for user</to><items><item><name>item 1</name><price>10.0</price></item><item><name>item 2</name><price>15.0</price></item></items><total>total owed: 25.0</total></bill>";

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
    public void shouldGetAsciiStatement() {
        assertEquals(asciiStatement, invoice.asciiStatement());
    }

    @Test
    public void shouldGetHtmlStatement() {
        assertEquals(htmlStatement, invoice.htmlStatement());
    }

    @Test
    public void shouldGetXmlStatement() {
        assertEquals(xmlStatement, invoice.xmlStatement());
    }
}