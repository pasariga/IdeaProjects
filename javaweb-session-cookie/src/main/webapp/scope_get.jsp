<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head><title>取数据页面</title></head>
<body>
<h2>从四个作用域取出数据</h2>
<%--
    注意：因为你点超链接跳过来，已经离开了上一个页面，也是一次全新的请求。
    所以 page 和 request 的数据应该丢了 (显示 null)，
    而 session (浏览器没关) 和 application (服务器没关) 的数据还在！
--%>
<ul>
  <li>pageContext 取出的数据： <b style="color:red"><%= pageContext.getAttribute("msg1") %></b></li>
  <li>request 取出的数据： <b style="color:red"><%= request.getAttribute("msg2") %></b></li>
  <li>session 取出的数据： <b style="color:green"><%= session.getAttribute("msg3") %></b></li>
  <li>application 取出的数据： <b style="color:green"><%= application.getAttribute("msg4") %></b></li>
</ul>
</body>
</html>