package _7;

class RoomDirector {
    private final RoomBuilder roomBuilder;

    public RoomDirector(RoomBuilder roomBuilder) {
        this.roomBuilder = roomBuilder;
    }

    public Room constructRoom(double area, String wallColor, String furniture) {
        return roomBuilder.setArea(area)
                .setWallColor(wallColor)
                .setFurniture(furniture)
                .build();
    }
}
