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
    private String maNhanVien;
    private  String chucVu;
    private String hoVaTen;
    private String sdt;
    private Date ngayThangNamSinh;
    private double luong;
    private String khuVuc;

    public Staff() {
    }

    public Staff(String maNhanVien, String chucVu, String hoVaTen, String sdt, Date ngayThangNamSinh, double luong, String khuVuc) {
        this.maNhanVien = maNhanVien;
        this.chucVu = chucVu;
        this.hoVaTen = hoVaTen;
        this.sdt = sdt;
        this.ngayThangNamSinh = ngayThangNamSinh;
        this.luong = luong;
        this.khuVuc = khuVuc;
    }

    public String getMaNhanVien() {
        return maNhanVien;
    }

    public void setMaNhanVien(String maNhanVien) {
        this.maNhanVien = maNhanVien;
    }

    public String getChucVu() {
        return chucVu;
    }

    public void setChucVu(String chucVu) {
        this.chucVu = chucVu;
    }

    public String getHoVaTen() {
        return hoVaTen;
    }

    public void setHoVaTen(String hoVaTen) {
        this.hoVaTen = hoVaTen;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    public Date getNgayThangNamSinh() {
        return ngayThangNamSinh;
    }

    public void setNgayThangNamSinh(Date ngayThangNamSinh) {
        this.ngayThangNamSinh = ngayThangNamSinh;
    }

    public double getLuong() {
        return luong;
    }

    public void setLuong(double luong) {
        this.luong = luong;
    }

    public String getKhuVuc() {
        return khuVuc;
    }

    public void setKhuVuc(String khuVuc) {
        this.khuVuc = khuVuc;
    }
    
    
}
