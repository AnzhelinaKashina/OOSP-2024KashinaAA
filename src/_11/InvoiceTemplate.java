package _11;


public class InvoiceTemplate implements DocumentPrototype {
    private String invoiceNumber;
    private String clientName;

    public InvoiceTemplate(String invoiceNumber, String clientName) {
        this.invoiceNumber = invoiceNumber;
        this.clientName = clientName;
    }

    @Override
    public DocumentPrototype clone() {
        return new InvoiceTemplate(this.invoiceNumber, this.clientName);
    }

    @Override
    public String getContent() {
        return "Счет: " + invoiceNumber + "\nКлиент: " + clientName;
    }
}
