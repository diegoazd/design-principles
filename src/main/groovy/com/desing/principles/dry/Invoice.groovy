package com.design.principles.dry

class Invoice {

  List<LineItem> items
  String customer
  BigDecimal total

  String asciiStatement() {
    StringBuffer result = new StringBuffer();
    result.append("Bill for " + customer + "\n");
    items.each { lineItem ->
      result.append("\t" + lineItem.getProduct() + "\t\t"
          + lineItem.getAmount() + "\n");
    }
    result.append("total owed:" + total + "\n");
    return result.toString();
  }

  String htmlStatement() {
    StringBuffer result = new StringBuffer();
    result.append("<P>Bill for <I>" + customer + "</I></P>");
    result.append("<table>");
    items.each { lineItem ->
      result.append("<tr><td>" + lineItem.getProduct()
          + "</td><td>" + lineItem.getAmount() + "</td></tr>");
    }
    result.append("</table>");
    result.append("<P> total owed:<B>" + total + "</B></P>");
    return result.toString();
  }
}
