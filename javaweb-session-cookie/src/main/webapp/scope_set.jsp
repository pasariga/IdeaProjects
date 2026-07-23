<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head><title>存数据页面</title></head>
<body>
<h2>向四个作用域存入数据</h2>
<%
    // 向四个作用域分别存入不同的字符串数据
    pageContext.setAttribute("msg1", "这是page里的数据");
    request.setAttribute("msg2", "这是request里的数据");
    session.setAttribute("msg3", "这是session里的数据");
    application.setAttribute("msg4", "这是application里的数据");
%>

<p>数据保存完毕！</p>

<%-- 这是一个普通的超链接，点击它相当于发起一次全新的 GET 请求 --%>
<a href="scope_get.jsp">点击这里去 scope_get.jsp 页面取数据</a>
</body>
</html>