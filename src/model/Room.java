package model;

public class Room {

    private int id_room;
    private String name;
    private double area;
    private String roomType;
    private boolean isUsed;

    public Room(int id_room, String name, double area, String roomType, boolean isUsed) {
        this.id_room = id_room;
        this.name = name;
        this.area = area;
        this.roomType = roomType;
        this.isUsed = isUsed;
    }

    public Room(int id_room) {
        this.id_room = id_room;
    }

    public Room(String name) {
        this.name = name;
    }

    public Room() {
    }
    
    public void setIsUsed(boolean isUsed) {
        this.isUsed = isUsed;
    }

    public boolean isIsUsed() {
        return isUsed;
    }

    public int getId_room() {
        return id_room;
    }

    public String getName() {
        return name;
    }

    public double getArea() {
        return area;
    }

    public void setId_room(int id_room) {
        this.id_room = id_room;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

  

}
