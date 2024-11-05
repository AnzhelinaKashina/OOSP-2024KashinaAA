package _5;

public class Main {
    public static void main(String[] args) {
        TaskManager taskManager = new TaskManager();

        User user1 = new User("Анжелика");
        User user2 = new User("Мария");

        taskManager.attach(user1);
        taskManager.attach(user2);

        taskManager.addTask("Задача 1: Подготовить отчет");
        taskManager.addTask("Задача 2: Провести встречу с клиентом");
    }
}
