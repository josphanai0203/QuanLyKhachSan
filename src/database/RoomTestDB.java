package database;

import dao.*;
import java.util.ArrayList;
import model.Room;

public class RoomTestDB {
    public static void main(String[] args) {
        //Room r1 = new Room(7,"ten phong",5,40, 2, 1);
        //RoomDAO.getInstance().add(r1);
        RoomDAO.getInstance().selectAll();
        //RoomDAO.getInstance().delete();
    }

}
