/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.Date;

public class RegistrationForm {
    private int maSoDangKi;
    private int maNhanVien;
    private int maKhachhang;
    private int maPhong;
    private int soPhong;
    private Date ngayDangKi;

    public RegistrationForm() {
    }

    public RegistrationForm(int maSoDangKi, int maNhanVien, int maKhachhang, int maPhong, int soPhong, Date ngayDangKi) {
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

    public int getMaNhanVien() {
        return maNhanVien;
    }

    public void setMaNhanVien(int maNhanVien) {
        this.maNhanVien = maNhanVien;
    }

    public int getMaKhachhang() {
        return maKhachhang;
    }

    public void setMaKhachhang(int maKhachhang) {
        this.maKhachhang = maKhachhang;
    }

    public int getMaPhong() {
        return maPhong;
    }

    public void setMaPhong(int maPhong) {
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
    
    
}
