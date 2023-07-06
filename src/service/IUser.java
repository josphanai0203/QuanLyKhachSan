/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package service;

import model.User;

/**
 *
 * @author Trinh
 */
public interface IUser extends IService<User>{
   public boolean checkTenTaiKhoan(String tenTaiKhoan);
   public boolean checkLogIn(String tenTaiKhoan, String matKhau);
}
