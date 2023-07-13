/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import dao.RegisterFormDAO;
import model.RegistrationForm;

/**
 *
 * @author Admin
 */
public class RegisterService {
    private RegisterFormDAO rd = new RegisterFormDAO();
    public RegistrationForm findByIDCus(int id) {
        return rd.findByIDCus(id);
    }
    public boolean Update(int id,int time){
        return rd.Update(id, time);
    }
}
