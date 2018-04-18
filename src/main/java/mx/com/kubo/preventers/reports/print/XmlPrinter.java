package mx.com.kubo.preventers.reports.print;

import mx.com.kubo.preventers.reports.impl.Item;

import java.math.BigDecimal;

public class XmlPrinter implements BillPrinter {
    @Override
    public String header(String customer) {
        return "<bill><to>Bill for "+customer+"</to><items>";
    }

    @Override
    public String item(Item item) {
        return "<item><name>"+item.getName()+
               "</name><price>"+item.getPrice()+
               "</price></item>";
    }

    @Override
    public String total(BigDecimal total) {
        return "</items><total>total owed: "+
                total+"</total></bill>";
    }
}
