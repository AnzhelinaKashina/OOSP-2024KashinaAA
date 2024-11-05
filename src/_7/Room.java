package _7;

public class Room {
    private final double area;
    private final String wallColor;
    private final String furniture;

    public Room(double area, String wallColor, String furniture) {
        this.area = area;
        this.wallColor = wallColor;
        this.furniture = furniture;
    }

    @Override
    public String toString() {
        return "Комната{" +
                "площадь=" + area +
                ", цвет стен='" + wallColor + '\'' +
                ", мебель='" + furniture + '\'' +
                '}';
    }
}
