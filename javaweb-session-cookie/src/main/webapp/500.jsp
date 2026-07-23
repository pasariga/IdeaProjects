<%-- 注意这里多了一个 isErrorPage="true"，非常关键！只有加了它，才能用 exception 对象 --%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isErrorPage="true" %>
<html>
<head><title>服务器出错了</title></head>
<body>
<h2 style="color: red;">对不起，服务器开小差了，请稍后再试！</h2>

<%-- 使用内置对象 exception 获取具体的错误信息 --%>
<p>错误原因：<%= exception.getMessage() %></p>
</body>
</html>