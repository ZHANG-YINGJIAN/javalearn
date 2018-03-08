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
        function loadInfo() {
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
                    var dataObj = eval("("+xmlHttp.responseText+")");
                    alert(dataObj.name);
                    alert(dataObj.age);
                    document.getElementById("name").value=dataObj.name;
                    document.getElementById("age").value=dataObj.age;

                }

            }
            xmlHttp.open("get","getAjaxInfo",true);
            xmlHttp.send();

        }
    </script>
</head>
<body>
<div style="text-align:center">
    <div><input type="button" onclick="loadInfo()" value="ajax获取信息"/>&nbsp;&nbsp;姓名：<input type="text" id="name" name="name"/>&nbsp;&nbsp;年龄：<input type="text" id="age" name="age"/></div>

</div>
</body>
</html>
