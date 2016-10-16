package com.desing.principles.dry.printer

import com.design.principles.dry.LineItem


class HtmlBillPrinter implements BillPrinter {
    
  @Override
  String header(String customer) {
    "<P>Bill for <I>$customer</I></P><table>"
  }

  @Override
  String printAmounts(LineItem lineItem) {
     "<tr><td>${lineItem.getProduct()}</td><td>${lineItem.getAmount()}</td></tr>"
  }

  @Override
  String total(BigDecimal total) {
     "</table><P> total owed:<B>$total</B></P>"
  }
}
