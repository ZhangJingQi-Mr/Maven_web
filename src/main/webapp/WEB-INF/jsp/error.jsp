<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2020/5/24
  Time: 12:09
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>错误界面</title>
</head>
<body>
访问发生错误：${e.message}
<a href="javascript:history.back()">返回登录界面</a>
</body>
</html>
