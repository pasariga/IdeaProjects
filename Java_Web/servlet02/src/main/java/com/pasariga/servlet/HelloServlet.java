package com.pasariga.servlet;

import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

public class HelloServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ServletContext Context = this.getServletContext();
        String username="pasariga";
        getServletContext().setAttribute("username",username);//将一个数据保存在了ServletContext中，名字为：username,值username
        System.out.println("hello");
    }
}
