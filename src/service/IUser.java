
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
