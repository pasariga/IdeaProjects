package com.pasariga.servlet;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

public class ServletDemo04 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ServletContext context = getServletContext();
//        RequestDispatcher requestDispatcher = context.getRequestDispatcher("/gp");//转发的请求路径
//        requestDispatcher.forward(req,resp);//调用forward实现请求转发
        System.out.println("进入了ServletDemo04");
        context.getRequestDispatcher("/gph").forward(req, resp);//转发！
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPost(req, resp);
    }
}
