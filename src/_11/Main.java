package _11;


public class Main {
    public static void main(String[] args) {
        DocumentManager documentManager = new DocumentManager();

        ReportTemplate reportTemplate = new ReportTemplate("Годовой отчет", "Это содержание годового отчета.");
        InvoiceTemplate invoiceTemplate = new InvoiceTemplate("INV-001", "Компания Getta");

        documentManager.addTemplate("report", reportTemplate);
        documentManager.addTemplate("invoice", invoiceTemplate);

        DocumentPrototype clonedReport = documentManager.createDocument("report");
        DocumentPrototype clonedInvoice = documentManager.createDocument("invoice");

        System.out.println(clonedReport.getContent());
        System.out.println(clonedInvoice.getContent());
    }
}
