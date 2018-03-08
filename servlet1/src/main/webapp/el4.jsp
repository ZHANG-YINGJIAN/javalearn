<%@ page import="com.java123.model.People" %>
<%@ page import="java.util.List" %>
<%@ page import="java.util.LinkedList" %><%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/1/17 0017
  Time: 17:37
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    List all = new LinkedList();
    all.add(0,"一");
    all.add(1,"二");
    all.add(2,"三");
    request.setAttribute("all",all);
%>
<h1>编号：${all[0]}</h1>
<h1>编号：${all[1]}</h1>
<h1>编号：${all[2]}</h1>

</body>
</html>
