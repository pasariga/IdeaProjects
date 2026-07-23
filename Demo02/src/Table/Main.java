package Table;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<User> userTable=new ArrayList<>();
        User u1=new User(1,"甘志豪","11111");
        User u2=new User(2,"admin","22222");
        User u3=new User(3,"王童杰","333333");
        userTable.add(u1);
        userTable.add(u2);
        userTable.add(u3);
        User u4=new User(1,"甘志豪","11111");
        System.out.println(u4.toUpdatePasswordSql("888888"));
        System.out.println(u4.toDeleteSql());
    }
}
