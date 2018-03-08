<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/1/18 0018
  Time: 13:39
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<c:set var="people" value="张三2" scope="request"></c:set>
<%--<h2><c:out value="${people}"></c:out></h2>--%>
<h2><c:out value="${people}" default="无人"></c:out></h2>

<jsp:useBean id="people2" scope="request" class="com.chap8.model.People"></jsp:useBean>
<c:set property="id" target="${people2}" value="07"></c:set>
<c:set property="name" target="${people2}" value="长大"></c:set>
<c:set property="age" target="${people2}" value="34"></c:set>
<h1>编号：${people2.id}</h1>
<h1>姓名：${people2.name}</h1>
<h1>年龄：${people2.age}</h1>
编号：<c:out value="${people2.id}"></c:out>
</body>
</html>
