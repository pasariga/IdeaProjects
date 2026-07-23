package com.pasariga.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.ServletOutputStream;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.URLEncoder;

public class FileServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //1.要获取下载文件的路径
        String realPath = "C:\\Users\\pasariga\\IdeaProjects\\Java_Web\\response\\src\\main\\resources\\ds.png";
        System.out.println("download path:"+realPath);
        //2.下载的文件名是啥
        String fileName = new File(realPath).getName();
        //3.设置想办法让浏览器能够支持(Content-Disposition)下载我们需要的东西，中文文件名URLEncoder.encode
        resp.setHeader("content-Disposition", "attachment;filename="+ URLEncoder.encode(fileName, "UTF-8"));
        //4。获取下载文件的输入流
        FileInputStream in = new FileInputStream(realPath);
        //5.创建缓冲区
        int len = 0;
        byte[] bytes = new byte[1024];
        //6.获取OutStream对象
        ServletOutputStream out = resp.getOutputStream();
        //7.将FileOutputStream流写入
        while ((len=in.read(bytes))>0) {
            out.write(bytes,0,len);
        }
        in.close();
        out.flush();
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPost(req, resp);
    }
}
