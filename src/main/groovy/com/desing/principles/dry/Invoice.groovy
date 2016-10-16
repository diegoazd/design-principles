package com.design.principles.dry

import com.desing.principles.dry.printer.AsciiBillPrinter
import com.desing.principles.dry.printer.BillPrinter
import com.desing.principles.dry.printer.HtmlBillPrinter

class Invoice {

  List<LineItem> items
  String customer
  BigDecimal total

  String asciiStatement() {
      statement(new AsciiBillPrinter())
  }
    
  String htmlStatement() {
    statement(new HtmlBillPrinter())
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


}
