package com.design.principles.dry

import spock.lang.*

class InvoiceSpec extends Specification {
  
  void "Should print an ascii statement"() {
    setup:
    Invoice invoice = new Invoice()
    invoice.customer = 'foo fighters'
    invoice.total = 12.50
    invoice.items = [new LineItem(product: 'test producto', amount: 12.50)]
    expect:
    invoice.asciiStatement() == 'Bill for foo fighters\n\ttest producto\t\t12.50\ntotal owed:12.50\n'
  }
}
