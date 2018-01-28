<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2017/12/27
  Time: 12:06
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>测试@modelAttribute</title>
</head>
<body>
<%--<form action="T/TTT" method="post">--%>
    <%--&lt;%&ndash;action所提交的位置为当前页面的路径(不含单钱页面)的方法(执行当前页面的命名空间后拼接的方法)&ndash;%&gt;--%>
    <%--姓名:<input id="name" name="name" type="text"/>--%>
    <%--密码:<input id="pwd"  name="pwd" type="password"/>--%>
    <%--<input value="测试@modelAttribute" type="submit">--%>
<%--</form>--%>
<form action="T/YYY" method="post">
    <%--action所提交的位置为当前页面的路径(不含单钱页面)的方法(执行当前页面的命名空间后拼接的方法)--%>
    姓名:<input id="name" name="name" type="text"/>
    密码:<input id="pwd"  name="pwd" type="password"/>
    <input value="测试@modelAttribute和@RequestMapping同时使用" type="submit">
</form>
</body>
</html>
