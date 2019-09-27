<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/7/29
  Time: 14:05
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>个人网上银行</title>
</head>


<meta charset="utf-8">
<body>
<div style="display: flex;justify-content: center">
    <div style="height: 300px;width: 400px;background-color: aquamarine">
        <form style="margin-left: 20%" action="${pageContext.request.contextPath}/account/login.do" onsubmit="return check()">
            <h1>个人网上银行</h1><br>
            <span>账号:</span><input type="text" placeholder="输入账号" name="username" id="username"><br/>
            <span>密码:</span><input type="text" placeholder="输入密码" name="pwd" id="pwd"><br/>
            <input style="margin-left: 20%" type="submit" value="登录">
            <span>${msg}</span>
        </form>

    </div>

</div>
</body>
</html>

<script src="${pageContext.request.contextPath}/static/jQuery/jquery-3.4.1.js"></script>
<script>
    function check() {
        var uname =$("#username").val();
        var pwd =$("#pwd").val();
       if (uname==""||pwd==""||uname==null||pwd==null) {
           alert("账号密码不能为空")
           return false;}
       else if(uname.length!=16){
           alert("卡号必须要16位")
       }else if (pwd.length!=6){
        alert("密码要6位")
        return false
       }
        return true;

    }
</script>

