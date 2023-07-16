package controller;

import dao.StaffDAO;
import java.util.ArrayList;
import java.util.Date;
import model.Staff;
import service.IStaffService;

public class StaffService implements IStaffService{

    public static StaffDAO sd = new StaffDAO();
    public static ArrayList<Staff> list = StaffDAO.getInstance().selectAll();
    
    public boolean createStaff(String tenNhanVien, Date ngaySinh, String gioiTinh, String diaChi, String sdt,String maChucVu){
        boolean check;
        Staff s = new Staff(tenNhanVien, ngaySinh, gioiTinh, maChucVu, sdt, diaChi);
        check = add(s);
        return check;
    }


    @Override
    public boolean add(Staff t) {
        return sd.add(t);
    }

    @Override
    public ArrayList<Staff> selectAll() {
        return sd.selectAll();
    }

    @Override
    public boolean update(Staff t) {
        return sd.update(t);
    }

    @Override
    public boolean delete(Staff t) {
        return sd.delete(t);
    }

    @Override
    public Staff findById(Staff t) {
        for (int i = 0; i < list.size(); i++) {
            if(t.getMaNhanVien() == list.get(i).getMaNhanVien()){
                return t;
            }
        }
        return null;
    }

    public Staff findID(int maNhanVien){
        return sd.findID(maNhanVien);
    }

}
