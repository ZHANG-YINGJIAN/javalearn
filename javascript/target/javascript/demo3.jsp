<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/1/29 0029
  Time: 12:39
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<script type="text/javascript">
    var name = "The window";
    var object={
        name:"My object",
        getNameFunc:function () {
            var name="object func";
            return function () {
                // return this.name;
                return name;
            };
        }
    };
    alert(object.name);
    alert(object.getNameFunc()())
</script>
</body>
</html>
