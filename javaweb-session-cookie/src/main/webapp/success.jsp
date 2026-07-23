<%--
  Created by IntelliJ IDEA.
  User: pasariga
  Date: 2026/5/12
  Time: 22:38
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    Object loginUser=session.getAttribute("loginUser");
    if(loginUser==null){
        request.setAttribute("error","请先登录");
        request.getRequestDispatcher("login.jsp").forward(request,response);
        return;
    }
%>
<html>
<head>
    <title>成功页面</title>
</head>
<body>
<h2>login successfully</h2>
<p>
     <%=request.getAttribute("msg")%>
</p>
<p>当前登录用户：<%=session.getAttribute("loginUser")%></p>
<p><a href="logout">退出登录</a> </p>
</body>
</html>
