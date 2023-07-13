/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import dao.PayrollDAO;
import java.util.ArrayList;
import model.Payroll;
import service.IPayrollService;

/**
 *
 * @author Trinh
 */
public class PayrollService implements IPayrollService {

    static PayrollDAO pd = new PayrollDAO();

    @Override
    public boolean add(Payroll t) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public ArrayList<Payroll> selectAll() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean update(Payroll t) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean delete(Payroll t) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Payroll findById(Payroll t) {
        return pd.findById(t);
    }

    public Payroll findByIdUpdate(int maLuong) {
        return pd.findByIdUpdate(maLuong);
    }

}
