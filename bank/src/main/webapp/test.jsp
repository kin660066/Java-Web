<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/7/31
  Time: 20:49
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<script src="${pageContext.request.contextPath}/static/jQuery/jquery-3.4.1.js"></script>


<style>
    div{
        width: 100px;
        height: 100px;
    }

</style>
<body>
<%--<div>cc</div>--%>
<%--<div class="aa">aa</div>--%>
<%--<div id="bb">bb</div>--%>

<input type="text" value="https://t12.baidu.com/it/u=3017150474,4193349837&fm=76"/> <button id="aa">切换</button>
<img src="https://i2.hdslb.com/bfs/face/a1efbdc8b34da2d5765f25ee5910b9441724aae0.jpg@68w_68h.webp"/>
</body>
</html>
<script>
    $(function () {
        $("#aa").click(function () {
            var input =$("input").val()
            var img = $("img")
            img.attr("src",input)
        })

    })
    // $.holdReady(false)
    // $(function () {
    //     alert("123")
    // })
    // var arr = [1,5,4,3]
    // arr.forEach(function (value, index) {
    //     console.log(value,index,arr);
    // })
    // function aa(){
    //
    // }
    // aa.staticMethod = function(){
    //     alert("static")
    // }
    // aa.staticMethod();
    //
    // aa.prototype.aaaMethod = function(){
    //     alert("aaa")
    // }
    // var a = new aa();
    // a.aaaMethod();
    // jQuery.noConflict()
    // var aa= jQuery.noConflict
   // var img =  document.getElementsByTagName("img")[0]
   // console.log(img)
   // var width =window.getComputedStyle(img).width;
   // console.log(width)
   // $(function () {
   //     var img = $("img")
   //     console.log(img);
   //     var width = img.width;
   //     console.log(width)
   // })
    // var div1=document.getElementsByTagName("div")
    // var div2=document.getElementsByClassName("aa")[0]
    // var div3=document.getElementById("bb")
    // div2.style.background="red"
    // $(function () {
    //     var a = $("div")
    //     a.css({
    //         background: "red"
    //     })
    //     var b = $("#bb")
    //     b.css({
    //         background: "blue"
    //     })
    // })
</script>
