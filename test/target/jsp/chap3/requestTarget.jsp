<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/1/11 0011
  Time: 14:32
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    String name = (String)request.getAttribute("name");
    int age = (Integer)request.getAttribute("age");
%>
<font>name:<%=name%></font>
<font>age:<%=age%></font>
</body>
</html>
