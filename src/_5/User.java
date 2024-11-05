package _5;

public class User implements Observer {
    private String name;

    public User(String name) {
        this.name = name;
    }

    @Override
    public void update(String task) {
        System.out.println(name + " получил уведомление о новой задаче: " + task);
    }
}
