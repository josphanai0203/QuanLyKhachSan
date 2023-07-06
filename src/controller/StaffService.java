package controller;

import dao.StaffDAO;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import model.Staff;
import service.IStaffService;

public class StaffService {

    public static StaffDAO sd = new StaffDAO();
    public static ArrayList<Staff> list = StaffDAO.getInstance().selectAll();

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

}
