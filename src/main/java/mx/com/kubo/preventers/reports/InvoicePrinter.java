package mx.com.kubo.preventers.reports;

public interface InvoicePrinter {

    String asciiStatement();
    String htmlStatement();
    String xmlStatement();
}
