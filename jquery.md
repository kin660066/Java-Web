# Jquery

## 1



```jsp
<body>
<%--<div>cc</div>--%>
<%--<div class="aa">aa</div>--%>
<%--<div id="bb">bb</div>--%>
<img src="https://i2.hdslb.com/bfs/face/a1efbdc8b34da2d5765f25ee5910b9441724aae0.jpg@68w_68h.webp"/>
</body>
```

```jsp
<script>
   var img =  document.getElementsByTagName("img")[0]
   console.log(img)
   var width =window.getComputedStyle(img).width;
   console.log(width)
   $(function () {
       var img = $("img")
       console.log(img);
       var width = img.width;
       console.log(width)
   })
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
```

## 2 释放$的使用权

```javascript
$.noConflict()
```

以后只能用jQuery不能用$



自定义jQuery符号

```javascript
var aa= jQuery.noConflict
```

## 3.实例方法与静态方法

```javascript
 function aa(){

    }
    aa.staticMethod = function(){
        alert("static")
    }
    aa.staticMethod();

    aa.prototype.aaaMethod = function(){
        alert("aaa")
    }
    var a = new aa();
    a.aaaMethod();
```

## 4.attr prop

![1564648027806](E:\Operation System\imges\1564648027806.png)

## 5.JQuery中click() 和onclick()区别

**1、onclick是绑定事件，告诉浏览器在鼠标点击时候要做什么**

**2、click()方法的主要作用是触发调用click方法元素onclick事件。**

**3、当click()被点击时，首先执行的是对应元素的onclick()函数，然后再是click()，示例如下：**

```JavaScript
JS代码 test.js：
$("#testclick").click(function(){
     console.log("$(\"#testclick\").click");  });
function test123(){ 　　console.log("function test()"); }
```

```jsp
 1 <!DOCTYPE html>
 2 <html>
 3   <head>
 4     <title>TestJS.html</title>
 5     
 6     <meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
 7     <meta http-equiv="description" content="this is my page">
 8     <meta http-equiv="content-type" content="text/html; charset=UTF-8">
 9     
10     <!--<link rel="stylesheet" type="text/css" href="./styles.css">-->
11 
12     
13   </head>
14   
15   <body>
16     This is my HTML page. <br>
17     <h1>Test html</h3>
18     <div>
21         <input type="button" onclick="test123();" class="input1" id="testclick" value="test_button"/>
22     </div>
23     
24     <!-- JS-->
26     <script src="js/lib/jquery.js"></script>
27     <script src="js/test.js"></script>
28     <!-- <script src="js/test2.js"></script> -->
29   </body>
30 </html>
```



**结果：**

　　**控制台打印出的顺序是：**

　　function test()

　　$("#testclick").click



## 6.offset 偏移量 

![1564739953183](E:\Operation System\imges\1564739953183.png)

## 7.网页偏移位 scolltop

![1564740834054](E:\Operation System\imges\1564740834054.png)