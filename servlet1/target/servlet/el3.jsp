<%@ page import="com.java123.model.People" %><%--
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
    People zhangsan = new People();
    zhangsan.setId(1);
    zhangsan.setName("张三");
    zhangsan.setAge(12);
    request.setAttribute("张三",zhangsan);//必须 一定要放入属性中

%>
<h1>编号：${张三.id}</h1>
<h1>姓名：${张三.name}</h1>
<h1>年龄：${张三.age}</h1>
</body>
</html>
