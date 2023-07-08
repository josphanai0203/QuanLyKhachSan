package model;

public class Room {
    private int id_room;
    private String name;
    private double area;
    private int max_people;
    private String roomType;
    private String rentType;
    private boolean isUsed;

    public Room(int id_room, String name, double area, int max_people, String roomType, String rentType, boolean isUsed) {
        this.id_room = id_room;
        this.name = name;
        this.area = area;
        this.max_people = max_people;
        this.roomType = roomType;
        this.rentType = rentType;
        this.isUsed = isUsed;
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

    public int getMax_people() {
        return max_people;
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

    public void setMax_people(int max_people) {
        this.max_people = max_people;
    }

    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    public String getRentType() {
        return rentType;
    }

    public void setRentType(String rentType) {
        this.rentType = rentType;
    }

    @Override
    public String toString() {
        return "Room{" + "id_room=" + id_room + ", name=" + name + ", area=" + area + ", max_people=" + max_people + ", roomType=" + roomType + ", rentType=" + rentType + ", isUsed=" + isUsed + '}';
    }
    
}
