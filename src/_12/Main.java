package _12;

public class Main {
    public static void main(String[] args) {
        Component text1 = new TextNode("Hello, World!");
        Component text2 = new TextNode("Добро пожаловать в паттерн Компоновщик.");

        CompositeNode composite = new CompositeNode();
        composite.add(text1);
        composite.add(text2);

        Document document = new Document(composite);

        document.display();
    }
}
