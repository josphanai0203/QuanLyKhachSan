package controller;
import dao.*;
import model.*;
import service.*;
import java.util.*;

public class RoomService implements  IService<Room> {
    private static RoomDAO rd= new RoomDAO();
    @Override
    public boolean add(Room r) {
        return rd.add(r);
    }

    @Override
    public ArrayList<Room> selectAll() {
        return rd.selectAll();
    }

    @Override
    public boolean update(Room r) {
        return rd.update(r);
    }

    @Override
    public boolean delete(Room r) {
        return rd.delete(r);
    }

    @Override
    public Room findById(Room r) {
        return rd.findById(r);
    }
}
