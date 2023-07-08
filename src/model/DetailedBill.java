/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Trinh
 */
public class DetailedBill {
    private Bill maHoaDon;
    private int tienPhong;
    private int tienDichVu;
    private int vat;

    public DetailedBill() {
    }
    
    public DetailedBill(Bill maHoaDon, int tienPhong, int tienDichVu, int vat) {
        this.maHoaDon = maHoaDon;
        this.tienPhong = tienPhong;
        this.tienDichVu = tienDichVu;
        this.vat = vat;
    }
    
    

    public Bill getMaHoaDon() {
        return maHoaDon;
    }

    public void setMaHoaDon(Bill maHoaDon) {
        this.maHoaDon = maHoaDon;
    }

    public int getTienPhong() {
        return tienPhong;
    }

    public void setTienPhong(int tienPhong) {
        this.tienPhong = tienPhong;
    }

    public int getTienDichVu() {
        return tienDichVu;
    }

    public void setTienDichVu(int tienDichVu) {
        this.tienDichVu = tienDichVu;
    }

    public int getVat() {
        return vat;
    }

    public void setVat(int vat) {
        this.vat = vat;
    }
    
    
}
