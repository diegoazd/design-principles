package mx.com.kubo.preventers.reports.print;

import mx.com.kubo.preventers.reports.impl.Item;

import java.math.BigDecimal;

public class AsciiPrinter implements BillPrinter {

    @Override
    public String header(String customer) {
        return "Bill for "+customer+"\n";
    }

    @Override
    public String item(Item item) {
        return "\t"+item.getName()+"\t\t"+
               item.getPrice()+"\n";
    }

    @Override
    public String total(BigDecimal total) {
        return "total owed: "+total;
    }
}
