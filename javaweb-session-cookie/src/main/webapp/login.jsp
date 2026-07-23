<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>登录页面</title>
</head>
<body>

<h2>登录页面</h2>

<form action="login" method="post">
    账号：<input type="text" name="account"><br>
    密码：<input type="password" name="pwd"><br>
    <input type="submit" value="登录">
</form>

<p style="color:red;">
    <%= request.getAttribute("error") == null ? "" : request.getAttribute("error") %>
</p>

</body>
</html>