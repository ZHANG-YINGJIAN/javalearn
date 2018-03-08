<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/1/29 0029
  Time: 15:17
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <script type="text/javascript">
        var userName = document.getElementById("userName").value;
        function checkUserName() {
            var xmlHttp;
            if(window.XMLHttpRequest) {
                xmlHttp=new XMLHttpRequest();
            }else{
                xmlHttp = new ActiveXObject("Microsoft.XMLHTTP");
            }

            // alert("readyState状态" + xmlHttp.readyState + ";status状态" + xmlHttp.status);
            xmlHttp.onreadystatechange=function () {
                // alert("readyState状态" + xmlHttp.readyState + ";status状态" + xmlHttp.status);
                if(xmlHttp.readyState==4&&xmlHttp.status==200) {
                    alert(xmlHttp.responseText);
                   }
            }
            xmlHttp.open("get","getAjaxInfo?action=checkUserName&userName="+userName,true);
            xmlHttp.send();
        }
    </script>
</head>
<body>
<table align="center" style="padding-top: 150px">
    <tr>
        <th colspan="2" align="center">用户注册</th>
    </tr>
    <tr>
        <td>用户名：</td>
        <td><input type="text" id="userName" name="userName" onblur="checkUserName()"/><font id="tip"></font></td>
    </tr>
    <tr>
        <td>密  码：</td>
        <td><input type="text" id="password" name="password" align="center"/></td>
    </tr>
    <tr>
        <td>密码确认：</td>
        <td><input type="text" id="password2" name="password2" align="center"/></td>
    </tr>
    <tr>
        <td><input type="submit" value="注册" /></td>
        <td><input type="button" value="重置" /></td>
    </tr>
</table>

</body>
</html>
