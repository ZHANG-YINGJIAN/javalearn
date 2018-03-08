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
    //直接赋值
    var marry={
        name:"marry",
        age:23,
        shout:function(){
            alert(this.name+" "+this.age);
        },
        action:function () {
            alert("吃")
        }
    };

    alert(marry.name)
    alert(marry.age);
    marry.shout();
    marry.action();
    //构造
    function dog(name,age) {
        this.name=name;
        this.age=age;
        this.shout=function () {
            alert(this.name+" "+this.age);
        };
        this.action=function () {
            alert("吃");
        };
    }

    var jack = new dog("jack",13);
    alert(jack.name)
    alert(jack.age);
    jack.shout();
    jack.action();


</script>
</body>
</html>
