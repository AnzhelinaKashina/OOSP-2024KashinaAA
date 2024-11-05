package _11;

public class ReportTemplate implements DocumentPrototype {
    private String title;
    private String body;

    public ReportTemplate(String title, String body) {
        this.title = title;
        this.body = body;
    }

    @Override
    public DocumentPrototype clone() {
        return new ReportTemplate(this.title, this.body);
    }

    @Override
    public String getContent() {
        return "Отчет: " + title + "\n" + body;
    }
}
