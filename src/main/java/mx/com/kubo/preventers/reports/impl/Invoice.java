package mx.com.kubo.preventers.impl;

import mx.com.kubo.preventers.InvoicePrinter;

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
        total = BigDecimal.ZERO;
        StringBuffer sb = new StringBuffer("Bill for ").append(customer).append("\n");
        lineItem.stream().forEach(item -> {sb.append("\t")
                                            .append(item.getName())
                                            .append("\t\t")
                                            .append(item.getPrice())
                                            .append("\n");
           total = total.add(item.getPrice());
        });

        sb.append("total owed: ").append(total);
        return sb.toString();
    }

    @Override
    public String htmlStatement() {
        total = BigDecimal.ZERO;
        StringBuffer sb = new StringBuffer("<p>Bill for <i>").append(customer)
                .append("</i></p><table>");
        lineItem.stream().forEach(item -> {
            sb.append("<tr><td>")
                    .append(item.getName())
                    .append("</td>")
            .append("<td>")
            .append(item.getPrice())
            .append("</td></tr>");
            total = total.add(item.getPrice());
        });
        sb.append("</table>")
                .append("<p>total owed: <b>")
                .append(total)
                .append("</b></p>");

        return sb.toString();
    }

    @Override
    public String xmlStatement() {
        total = BigDecimal.ZERO;
        StringBuffer sb = new StringBuffer();
        sb.append("<bill><to>Bill for ").append(customer).append("</to><items>");
        lineItem.stream().forEach(item -> {
            sb.append("<item><name>")
                    .append(item.getName())
                    .append("</name>")
                    .append("<price>")
                    .append(item.getPrice())
                    .append("</price>")
                    .append("</item>");
            total = total.add(item.getPrice());
        });
        sb.append("</items><total>total owed: ")
                .append(total)
                .append("</total></bill>");

        return sb.toString();
    }

    public List<Item> getLineItem() {
        return lineItem;
    }


}
