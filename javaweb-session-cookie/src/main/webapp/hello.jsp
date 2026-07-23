<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>JSP基础语法演示</title>
</head>
<body>
<h2>1. 演示 HTML 注释与 JSP 注释的区别</h2>
<!-- 这是一个 HTML 注释：你在浏览器按 F12 查看源码是能看到这段话的！ -->
<%-- 这是一个 JSP 注释：这是后端的秘密，浏览器绝对看不到！ --%>

<hr>
<h2>2. 演示 JSP 声明 (定义成员变量/方法，不推荐)</h2>
<%!
    // 这会被翻译到 Servlet 类的外面，成为成员变量
    int visitCount = 0;

    // 定义一个类方法
    public String getWelcomeMsg() {
        return "欢迎来到我的第一个JSP页面！";
    }
%>

<hr>
<h2>3. 演示 JSP 脚本片段 (写业务逻辑) 和 表达式 (输出数据)</h2>
<%
    // 这会被翻译到 Servlet 的 _jspService 方法里，是局部变量
    visitCount++; // 每次刷新页面，访问量+1
    int a = 10;
    int b = 20;
    int sum = a + b;
%>

<p>调用方法获取欢迎语： <b><%= getWelcomeMsg() %></b></p>
<p>你是本页面的第 <b><%= visitCount %></b> 位访客！(你可以狂按 F5 刷新试试)</p>
<p>Java计算 A + B 的结果是： <b><%= sum %></b></p>

<br>
<h3>结合 HTML 和 Java 写一个九九乘法表前 3 行：</h3>
<table border="1" style="border-collapse: collapse;">
    <%
        // 在这里写普通的 Java for 循环
        for (int i = 1; i <= 3; i++) {
    %>
    <!-- 注意：这里跳出了 Java 代码块，回到了 HTML 的范畴去写 <tr> -->
    <tr>
        <%
            for (int j = 1; j <= i; j++) {
        %>

        <td><%= j %> * <%= i %> = <%= (i * j) %></td>
        <%
            } // 闭合内层循环
        %>
    </tr>
    <%
        } // 闭合外层循环
    %>
</table>

</body>
</html>