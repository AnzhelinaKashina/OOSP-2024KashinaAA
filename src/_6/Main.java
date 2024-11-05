package _6;

public class Main {
    public static void main(String[] args) {
        Transport car = new Car();
        Transport bicycle = new Bicycle();
        Transport train = new Train();

        System.out.println("Перемещение автомобиля:");
        car.move();
        System.out.println();

        System.out.println("Перемещение велосипеда:");
        bicycle.move();
        System.out.println();

        System.out.println("Перемещение поезда:");
        train.move();
    }
}
