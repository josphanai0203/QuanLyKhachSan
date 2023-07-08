package controller;

import dao.ItemServiceDAO;
import model.Service;
import service.IService;

import java.util.ArrayList;

public class ItemServiceService implements IService<Service> {
    private static ItemServiceDAO id = new ItemServiceDAO();

    @Override
    public boolean add(Service s) {
        return id.add(s);
    }

    @Override
    public ArrayList<Service> selectAll() {
        return id.selectAll();
    }

    @Override
    public boolean update(Service s) {
        return id.update(s);
    }

    @Override
    public boolean delete(Service s) {
        return id.delete(s);
    }

    @Override
    public Service findById(Service s) {
        return id.findById(s);
    }
}
