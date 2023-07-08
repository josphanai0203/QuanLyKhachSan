package model;

public class Room {
    private int id_room;
    private String name;
    private double area;
    private int max_people;
    private int id_room_type;
    private int id_rent_type;

    public Room(int id_room, String name, int max_people, double area, int id_room_type, int id_rent_type){
        this.id_room = id_room;
        this.name = name;
        this.max_people = max_people;
        this.area = area;
        this.id_room_type = id_room_type;
        this.id_rent_type = id_rent_type;
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

    public int getId_room_type() {
        return id_room_type;
    }

    public int getId_rent_type() {
        return id_rent_type;
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

    public void setId_room_type(int id_room_type) {
        this.id_room_type = id_room_type;
    }

    public void setId_rent_type(int id_rent_type) {
        this.id_rent_type = id_rent_type;
    }
}
