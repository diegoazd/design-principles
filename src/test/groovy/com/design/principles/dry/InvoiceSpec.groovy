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

  void "Should print an html statement"() {
    setup:
    Invoice invoice = new Invoice()
    invoice.customer = 'foo fighters'
    invoice.total = 12.50
    invoice.items = [new LineItem(product: 'test producto', amount: 12.50)]
    expect:
    invoice.htmlStatement() == '<P>Bill for <I>foo fighters</I></P><table><tr><td>test producto</td><td>12.50</td></tr></table><P> total owed:<B>12.50</B></P>'
  }
}
