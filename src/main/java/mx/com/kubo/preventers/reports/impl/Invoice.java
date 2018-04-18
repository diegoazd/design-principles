package mx.com.kubo.preventers.reports.impl;

import mx.com.kubo.preventers.reports.InvoicePrinter;
import mx.com.kubo.preventers.reports.print.AsciiPrinter;
import mx.com.kubo.preventers.reports.print.BillPrinter;
import mx.com.kubo.preventers.reports.print.HtmlPrinter;
import mx.com.kubo.preventers.reports.print.XmlPrinter;

import java.math.BigDecimal;
import java.util.List;

public class Invoice implements InvoicePrinter {

    private List<Item> lineItem;
    private String customer;
    private BigDecimal total;

    public Invoice(List<Item> lineItem, String customer) {
        this.lineItem = lineItem;
        this.customer = customer;
    }

    @Override
    public String asciiStatement() {
        return statement(new AsciiPrinter());
    }

    @Override
    public String htmlStatement() {
        return statement(new HtmlPrinter());
    }

    @Override
    public String xmlStatement() {
        return statement(new XmlPrinter());
    }

    private String statement(BillPrinter billPrinter) {
        total = BigDecimal.ZERO;
        StringBuffer sb = new StringBuffer(billPrinter.header(customer));

        lineItem.stream().forEach(item -> {
            sb.append(billPrinter.item(item));
            total = total.add(item.getPrice());
        });

        sb.append(billPrinter.total(total));
        return sb.toString();
    }

    public List<Item> getLineItem() {
        return lineItem;
    }
}
