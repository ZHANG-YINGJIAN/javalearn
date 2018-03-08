<%@ page import="java.util.List" %>
<%@ page import="java.util.ArrayList" %>
<%@ taglib prefix="java" uri="/WEB-INF/java123.tld"%>
<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/1/18 0018
  Time: 9:55
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
<%
    List people = new ArrayList();
    people.add("张三2");
    people.add("李四2");
    people.add("王五2");
    pageContext.setAttribute("people",people);
%>
</head>
<body>
<java:iterate2 items="people" var="p">
    <h2>${p }</h2>
</java:iterate2>
</body>
</html>