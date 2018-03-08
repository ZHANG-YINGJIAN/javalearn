<%@ page import="java.util.List" %>
<%@ page import="com.chap8.model.People" %>
<%@ page import="java.util.ArrayList" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/1/18 0018
  Time: 13:39
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    String dogs[] = {"小红", "小黑", "小黄", "小白"};
    pageContext.setAttribute("dogs",dogs);
%>

<c:forEach var="dog" items="${dogs}">
    ${dog}
</c:forEach>
<hr>
<c:forEach var="dog" items="${dogs}" step="2">
    ${dog}
</c:forEach>
<hr>
<c:forEach var="dog" items="${dogs}" begin="1" step="2">
    ${dog}
</c:forEach>

<%
    List<People> p = new ArrayList<People>();
    p.add(new People(1, "zhang", 34));
    p.add(new People(2, "li", 35));
    p.add(new People(3, "wang", 33));
    pageContext.setAttribute("p",p);////千万不要忘记放进对象
%>

<table>
    <tr>
        <th>编号</th>
        <th>姓名</th>
        <th>年龄</th>
    </tr>
    <c:forEach var="peo" items="${p}">
        <tr>
            <td>${peo.id}</td>
            <td>${peo.name}</td>
            <td>${peo.age}</td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
