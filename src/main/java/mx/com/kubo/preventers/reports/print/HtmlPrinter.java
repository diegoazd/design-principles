package mx.com.kubo.preventers.reports.print;

import mx.com.kubo.preventers.reports.impl.Item;

import java.math.BigDecimal;

public class HtmlPrinter implements BillPrinter {
    @Override
    public String header(String customer) {
        return "<p>Bill for <i>"+customer+
                "</i></p><table>";
    }

    @Override
    public String item(Item item) {
        return "<tr><td>"+item.getName()+
               "</td><td>"+item.getPrice()+
               "</td></tr>";
    }

    @Override
    public String total(BigDecimal total) {
        return "</table><p>total owed: <b>"+
                total+"</b></p>";
    }
}
