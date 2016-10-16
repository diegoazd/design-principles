package com.design.principles.dry

import com.desing.principles.dry.printer.AsciiBillPrinter
import com.desing.principles.dry.printer.BillPrinter

class Invoice {

  List<LineItem> items
  String customer
  BigDecimal total

  String asciiStatement() {
      statement(new AsciiBillPrinter())
  }

  private String statement(BillPrinter billPrinter) {
    StringBuffer result = new StringBuffer()
    result.append(billPrinter.header(customer))
    items.each { lineItem ->
      result.append(billPrinter.printAmounts(lineItem))
    }
    result.append(billPrinter.total(total))
    result.toString();
  }


    String htmlStatement() {
    StringBuffer result = new StringBuffer();
    result.append("<P>Bill for <I>" + customer + "</I></P>")
    result.append("<table>")
    items.each { lineItem ->
      result.append("<tr><td>" + lineItem.getProduct()
          + "</td><td>" + lineItem.getAmount() + "</td></tr>")
    }
    result.append("</table>");
    result.append("<P> total owed:<B>" + total + "</B></P>")
    result.toString()
  }
}
