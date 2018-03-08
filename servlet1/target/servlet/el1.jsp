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
<%
    pageContext.setAttribute("info1","page范围的值");
    request.setAttribute("info2","request范围的值");
    session.setAttribute("info3","session范围的值");
    application.setAttribute("info4","application范围的值");
%>
<h1>${info1}</h1>
<h1>${info1}</h1>
<h1>${info1}</h1>
<h1>${info1}</h1>
</body>
</html>
