<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/1/12 0012
  Time: 18:39
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h2>目标地址</h2>
request值：<%=request.getAttribute("requestKey")%><br/>
session值：<%=session.getAttribute("sessionKey")%><br/>
application值：<%=application.getAttribute("applicationKey")%><br/>
</body>
</html>
