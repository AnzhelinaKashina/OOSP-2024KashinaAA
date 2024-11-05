package _7;

interface RoomBuilder {
    RoomBuilder setArea(double area);
    RoomBuilder setWallColor(String color);
    RoomBuilder setFurniture(String furniture);
    Room build();
}
