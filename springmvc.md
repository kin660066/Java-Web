[TOC]



#                            Spring MVC

## 配置

pom引入依赖

```xml
<!-- https://mvnrepository.com/artifact/org.springframework/spring-webmvc -->
<dependency>
    <groupId>org.springframework</groupId>
    <artifactId>spring-webmvc</artifactId>
    <version>5.1.8.RELEASE</version>
</dependency>


<!-- 如果是implement controller 才要加入-->
<!-- https://mvnrepository.com/artifact/javax.servlet/javax.servlet-api -->
<dependency>
    <groupId>javax.servlet</groupId>
    <artifactId>javax.servlet-api</artifactId>
    <version>4.0.1</version>
    <scope>provided</scope>
</dependency>




```

注册一个前端控制器

```xml
 <!--
    这里写的这个名字是有讲究的
    如果我们不去修改spring配置文件默认的位置
    那么springmvc 他就回去web-inf下面找一个叫springmvc-servlet.xml的文件
    -->
<servlet>
    <servlet-name>springmvc</servlet-name>
    <servlet-class>org.springframework.web.servlet.DispatcherServlet</servlet-class>
  </servlet>
  <servlet-mapping>
    <servlet-name>springmvc</servlet-name>
    <url-pattern>/</url-pattern>
  </servlet-mapping>
```

```xml
<url-pattern>/</url-pattern>
```

url 千万不要写成 /*

只能写/ 和 *.do



### 前端控制器

springmvc设计的理念是希望开发者尽量远离原生的servletAPI 因为这个API不是很好用又繁琐





注册一个视图解析器

```xml
<bean class="org.springframework.web.servlet.view.InternalResourceViewResolver">
        <property name="prefix" value="/jsp/"/>
        <property name="suffix" value=".jsp"/>
    </bean>
```



### 关于springmvc配置文件名字的问题

默认情况下使用dispatcherServlet的名字当作命名空间

[servletName]-servlet.xml(WEB_INF)之下寻找

[servletName]-servlet=namesapce



```xml
<!-- springmvc 配置文件 移动其他地方-->
<init-param>    
    <param-name>contextConfigLocation</param-name>
    <param-value>classpath:springmvc.xml</param-value>
</init-param>
```



```xml
<init-param>
    <param-name>namespace</param-name>
    <param-value>mvc</param-value>
</init-param>
<!-- 
		param-value :mvc 就是 WEB-INF/mvc.xml
-->
```



# 注释

## @Controller

```xml
<context:component-scan base-package="com.sontan.controller"/>
```

扫描包 在springmvc.xml中加入

```xml
<mvc:annotation-driven/>
```

`<mvc:annotation-driven/>`相当于注册了DefaultAnnotationHandlerMapping和AnnotationMethodHandlerAdapter两个bean，配置一些messageconverter.即解决了`@Controller`注解的使用前提配置.

## @PathVariable*

```java
@RequestMapping("/aaa/{name}")
public String aaa(ModelMap map ，@PathVariable("id") Integer id){
        String aaa="aaa";
		map.addAttribute("id",id)
        map.addAttribute("time",date);
        return "aaa";
    }
```

从路径上请求数据



## @ResponseBody

用来返回数据 一般为json格式



## 关于Post请求 中文乱码

springmvc提供一个非常好的字符编译器，所以我们注册即可

```xml
<filter>  
    <filter-name>CharacterEncodingFilter</filter-name>
    <filter-class>org.springframework.web.filter.CharacterEncodingFilter</filter-class>  <init-param>
    <param-name>encoding</param-name>
    <param-value>UTF-8</param-value>
    </init-param>
    <init-param>
        <param-name>forceRequestEncoding</param-name>
        <param-value>true</param-value>  
    </init-param></filter><filter-mapping>
        <filter-name>CharacterEncodingFilter</filter-name>  
        <url-pattern>/*</url-pattern>
</filter-mapping>
```

## @SessionAttributes

这个用在类上面，它会自动地将map存到session里面



## @SessionAttribute

这个用在参数上

```java
public String a(@SessionAttribute User user){
    ......
}
```

用来检查session里面有无user

## 解析返回的Json

```js
${function(){
    ${"#id"}.click(function(){
        $.ajax({
            url:"{绝对路径}/json/m1",
            type:post,
            success:function(data){
                alert(data.name);
            }
        })
    })
}}
```

## 拦截器

springmvc提供了拦截器，类似于过滤器，它将在我们的请求处理器之前，有权决定接下来是否继续，对我们的请求进行加工，拦截器可以设计为多个

通过实现HandlerInterceptor，这是一个借口

定了非常重要的三种方法

+ 前置处理
+ 后置处理
+ 完成处理

```xml
<mvc:interceptors>
    <mvc:interceptor>
        <mvc:mapping path="/**/*"/> <!-- /**/* 意思是所有路径下的所有方法-->
        <bean class="com.sontan.interceptors.MethodTomerInterceptor"/>    </mvc:interceptor>
</mvc:interceptors>
```

配置拦截器

实现 HandlerInterceptor 这个接口	

里面有三个方法

其一方法

```java
public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
    long start = System.currentTimeMillis();
    request.setAttribute("start",start);    logger.info(request.getRequestURI()+"请求到达"); 
    //返回true,才会找下一个拦截器，如果没有下一个拦截器，则去到controller
    return true;
}
```