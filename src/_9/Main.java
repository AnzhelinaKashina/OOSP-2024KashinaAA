package _9;

public class Main {
    public static void main(String[] args) {
        AppConfig config = AppConfig.getInstance();


        config.setAppName("Мое приложение");
        config.setVersion("1.0");
        config.setDatabaseUrl("jdbc:mysql://localhost:3306/mydb");

        System.out.println("Название приложения: " + config.getAppName());
        System.out.println("Версия: " + config.getVersion());
        System.out.println("URL базы данных: " + config.getDatabaseUrl());
    }
}
