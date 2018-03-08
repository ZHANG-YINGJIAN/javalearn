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
    <title>
        登陆
    </title>
</head>
<body>
<form action="login" method="post">
    <table>
        <tr>
            <th colspan="2">用户登录</th>
        </tr>
        <tr>
            <td>用户名:</td>
            <td><input type="text" id="userName" name="userName" value="${userName}"/></td>
        </tr>
        <tr>
            <td>密码:</td>
            <td><input type="password" id="password" name="password" value="${password}"/></td>
        </tr>
        <tr>
            <td><input type="submit" value="登陆"/></td>
            <td><font color="red">${error}</font> </td>
        </tr>
    </table>
</form>
</body>
</html>
