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

<h2><c:out value="${people}"></c:out></h2>

<c:remove var="people" scope="request"></c:remove>

<h2><c:out value="${people}" default="无人"></c:out></h2>


</body>
</html>
