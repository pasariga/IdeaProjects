package com.pasariga.servlet;

import dao.UserDao;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import pojo.User;

import java.io.IOException;
import java.sql.*;

public class LoginServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("login.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        UserDao userDao = new UserDao();
        String account = req.getParameter("account");
        String pwd = req.getParameter("pwd");
        User user = new User();
        user.setAccount(account);
        user.setPwd(pwd);

        boolean flag = userDao.login(account, pwd);
        if (flag) {
            req.getSession().setAttribute("loginUser", account);
            req.setAttribute("msg", "welcome");
            req.getRequestDispatcher("success.jsp").forward(req, resp);
        } else {
            req.setAttribute("error", "account or pwd error");
            req.getRequestDispatcher("login.jsp").forward(req, resp);
        }
    }
}
