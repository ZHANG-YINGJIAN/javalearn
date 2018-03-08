<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/1/12 0012
  Time: 10:40
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>收到参数</h1>
<jsp:useBean id="stu" scope="session" class="com.java1234.model.Student"/>
<h1>姓名:<jsp:getProperty property="name" name="stu"/></h1>
<h1>年龄:<jsp:getProperty property="age" name="stu"/></h1>

</body>
</html>