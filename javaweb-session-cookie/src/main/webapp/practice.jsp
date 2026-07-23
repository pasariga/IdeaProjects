<%--
  Created by IntelliJ IDEA.
  User: pasariga
  Date: 2026/5/11
  Time: 10:37
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" errorPage="500.jsp" import="java.util.ArrayList" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    String[] names = {"甘志豪", "孙浩", "Gary"};

%>
<ul>
    <%

        for (String name : names) {
    %>
    <li><%= name %>
    </li>
    <%
        }
    %>
</ul>
<%@ include file="footer.jsp" %>
</body>
</html>

