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

  var sayFunc=new Function ("name","age","alert(name+''+age)");
      // sayFunc("lisi",35);
      alert(sayFunc.toString());//打印源码

</script>
</body>
</html>
