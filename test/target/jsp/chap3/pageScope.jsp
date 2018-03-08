<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/1/11 0011
  Time: 12:54
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    pageContext.setAttribute("name","zhang");
    pageContext.setAttribute("age",12);
%>
<%
    String name = (String)pageContext.getAttribute("name");
    int age = (Integer)pageContext.getAttribute("age");
%>
<font>name:<%=name%></font>
<font>age:<%=age%></font>

</body>
</html>
