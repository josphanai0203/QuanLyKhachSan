/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.Date;

/**
 *
 * @author Admin
 */
public class Bill {
    private int maHoaDon;
    private int maKhachHang;
    private int maNhanVien;
    private Date ngayNhap;
    private double tongTien;
    private int maHoaDonChiTiet;

    public Bill() {
    }

    public Bill(int maHoaDon, int maKhachHang, int maNhanVien, Date ngayNhap, double tongTien, int maHoaDonChiTiet) {
        this.maHoaDon = maHoaDon;
        this.maKhachHang = maKhachHang;
        this.maNhanVien = maNhanVien;
        this.ngayNhap = ngayNhap;
        this.tongTien = tongTien;
        this.maHoaDonChiTiet = maHoaDonChiTiet;
    }

    public int getMaHoaDon() {
        return maHoaDon;
    }

    public void setMaHoaDon(int maHoaDon) {
        this.maHoaDon = maHoaDon;
    }

    public int getMaKhachHang() {
        return maKhachHang;
    }

    public void setMaKhachHang(int maKhachHang) {
        this.maKhachHang = maKhachHang;
    }

    public int getMaNhanVien() {
        return maNhanVien;
    }

    public void setMaNhanVien(int maNhanVien) {
        this.maNhanVien = maNhanVien;
    }

    public Date getNgayNhap() {
        return ngayNhap;
    }

    public void setNgayNhap(Date ngayNhap) {
        this.ngayNhap = ngayNhap;
    }

    public double getTongTien() {
        return tongTien;
    }

    public void setTongTien(double tongTien) {
        this.tongTien = tongTien;
    }

    public int getMaHoaDonChiTiet() {
        return maHoaDonChiTiet;
    }

    public void setMaHoaDonChiTiet(int maHoaDonChiTiet) {
        this.maHoaDonChiTiet = maHoaDonChiTiet;
    }
    
    
}
