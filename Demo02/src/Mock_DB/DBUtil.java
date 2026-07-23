package Mock_DB;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBUtil {
    public static Connection getConnection() {
        try {
            String url = "jdbc:mysql://localhost:3306/bounty_target";
            String user = "root";
            String password = "123456";
            Connection conn = DriverManager.getConnection(url, user, password);
        }catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }
}
