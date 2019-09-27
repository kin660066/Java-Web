<%@ taglib prefix="for" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/7/26
  Time: 15:32
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>main</title>
</head>
<body>
<div style="align-content: center">
    <form action="${pageContext.request.contextPath}/news/search.do">
        <span>新闻标题:</span><input type="text"name="title" value="${title1}"/> <input type="submit" value="查询"></form>
</div>
<div style="align-content: center">
    <form action="${pageContext.request.contextPath}/news/searchComment2.do">
        <span>评论标题:</span>
        <select name="nid" id="">
            <option value="0">全部</option>
            <c:forEach items="${listc}" var="list2">
            <option value="${list2.newsid}" >${list2.newsid}</option>
            </c:forEach>
            <input type="submit" value="查询"/>
        </select>
    </form>

</div>
<div>
<table style="border: 1px">
    <thead>
    <tr>
        <th colspan="6"><h1>新闻栏目</h1></th>
    </tr>
    </thead>
    <tbody>
    <tr>
        <th>新闻编号</th>
        <th>新闻标题</th>
        <th>新闻摘要</th>
        <th>作者</th>
        <th>创建时间</th>
        <th>操作</th>
    </tr>
    <c:forEach items="${list}" var="list">
    <tr>
        <td>${list.id}</td>
        <td>${list.title}</td>
        <td>${list.summary}</td>
        <td>${list.author}</td>
        <td>${list.createdate}</td>
        <td>
            <a href="${pageContext.request.contextPath}/news/toAddComment.do?title=${list.title}&id=${list.id}">评论</a>
            <a href="${pageContext.request.contextPath}/news/searchComment.do?newsid=${list.id}">查看评论</a>
            <a href="${pageContext.request.contextPath}/news/delete.do?id=${list.id}">删除</a>
        </td>
    </tr>
    </c:forEach>
    </tbody>
    <th colspan="6">
        <td>${msg}</td>
    </th>
</table>
</div>
</body>
</html>
<style>
    tr:nth-child(2n){
        background-color: aquamarine;
    }
</style>
