<%--
  Created by IntelliJ IDEA.
  User: pasariga
  Date: 2026/5/12
  Time: 21:07
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>a.jsp</title>
</head>
<body>
<%
    request.setAttribute("name","Gary");
    request.getRequestDispatcher("b.jsp").forward(request,response);
%>
</body>
</html>
