<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/1/11 0011
  Time: 12:27
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <%!
        String str="全局变量";
    %>
    <%!
        public void fun1(){
            System.out.println("全局方法");
    }
    %>
    <%!
        class C{
            private int a;
            public void f(){
                System.out.println("全局类");
            }
        }
    %>
    <%
        int a = 123;
        String b = "java";
        System.out.println(a+b+"局部");

    %>

    <title>Title</title>
</head>
<body>

</body>
</html>
