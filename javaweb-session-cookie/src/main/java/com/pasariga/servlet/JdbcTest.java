package com.pasariga.servlet;

import java.sql.*;

public class JdbcTest {
    public static void main(String[] args) throws SQLException {
        String url = "jdbc:mysql://localhost:3306/javaweb_demo?useSSL=false&serverTimezone=Asia/Shanghai&characterEncoding=utf8";
        String user = "root";
        String password = System.getenv("IDEA_PROJECTS_DB_PASSWORD");
        if (password == null) {
            throw new IllegalStateException("Set IDEA_PROJECTS_DB_PASSWORD for the local exercise database.");
        }
        Connection conn = DriverManager.getConnection(url, user, password);
        String sql = "select * from users where account=?and password=?";
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setString(1, "admin");
        ps.setString(2, "123456");
        ResultSet rs = ps.executeQuery();
        if(rs.next()){
            System.out.println("登陆成功，用户是："+rs.getString("account"));

        }
        else{
            System.out.println("账户或密码错误");
        }
        rs.close();
        ps.close();
        conn.close();

    }
}
