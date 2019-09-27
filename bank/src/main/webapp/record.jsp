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
    <title>记录</title>
</head>
<body>
<div class="layui-body">


    <div style="padding: 15px;">
    <h1>转账记录</h1>
        <form action="${pageContext.request.contextPath}/transactionrecord/searchRecord.do" method="post">
            <input type="hidden" name="pageNum" value="1"/>
            <input type="hidden" name="pageSize" value="2"/>
            <input type="hidden" value="${account.cardNo}" name="cardNo"/>
    开始时间<input type="text" name="start"/> 结束时间 <input type="text" name="end"> <input type="submit" value="查询"/><br>
        </form>
        <c:if test="${not empty pageInfo.list}">
        <table border="1">
            <thead>
            <tr>
                <th>cardNo</th>
                <th>transctionDate</th>
                <th>transactionAmount</th>
                <th>balance</th>
                <th>transactionType</th>
                <th>remark</th>
            </tr>
            </thead>
            <tbody>
            <c:forEach var="list" items="${pageInfo.list}">
                <tr>
                <td>${list.cardNo}</td>
                <td>${list.transctionDate}</td>
                <td>${list.transactionAmount}</td>
                <td>${list.balance}</td>
                <td>${list.transactionType}</td>
                <td>${list.remark}</td>

            </tr>
            </c:forEach>
            <tr>
                <td colspan="6">
                    <a data-for="page-first" href="javascript:void(0);">首页</a>
                    <a data-for="page-prev" href="javascript:void(0);">上一页</a>
                    <a data-for="page-next" href="javascript:void(0);">下一页</a>
                    <a data-for="page-last" href="javascript:void(0);">末页</a>

                    当前${pageInfo.pageNum}页/共${pageInfo.pages}页
                </td>
            </tr>
            </tbody>
        </table>
        </c:if>
    </div>
</div>

</body>
</html>
<script src="${pageContext.request.contextPath}/static/jQuery/jquery-3.4.1.js"></script>
<script>
    $(function () {
        $('a[data-for^=page]').click(function () {
            var val = $(this).attr("data-for");
            var pageNum=${pageInfo.pageNum};
            switch (val) {
                case "page-first":
                    pageNum=1;
                break;
                case "page-prev":
                    pageNum=pageNum-1;
                    break;
                case "page-next":
                    pageNum=pageNum+1;
                    break;
                case "page-last":
                    pageNum=${pageInfo.pages}
                    break;
            }
            $('input[name=pageNum]').val(pageNum);
            $('form').submit();
        })
    })
</script>
<style>
    tr:nth-last-child(2n){
        background-color: #00FFFF;
    }
</style>