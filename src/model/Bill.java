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
    private Customer maKhachHang;
    private Staff maNhanVien;
    private Date ngayNhap;
    private double tongTien;
    private DetailedBill maHoaDonChiTiet;

    public Bill() {
    }

    public Bill(int maHoaDon, Date ngayNhap, double tongTien) {
        this.maHoaDon = maHoaDon;
        this.ngayNhap = ngayNhap;
        this.tongTien = tongTien;
    }

    public Bill(int maHoaDon, Customer maKhachHang, Staff maNhanVien, Date ngayNhap, double tongTien, DetailedBill maHoaDonChiTiet) {
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

    public Customer getMaKhachHang() {
        return maKhachHang;
    }

    public void setMaKhachHang(Customer maKhachHang) {
        this.maKhachHang = maKhachHang;
    }

    public Staff getMaNhanVien() {
        return maNhanVien;
    }

    public void setMaNhanVien(Staff maNhanVien) {
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

    public DetailedBill getMaHoaDonChiTiet() {
        return maHoaDonChiTiet;
    }

    public void setMaHoaDonChiTiet(DetailedBill maHoaDonChiTiet) {
        this.maHoaDonChiTiet = maHoaDonChiTiet;
    }

    
    
    
   
}
