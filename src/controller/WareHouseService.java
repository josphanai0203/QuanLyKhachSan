package controller;

import dao.WareHouseDAO;
import model.WareHouse;
import service.IService;

import java.sql.Date;
import java.util.ArrayList;

public class WareHouseService implements IService<WareHouse> {

    private static WareHouseDAO wd = new WareHouseDAO();
    public static ArrayList<WareHouse> list = WareHouseDAO.getInstance().selectAll();

    public boolean createWareHouse(String tenSanPham, Date dayIn, int SoLuong, Double giaNhap, Double giaBan, Date hSD) {
        boolean check;
        WareHouse w = new WareHouse(tenSanPham, dayIn, SoLuong, giaNhap, giaBan, hSD);
        check = add(w);
        return check;
    }

    public boolean updateWareHouse(int maSanPham, String tenSanPham, Date dayIn, int SoLuong, Double giaNhap, Double giaBan, Date hSD) {
        boolean check;
        WareHouse w = new WareHouse(maSanPham, tenSanPham, dayIn, SoLuong, giaNhap, giaBan, hSD);
        check = update(w);
        return check;
    }

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
        for (int i = 0; i < list.size(); i++) {
            if (w.getMaW() == list.get(i).getMaW()) {
                return w;
            }
        }
        return null;
    }

    public WareHouse findId(int maKhoHang) {
        return wd.findId(maKhoHang);
    }
}
