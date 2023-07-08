/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.*;

/**
 *
 * @author Admin
 */
public class Staff {
    private int maNhanVien;   
    private String tenNhanVien;
    private Date ngaySinh;
    private String gioiTinh;
    private  Position maChucVu;   
    private String sdt;
    private String diaChi;
    private Payroll maLuong;
    

    public Staff() {
    }

    public Staff(int maNhanVien, String tenNhanVien, Date ngaySinh, String gioiTinh, String sdt, String diaChi) {
        this.maNhanVien = maNhanVien;
        this.tenNhanVien = tenNhanVien;
        this.ngaySinh = ngaySinh;
        this.gioiTinh = gioiTinh;
        this.maChucVu = maChucVu;
        this.sdt = sdt;
        this.diaChi = diaChi;
    }
    
    

    public Staff(String tenNhanVien, Date ngaySinh, String gioiTinh, String sdt, String diaChi) {
        this.tenNhanVien = tenNhanVien;
        this.ngaySinh = ngaySinh;
        this.gioiTinh = gioiTinh;
        this.maChucVu = maChucVu;
        this.sdt = sdt;
        this.diaChi = diaChi;
        this.maLuong = maLuong;
    }
    
    

    public Staff(int maNhanVien, String tenNhanVien, Date ngaySinh, String gioiTinh, Position maChucVu, String sdt, String diaChi, Payroll maLuong) {
        this.maNhanVien = maNhanVien;
        this.tenNhanVien = tenNhanVien;
        this.ngaySinh = ngaySinh;
        this.gioiTinh = gioiTinh;
        this.maChucVu = maChucVu;
        this.sdt = sdt;
        this.diaChi = diaChi;
        this.maLuong = maLuong;
    }

    public int getMaNhanVien() {
        return maNhanVien;
    }

    public void setMaNhanVien(int maNhanVien) {
        this.maNhanVien = maNhanVien;
    }

    public String getTenNhanVien() {
        return tenNhanVien;
    }

    public void setTenNhanVien(String tenNhanVien) {
        this.tenNhanVien = tenNhanVien;
    }

    public Date getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(Date ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public Position getMaChucVu() {
        return maChucVu;
    }

    public void setMaChucVu(Position maChucVu) {
        this.maChucVu = maChucVu;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public Payroll getMaLuong() {
        return maLuong;
    }

    public Payroll setMaLuong(Payroll maLuong) {
        return this.maLuong = maLuong;
    }

    @Override
    public String toString() {
        return "Staff{" + "maNhanVien=" + maNhanVien + ", tenNhanVien=" + tenNhanVien + ", ngaySinh=" + ngaySinh + ", gioiTinh=" + gioiTinh + ", maChucVu=" + maChucVu + ", sdt=" + sdt + ", diaChi=" + diaChi + ", maLuong=" + maLuong + '}';
    }

   
    
    
}
