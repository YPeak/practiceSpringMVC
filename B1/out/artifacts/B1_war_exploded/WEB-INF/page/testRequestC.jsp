<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2017/12/21
  Time: 16:31
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>C页面</title>
</head>
<body>
开发中应用的页面
登入对象为:${requestScope.user}
登入名为:${requestScope.user.name}
登入密码为:${requestScope.user.pwd}


<%--登入名为:${requestScope.userName}--%>
<%--登入密码为:${requestScope.pwd}--%>
</body>
</html>
