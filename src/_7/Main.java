package _7;

public class Main {
    public static void main(String[] args) {
        RoomBuilder builder = new ConcreteRoomBuilder();
        RoomDirector director = new RoomDirector(builder);

        Room room = director.constructRoom(20.5, "Синий", "Диван, Стол");
        System.out.println(room);
    }
}
