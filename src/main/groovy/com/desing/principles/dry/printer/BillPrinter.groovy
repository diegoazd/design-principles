package com.desing.principles.dry.printer

import com.design.principles.dry.LineItem


interface BillPrinter {
  String header(String customer)
  String printAmounts(LineItem item)
  String total(BigDecimal total)  
}
