package _12;

import java.util.ArrayList;
import java.util.List;

public class CompositeNode implements Component {
    private List<Component> children = new ArrayList<>();

    public void add(Component component) {
        children.add(component);
    }

    public void remove(Component component) {
        children.remove(component);
    }

    @Override
    public void display() {
        for (Component child : children) {
            child.display();
        }
    }
}
