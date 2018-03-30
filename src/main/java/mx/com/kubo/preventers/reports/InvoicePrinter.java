package mx.com.kubo.preventers;

public interface InvoicePrinter {

    String asciiStatement();
    String htmlStatement();
    String xmlStatement();
}
