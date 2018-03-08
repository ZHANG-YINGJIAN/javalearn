<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/1/11 0011
  Time: 16:00
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    String userName = request.getParameter("userName");
    String  pwd= request.getParameter("pwd");
    String  remember= request.getParameter("remember");

    if("remember-me".equals(remember)){
        Cookie userNameAndPwd = new Cookie("userNameAndPwd",userName+"-"+pwd);
        userNameAndPwd.setMaxAge(1*60*60*24*7); //保存期限
        response.addCookie(userNameAndPwd);
        System.out.println("设置成功");
    }
    response.sendRedirect("response03.jsp");
%>

</body>
</html>
