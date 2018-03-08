<%--<%@ page import="com.java1234.model.Student" %>--%>
<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/1/11 0011
  Time: 18:06
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<jsp:useBean id="stu" scope="request" class="com.java1234.model.Student"/>
<jsp:setProperty property="name" name="stu" />
<jsp:setProperty property="age" name="stu"/>
<jsp:forward page="target1.jsp"/>
</body>
</html>
