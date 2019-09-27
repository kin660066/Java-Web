<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/7/30
  Time: 16:49
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>转账</title>
</head>
<body>
<div class="layui-body">

    <c:if test="${code == 2000}">
        <h1>操作成功</h1>
    </c:if>
    <c:if test="${code == 2001}">
        <script>
            alert("${msg2}")
        </script>
    </c:if>

<c:if test="${ empty code and empty msg2}">
    <div style="padding: 15px;">
<form action="${pageContext.request.contextPath}/account/transfer.do">
    <input type="hidden" name="myCard" value="${account.cardNo}">
<span>转入卡号:</span> <input type="text" name="cardNo"/> <br/>
    <span>金额:</span> <input type="text" name="money"/><br/>
    <input type="submit" value="确认">

</form>
    </div>
</div>
</c:if>
</body>
</html>
