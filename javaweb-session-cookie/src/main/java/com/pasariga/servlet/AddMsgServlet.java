package com.pasariga.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
public class AddMsgServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        String account = req.getParameter("account");
        String password = req.getParameter("pwd");
        System.out.println("account:" + account);
        System.out.println("password:" + password);
        resp.setContentType("text/html;charset=UTF-8");
        resp.getWriter().write("account:"+account+"<br>");
        resp.getWriter().write("password:"+password+"<br>");
    }
}
