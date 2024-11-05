package _7;
class ConcreteRoomBuilder implements RoomBuilder {
    private double area;
    private String wallColor;
    private String furniture;

    @Override
    public RoomBuilder setArea(double area) {
        this.area = area;
        return this;
    }

    @Override
    public RoomBuilder setWallColor(String color) {
        this.wallColor = color;
        return this;
    }

    @Override
    public RoomBuilder setFurniture(String furniture) {
        this.furniture = furniture;
        return this;
    }

    @Override
    public Room build() {
        return new Room(area, wallColor, furniture);
    }
}
