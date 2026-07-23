package dao;


public class UserDao {
    public boolean login(String account, String pwd) {
    if("admin".equals(account) && "123456".equals(pwd)){
        return true;
    }
    return false;
    }

}
