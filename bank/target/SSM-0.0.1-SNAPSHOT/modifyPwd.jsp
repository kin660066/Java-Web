<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/7/29
  Time: 22:07
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>modifyPwd</title>
</head>
<body>
<div class="layui-body">

    <div style="padding: 15px;">
    <form action="${pageContext.request.contextPath}/account/modifyPwd.do?username=${account.cardNo}">
        <table>
            <thead>
            <tr>
                <th>账户余额</th>
            </tr>
            </thead>
            <tbody>
            <tr>
                <td>银行卡号：</td>
                <td><input type="text" value="${account.cardNo}" name="username" readonly="readonly"></td>
            </tr>
            <tr>
                <td>密码：</td>
                <td>${account.password}</td>
            </tr>
            <tr>
                <td>新密码</td>
                <td><input type="text" name="pwd"/></td>
            </tr>
            </tbody>
            <tr>
                <td colspan="2"><input type="submit" value="确认"></td>
            </tr>
        </table>
    </form>
</div>
</div>
</body>
</html>
<script src="${pageContext.request.contextPath}/static/layui/layui.js"></script>
<link rel="stylesheet" href="${pageContext.request.contextPath}/static/layui/css/layui.css">