<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2017/12/26
  Time: 14:31
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>首页</title>
</head>
<body>
    <%--form表单中input标签中的name属性为提交表单的必填属性--%>
    <form action="register" method="post">
        姓名:<input id="name" name="name" type="text"/>
        密码:<input id="pwd"  name="pwd" type="password"/>
        <input value="注册" type="submit">
    </form>


</body>
</html>
