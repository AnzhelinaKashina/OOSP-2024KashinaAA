package _12;

public class Document {
    private Component root;

    public Document(Component root) {
        this.root = root;
    }

    public void display() {
        root.display();
    }
}
