
package controller;
import controller.UserService;
import dao.UserDAO;
import database.JDBCUtil;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;
import model.Staff;
import model.User;
import service.IUser;

public class UserService implements IUser{

    private static UserDAO ud = new UserDAO();
    private static User currentUser;
    private static Scanner sc = new Scanner(System.in);
    public static ArrayList<User> list = UserDAO.getInstance().selectAll();
    


    public UserService() {
    }
    

    public boolean checkTenTaiKhoan(String tenTaiKhoan) {
        ArrayList<User> list = ud.selectAll();

        if (tenTaiKhoan.isEmpty()) {
            return false;
        }
        for (User user : list) {
            if (user.getTenTaiKhoan().equals(tenTaiKhoan)) {
                return false;
            }
        }
        return true;
    }

    public boolean checkLogIn(String tenTaiKhoan, String matKhau) {
        String matKhauMaHoa = encryptPassword(matKhau);
        ArrayList<User> list = ud.selectAll();
        for (int i = 0; i < list.size(); i++) {
            if (tenTaiKhoan.equals(list.get(i).getTenTaiKhoan()) && matKhauMaHoa.equals(list.get(i).getMatKhau())) {
                currentUser = new User(list.get(i).getTenTaiKhoan(), list.get(i).getMatKhau(), list.get(i).isAdmin());
                return true;
            }
        }
        return false;
    }


    public boolean checkAdmin(User currentUser) {
        return currentUser.isAdmin();
    }
//    public boolean authenticate(String matKhau) {
//        String encryptedPassword = encryptPassword(matKhau);
//        return matKhau.equals(encryptedPassword);
//    }

    public String encryptPassword(String matKhau) {
        try {
            MessageDigest md = MessageDigest.getInstance("MD5");
            md.update(matKhau.getBytes());
            byte[] digest = md.digest();
            StringBuilder sb = new StringBuilder();
            for (byte b : digest) {
                sb.append(String.format("%02x", b & 0xff));
            }
            return sb.toString();
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public boolean add(User t) {
        return ud.add(t);
    }

    @Override
    public ArrayList<User> selectAll() {
        return ud.selectAll();
    }

    @Override
    public boolean update(User t) {
        return ud.update(t);
    }

    @Override
    public boolean delete(User t) {
        return ud.delete(t);
    }

    @Override
    public User findById(User t) {
        return ud.findById(t);
    }
    

}
