<%--
  Created by IntelliJ IDEA.
  User: pasariga
  Date: 2026/5/11
  Time: 15:35
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>网站访问计数器</title>
</head>
<body>
<h2>网站总访问计数器</h2>
<%
    // 1. 从 application 作用域中取出 count
    Integer counter=(Integer) application.getAttribute("count");
    if(counter==null){
        counter=1;
    }
    else{
        counter++;
    }
    application.setAttribute("count",counter);
%>
<p> 当前网站访问次数:<%= counter%></p>

</body>
</html>
