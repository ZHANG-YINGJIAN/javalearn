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
        function loadName() {
            var xmlHttp;
            if(window.XMLHttpRequest) {
                xmlHttp=new XMLHttpRequest();
            }else{
                xmlHttp = new ActiveXObject("Microsoft.XMLHTTP");

            }

            alert("readyState状态" + xmlHttp.readyState + ";status状态" + xmlHttp.status);
            xmlHttp.onreadystatechange=function () {
                alert("readyState状态" + xmlHttp.readyState + ";status状态" + xmlHttp.status);
                if(xmlHttp.readyState==4&&xmlHttp.status==200) {
                    alert(xmlHttp.responseText);
                    document.getElementById("name").value=xmlHttp.responseText;

                }

            }
            xmlHttp.open("get","getAjaxName",true);
            xmlHttp.send();

        }
    </script>
</head>
<body>
<div style="text-align:center">
    <div><input type="button" onclick="loadName()" value="ajax刷新次数"/>&nbsp;&nbsp;<input type="text" id="name" name="name"/></div>
</div>
</body>
</html>
