<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/7/26
  Time: 21:55
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>addComment</title>
</head>
<body>
<form action="${pageContext.request.contextPath}/news/addComment.do?id=${id}" method="post">
    <table border="1">
        <thead>
        <tr>
            <th colspan="2">评论</th>
        </tr>
        </thead>
        <tr>
            <td>新问标题</td>
            <td>${title}</td>
        </tr>
        <tr>
            <td>评论内容：</td>
            <td><textarea name="content" cols="50" rows="10"></textarea></td>
        </tr>
        <tr>
            <td>姓名：</td>
            <td><input type="text" name="username"/></td>
        </tr>
        <tr>
            <td><input type="submit" value="提交"/><input type="reset" value="重置"/></td>
        </tr>
    </table>
</form>
</body>
</html>
