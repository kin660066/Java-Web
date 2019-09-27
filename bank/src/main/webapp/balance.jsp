<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/7/29
  Time: 21:19
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="utf-8">
    <title>查询余额</title>
</head>
<body>
<div class="layui-body">
    <!-- 内容主体区域 -->
    <div style="padding: 15px;">

        <table>
            <thead>
            <tr>
                <th>账户余额</th>
            </tr>
            </thead>
            <tbody>
            <tr>
                <td>银行卡号：</td>
                <td>${account.cardNo}</td>
            </tr>
            <tr>
                <td>余额：</td>
                <td>${account.balance}</td>
            </tr>
            </tbody>
        </table>
        </form>
    </div>
</div>

</body>
</html>
<script src="${pageContext.request.contextPath}/static/layui/layui.js"></script>
<link rel="stylesheet" href="${pageContext.request.contextPath}/static/layui/css/layui.css">
