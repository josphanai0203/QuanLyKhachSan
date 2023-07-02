package model;
public class User {
    private String account;
    private String password;
    private boolean isAdmin;

    public User() {
    }

    public User(String account, String password, boolean isAdmin) {
        this.account = account;
        this.password = password;
        this.isAdmin = isAdmin;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isIsAdmin() {
        return isAdmin;
    }

    public void setIsAdmin(boolean isAdmin) {
        this.isAdmin = isAdmin;
    }
    
    
}
