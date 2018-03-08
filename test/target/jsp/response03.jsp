<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/1/11 0011
  Time: 15:23
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<script type="text/javascript">
    function resetValue() {
        document.getElementById("userName").value="";
        document.getElementById("pwd").value="";
    }
</script>

<%
    String userName = null;
    String pwd = null;
    Cookie[] cookies=request.getCookies();
    for(int i = 0 ; cookies!=null && i<cookies.length;i++){
        if(cookies[i].getName().equals("userNameAndPwd")){
            userName=cookies[i].getValue().split("-")[0];
            pwd=cookies[i].getValue().split("-")[1];
        }
    }

    if(userName==null){
        userName="";
    }


    if(pwd==null){
        pwd="";
    }

%>
<body>
<form action="userLogin.jsp" method="post">
    <table>
        <tr>
            <td>用户名：</td>
            <td><input type="text" id="userName" name="userName" value="<%=userName%>"/></td>
        </tr>
        <tr>
            <td>密码：</td>
            <td><input type="password" id="pwd" name="pwd" value="<%=pwd%>"/></td>
        </tr>
        <tr>
            <td>记住密码：</td>
            <td><input type="checkbox" id="remember" name="remember" value="remember-me"/></td>
        </tr>
        <tr>
            <td><input type="submit" value="登陆" /></td>
            <td><input type="button" value="重置" onclick="resetValue()"/></td>
        </tr>
    </table>
</form>
<%

%>
</body>
</html>
