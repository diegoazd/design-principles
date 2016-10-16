package com.desing.principles.dry.printer

import com.design.principles.dry.LineItem


class AsciiBillPrinter implements BillPrinter {

    @Override
    String header(String customer) {
      "Bill for $customer\n"
    }

    @Override
    String printAmounts(LineItem lineItem) {
        "\t${lineItem.getProduct()}\t\t${lineItem.getAmount()}\n"
    }

    @Override
    String total(BigDecimal total) {
        "total owed:$total\n"
    }
}
