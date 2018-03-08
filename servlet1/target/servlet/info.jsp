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
<form action="el2.jsp" method="post">
    <input type="text" name="name">
    <input type="submit" value="提交"/>
</form>
<a href="el2.jsp">提交</a>
<form action="el2.jsp" method="post">
    <input type="checkbox" name="hobby" value="java"/>java
    <input type="checkbox" name="hobby" value="C"/>C
    <input type="checkbox" name="hobby" value="php"/>php
    <input type="submit" value="提交"/>
</form>
</body>
</html>
