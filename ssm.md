# 项目错误

mybatis 传回 数值尽量用对象

如

``` sql
select username from user where id=#{id}
改为
select * from user where id=#{id}
再get出来
```

ajax

```javascript
${function(){
$("#id").click(
function(){
	$.ajxax({
        url:"",
        data:{
        "username":username
        },
        contentType:"application/json",
        type:"post",
        success:function(data){
            ........
        }
    })
})
}}
```

Jquery里面 JavaScript的onblur 是用 blur

链表查询要把id也查出来 否则只有一条信息



mysql自动获取当前时间

```sql
ALTER TABLE `tablename` ADD `add_time` TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP
```



jsp传值到controller

```jsp
 <a href="${pageContext.request.contextPath}/news/toAddComment.do?title=${list.title}&id=${list.id}">评论</a>
```



mysql自动存入时间

一、建表，设置createtime、updatetime的默认值为CURRENT_TIMESTAMP
二、设置updatetime列属性ON UPDATE CURRENT_TIMESTAMP

![img](E:\Operation System\imges\watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3NodXRuZw==,size_16,color_FFFFFF,t_70)



mysql级联删除

```mysql
FOREIGN KEY (`rootid`) REFERENCES roottb(`id`) ON DELETE CASCADE
```



` 

# SSM 整合

### 添加依赖

mybatis

mysql

json

log4j

数据源

<groupId>com.mchange</groupId>   c3p0          0.9.2.1

mybatis - spring

servlet jsp jstl

josn-date

mybatis 分页

MD5加密

## wel.xml 注册

### 上下文context

```xml
<context-param> 
    上下文
    <param-name>contextConfigLocation</param-name>
    <param-value>classpath：spring/applicationContext.xml</param-value>
</context-param>
```

### 字符编码

```xml
<filter> 
    <filter-name>encodingFilter</filter-name>
    <filter-class>org.springframework.web.filter.CharacterEncodingFilter</filter-class>
    <init-param>   
        <param-name>encoding</param-name> 
        <param-value>UTF-8</param-value> 
    </init-param></filter><filter-mapping> 
        <filter-name>encodingFilter</filter-name>  
        <url-pattern>/*</url-pattern>
</filter-mapping>
```

### DispatcherServlet

```xml
<!-- Spring MVC 入口 --><servlet>
    <servlet-name>spring-mvc</servlet-name>  
    <servlet-class>org.springframework.web.servlet.DispatcherServlet</servlet-class> 
    <init-param>    <param-name>contextConfigLocation</param-name> 
        <!-- 指定第四步mvc 的配置文件 -->   
        <param-value>classpath:spring/spring-mvc.xml</param-value> 
    </init-param>  <load-on-startup>1</load-on-startup></servlet>
<servlet-mapping>
    <servlet-name>spring-mvc</servlet-name> 
    <!-- 此处可以可以配置成*.do，对应struts的后缀习惯 --> 
    <url-pattern>*.do</url-pattern>
</servlet-mapping>
```

### spring启动监听器配置

```xml
<listener>
    <listener-class>org.springframework.web.context.ContextLoaderListener</listener-class>
</listener>
```

系统启动的时候，系统自动加载org.springframework.web.context.ContextLoaderListener这个类，然后由它负责创建Spring容器即WebApplicationContext，系统会把bean放在其中，一般情况下，创建完成后，负责IOC操作，你不需要获取它，如果非要在程序中调用它，可以通过WebApplicationContext ctx = WebApplicationContextUtils.getWebApplicationContext(servletContext);来获取这个容器。

### spring核心文件配置

applicationContext.xml 

核心配置文件用来引入其他配置文件

```xml
<?xml version="1.0" encoding="UTF-8"?>
<beans xmlns="http://www.springframework.org/schema/beans"   xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"   xmlns:p="http://www.springframework.org/schema/p"   xmlns:context="http://www.springframework.org/schema/context"   xmlns:mvc="http://www.springframework.org/schema/mvc"   xsi:schemaLocation="http://www.springframework.org/schema/beans                     http://www.springframework.org/schema/beans/spring-beans-4.0.xsd                     http://www.springframework.org/schema/context                     http://www.springframework.org/schema/context/spring-context-4.0.xsd                     http://www.springframework.org/schema/mvc                     http://www.springframework.org/schema/mvc/spring-mvc-4.0.xsd">
    <mvc:annotation-driven />   <!--导入其他包 -->  
    <import resource="classpath:spring/spring-mybatis.xml" />
</beans>
```