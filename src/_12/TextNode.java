package _12;
public class TextNode implements Component {
    private String text;

    public TextNode(String text) {
        this.text = text;
    }

    @Override
    public void display() {
        System.out.println("Text: " + text);
    }
}
