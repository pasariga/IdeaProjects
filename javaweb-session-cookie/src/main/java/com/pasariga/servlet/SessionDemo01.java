package com.pasariga.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;

public class SessionDemo01 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //解决乱码问题
        req.setCharacterEncoding("utf-8");
        resp.setCharacterEncoding("utf-8");
        resp.setContentType("text/html;charset=utf-8");
        //得到session
        HttpSession session = req.getSession();



        //给session中东西
        session.setAttribute("name",new Person("pasariga",1));
        //获取Session的ID
        String sessionId=session.getId();
        //判断Session是不是新创建
        if(session.isNew()){
            resp.getWriter().write("session 创建成功，ID:"+sessionId);
        }
        else{
            resp.getWriter().write("session 以及在服务器中存在了,ID:"+sessionId);
        }
    }


    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPost(req, resp);
    }
}
