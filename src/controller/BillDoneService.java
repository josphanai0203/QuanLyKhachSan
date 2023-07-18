/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import dao.BillDoneDao;

/**
 *
 * @author Admin
 */
public class BillDoneService {
    private BillDoneDao bd = new BillDoneDao();
    public boolean addBillDone(String nameCus,int idStaff){
        return  bd.addBillDone(nameCus, idStaff);
    }
}
