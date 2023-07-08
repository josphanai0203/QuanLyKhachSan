package controller;
import dao.*;
import model.*;
import service.*;

import java.util.ArrayList;

public class WareHouseService   implements IService<WareHouse> {
    private static WareHouseDAO wd= new WareHouseDAO();


    @Override
    public boolean add(WareHouse w) {
        return wd.add(w);
    }

    @Override
    public ArrayList<WareHouse> selectAll() {
        return wd.selectAll();
    }

    @Override
    public boolean update(WareHouse w) {
        return wd.update(w);
    }

    @Override
    public boolean delete(WareHouse w) {
        return wd.delete(w);
    }

    @Override
    public WareHouse findById(WareHouse w) {
        return wd.findById(w);
    }
}
