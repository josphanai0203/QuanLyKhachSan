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
    private String chucVu;
    private String sdt;
    private String diaChi;
    private Payroll maLuong;

    public Staff() {
    }

    public Staff(String tenNhanVien, Date ngaySinh, String gioiTinh, String chucVu, String sdt, String diaChi, Payroll maLuong) {
        this.tenNhanVien = tenNhanVien;
        this.ngaySinh = ngaySinh;
        this.gioiTinh = gioiTinh;
        this.chucVu = chucVu;
        this.sdt = sdt;
        this.diaChi = diaChi;
        this.maLuong = maLuong;
    }

    public Staff( String tenNhanVien, Date ngaySinh, String gioiTinh, String maChucVu, String sdt, String diaChi) {
        this.tenNhanVien = tenNhanVien;
        this.ngaySinh = ngaySinh;
        this.gioiTinh = gioiTinh;
        this.chucVu = maChucVu;
        this.sdt = sdt;
        this.diaChi = diaChi;
    }

    public Staff(int maNhanVien, String tenNhanVien, Date ngaySinh, String gioiTinh, String chucVu, String sdt, String diaChi) {
        this.maNhanVien = maNhanVien;
        this.tenNhanVien = tenNhanVien;
        this.ngaySinh = ngaySinh;
        this.gioiTinh = gioiTinh;
        this.chucVu = chucVu;
        this.sdt = sdt;
        this.diaChi = diaChi;
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

    public String getChucVu() {
        return chucVu;
    }

    public void setChucVu(String chucVu) {
        this.chucVu = chucVu;
    }

}
