package controller;

import dao.StaffDAO;
import dao.UserDAO;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import model.Payroll;
import model.Staff;
import service.IStaffService;

public class StaffService implements IStaffService{

    public static StaffDAO sd = new StaffDAO();
    public static UserDAO ud = new UserDAO();
    public static ArrayList<Staff> list = StaffDAO.getInstance().selectAll();
    
    public boolean createStaff(String tenNhanVien, Date ngaySinh, String gioiTinh, String maChucVu, String sdt, String diaChi, String maLuong, String maTaiKhoan){
        
    }

    public boolean checkTenNhanVien(String hoVaTen){
        return hoVaTen.matches("[a-zA-Z ]+");
    }
    
    public boolean checkSDT(String sdt) {
        //Kiểm tra chỉ gồm số 0-9
        for (int i = 0; i < sdt.length(); i++) {
            if(sdt.charAt(i) < '0' || sdt.charAt(i)>'9'){
                return false;
            }
        }
        //Kiểm tra độ dài sđt là 10
        if(sdt.length() != 10){
            return false;
        }
        return true;
    }
    
    public boolean checkNgaySinh(String ngaySinh){
        ngaySinh = ngaySinh.trim();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        dateFormat.setLenient(false);
        try {
            Date date = dateFormat.parse(ngaySinh);
            return true;
        } catch (ParseException e) {
            return false;
        }
    }
    
    public boolean checkGioiTinh(String gioiTinh){
        gioiTinh = gioiTinh.trim();
        if(gioiTinh.equalsIgnoreCase("Nam") || gioiTinh.equalsIgnoreCase("Nu") || gioiTinh.equalsIgnoreCase("Nữ")){
            return true;
        }
        return false;
    }
    
    //Kiểm tra mã nhân viên, mã lương, và mã chức vụ là số
    public boolean checkInteger(String rawNum){
        try {
            int num = Integer.parseInt(rawNum);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
    
    //Kiem tra mã nhân viên có tồn tại không
    public boolean checkStaffExist(int maNhanVien){
        for (Staff s : list) {
            if(s.getMaNhanVien() == maNhanVien){
                return true;
            }
        }
        return false;
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

}
