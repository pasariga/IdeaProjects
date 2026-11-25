package Mock_DB;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBUtil {
    public static Connection getConnection() {
        try {
            String url = "jdbc:mysql://localhost:3306/bounty_target";
            String user = "root";
            String password = System.getenv("IDEA_PROJECTS_DB_PASSWORD");
            if (password == null) {
                throw new IllegalStateException("Set IDEA_PROJECTS_DB_PASSWORD for the local exercise database.");
            }
            Connection conn = DriverManager.getConnection(url, user, password);
        }catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }
}
