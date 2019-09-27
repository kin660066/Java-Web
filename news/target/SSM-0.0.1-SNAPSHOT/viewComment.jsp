<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/7/27
  Time: 11:17
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>viewComment</title>
</head>
<body>
<table>
    <thead>
    <tr>
        <th colspan="3"><h1>查看评论</h1></th>
        <td><button onclick="x()">返回</button></td>
    </tr>
    </thead>
    <tbody>
    <tr>
        <th>新闻题号</th>
        <th>内容</th>
        <th>评论人</th>
        <th>评论时间</th>
    </tr>
    <c:forEach items="${list}" var="list">
    <tr>
        <td>${list.newsid}</td>
        <td>${list.content}</td>
        <td>${list.author}</td>
        <td>${list.createdate}</td>
    </tr>
    </c:forEach>
    </tbody>
</table>
</body>
</html>
<script>
    function x() {
        window.location="${pageContext.request.contextPath}/news/main.do"
    }
</script>