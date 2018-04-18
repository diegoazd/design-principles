package mx.com.kubo.preventers.reports.print;

import mx.com.kubo.preventers.reports.impl.Item;
import java.math.BigDecimal;

public interface BillPrinter {
    String header(String customer);
    String item(Item item);
    String total(BigDecimal total);
}
