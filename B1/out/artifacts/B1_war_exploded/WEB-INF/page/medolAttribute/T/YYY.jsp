<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2017/12/27
  Time: 14:18
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>@ModelAttribute和@RequestMapping两个注解注释一个方法</title>
</head>
<body>
@ModelAttribute和@RequestMapping两个注解注释一个方法时方法的返回值为model的属性值,requestMapping的value值才为视图名
取值测试(取的数据为值)1:${requestScope.testModelAttributeResult}
取值测试2:${requestScope.userName}
取值测试3:${requestScope.name1}
</body>
</html>
