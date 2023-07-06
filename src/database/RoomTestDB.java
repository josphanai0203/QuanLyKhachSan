package database;

import dao.*;
import model.Room;

public class RoomTestDB {
    public static void main(String[] args) {
        Room r1 = new Room(1,"Room1",10, 10, 1, 12000);
            RoomDAO.getInstance().add(r1);
    }

}
