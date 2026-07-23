<%-- 使用 errorPage 属性告诉 Tomcat，如果这个页面代码抛异常了，请去 500.jsp --%>
<%-- 使用 import 属性导入 Java 的 ArrayList 类 --%>
<%@ page contentType="text/html;charset=UTF-8" language="java" errorPage="500.jsp" import="java.util.ArrayList" %>
<html>
<head><title>指令与内置对象演示</title></head>
<body>

<%-- 演示 include 指令：把公共头部包含进来 --%>
<%@ include file="header.jsp" %>

<br>
<h3>演示内置对象 request</h3>
<%-- 直接使用 request 对象获取当前访问的方法 (GET/POST) --%>
<p>你当前的请求方式是： <%= request.getMethod() %> </p>

<h3>演示导入的 ArrayList </h3>
<%
  // 因为上面 page 指令 import 了 ArrayList，这里就可以直接用了
  ArrayList<String> list = new ArrayList<>();
  list.add("苹果");
  list.add("香蕉");
%>
<p>集合里的第一个水果是： <%= list.get(0) %></p>

<%--
    取消下面这行代码的注释，制造一个 1/0 的算术异常，
    然后再刷新 main.jsp，看看会不会自动跳转到 500.jsp！
--%>
 <% int a = 1 / 0; %>

</body>
</html>