<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/1/29 0029
  Time: 13:52
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<script type="text/javascript">
    function A(){
        this.objPre = "对象属性";
        A.prototype.objPre2="对象属性2";
        this.shout1=function () {
            var privatePro = "私有属性";
            return function () {
                return privatePro;
            };
        }
    }
    A.classPro="类属性";

    alert(A.classPro);
    var a = new A();
    alert(a.objPre);
    alert(a.objPre2);
    alert(a.shout1()());


</script>
</body>
</html>
