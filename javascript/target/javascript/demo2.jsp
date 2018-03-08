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
/*
    function fun(){
        a=22;
    }
    fun();
    alert(a);
 */
    function func() {
        var a=22;
        //想要读取a变量的值
        //闭包 能够读取其他函数内部变量的函数
        function func2() {
            return a;
        }
        return func2;
    }


    alert("局部变量"+func()());
</script>
</body>
</html>
