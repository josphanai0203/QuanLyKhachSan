package model;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class User {

    private int maTaiKhoan;
    private String tenTaiKhoan;
    private String matKhau;
    private boolean isAdmin;
    private Staff staff;

    public User() {
    }

    public User(int maTaiKhoan) {
        this.maTaiKhoan = maTaiKhoan;
    }

    public User(int maTaiKhoan, String tenTaiKhoan, String matKhau, boolean isAdmin, Staff staff) {
        this.maTaiKhoan = maTaiKhoan;
        this.tenTaiKhoan = tenTaiKhoan;
        this.matKhau = matKhau;
        this.isAdmin = isAdmin;
        this.staff = staff;
    }
    
    public User(int maTaiKhoan, String tenTaiKhoan, String matKhau, boolean isAdmin) {
        this.maTaiKhoan = maTaiKhoan;
        this.tenTaiKhoan = tenTaiKhoan;
        this.matKhau = matKhau;
        this.isAdmin = isAdmin;
    }

    public int getMaTaiKhoan() {
        return maTaiKhoan;
    }

    public void setMaTaiKhoan(int maTaiKhoan) {
        this.maTaiKhoan = maTaiKhoan;
    }

    public String getTenTaiKhoan() {
        return tenTaiKhoan;
    }

    public void setTenTaiKhoan(String tenTaiKhoan) {
        this.tenTaiKhoan = tenTaiKhoan;
    }

    public String getMatKhau() {
        return matKhau;
    }

    public void setMatKhau(String matKhau) {
        this.matKhau = matKhau;
    }

    public void setIsAdmin(boolean isAdmin) {
        this.isAdmin = isAdmin;
    }

    public boolean isAdmin() {
        return isAdmin;
    }

    public Staff getStaff() {
        return staff;
    }

    public void setStaff(Staff staff) {
        this.staff = staff;
    }
    
    

    @Override
    public String toString() {
        return "User{" + "maTaiKhoan=" + maTaiKhoan + ", tenTaiKhoan=" + tenTaiKhoan + ", matKhau=" + matKhau + ", isAdmin=" + isAdmin + '}';
    }
}
