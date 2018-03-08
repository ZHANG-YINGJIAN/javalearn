<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/1/17 0017
  Time: 15:56
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    request.setCharacterEncoding("utf-8");
%>
<h1>姓名：${param.name}</h1>
<h1>年龄：${param.age}</h1>
<h1>爱好一：${paramValues.hobby[0]}</h1>
<h1>爱好二：${paramValues.hobby[1]}</h1>
<h1>爱好三：${paramValues.hobby[2]}</h1>
</body>
</html>
