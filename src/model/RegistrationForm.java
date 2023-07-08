/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.Date;

public class RegistrationForm {
    private int maSoDangKi;
    private Staff maNhanVien;
    private Customer maKhachhang;
    private Room maPhong;
    private int soPhong;
    private Date ngayDangKi;

    public RegistrationForm() {
    }

    public RegistrationForm(int maSoDangKi, Staff maNhanVien, Customer maKhachhang, Room maPhong, int soPhong, Date ngayDangKi) {
        this.maSoDangKi = maSoDangKi;
        this.maNhanVien = maNhanVien;
        this.maKhachhang = maKhachhang;
        this.maPhong = maPhong;
        this.soPhong = soPhong;
        this.ngayDangKi = ngayDangKi;
    }

    public int getMaSoDangKi() {
        return maSoDangKi;
    }

    public void setMaSoDangKi(int maSoDangKi) {
        this.maSoDangKi = maSoDangKi;
    }

    public Staff getMaNhanVien() {
        return maNhanVien;
    }

    public void setMaNhanVien(Staff maNhanVien) {
        this.maNhanVien = maNhanVien;
    }

    public Customer getMaKhachhang() {
        return maKhachhang;
    }

    public void setMaKhachhang(Customer maKhachhang) {
        this.maKhachhang = maKhachhang;
    }

    public Room getMaPhong() {
        return maPhong;
    }

    public void setMaPhong(Room maPhong) {
        this.maPhong = maPhong;
    }

    public int getSoPhong() {
        return soPhong;
    }

    public void setSoPhong(int soPhong) {
        this.soPhong = soPhong;
    }

    public Date getNgayDangKi() {
        return ngayDangKi;
    }

    public void setNgayDangKi(Date ngayDangKi) {
        this.ngayDangKi = ngayDangKi;
    }

    @Override
    public String toString() {
        return "RegistrationForm{" + "maSoDangKi=" + maSoDangKi + ", maNhanVien=" + maNhanVien + ", maKhachhang=" + maKhachhang + ", maPhong=" + maPhong + ", soPhong=" + soPhong + ", ngayDangKi=" + ngayDangKi + '}';
    }

    

 
}
