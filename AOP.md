# AOP(面向切面编程)



## 1.pom.xml 配置文件

```java
<dependency>
    <groupId>org.springframework</groupId>
    <artifactId>spring-context</artifactId>
</dependency>
<dependency>
    <groupId>org.springframework</groupId>
    <artifactId>spring-aop</artifactId>
</dependency>
<dependency>
    <groupId>org.aspectj</groupId>
    <artifactId>aspectjrt</artifactId>
    <version>1.6.12</version>
</dependency>
<dependency>
    <groupId>org.aspectj</groupId>
    <artifactId>aspectjweaver</artifactId>
    <version>1.6.12</version>
</dependency>
<dependency>
    <groupId>cglib</groupId>
    <artifactId>cglib</artifactId>
    <version>2.2</version>
</dependency>
```

## 2.aop是基于代理完成的，所以我们要自行激活我们的自动代理

```java
<aop:aspectj-autoproxy></aop:aspectj-autoproxy>
```

## 3.注册一个切面要使用的类

```java
<!--2.注册切面要使用的类 -->
<bean class="com.sontan.advice.beforeAspect" id="beforeAspect"></bean>

<bean class="com.sontan.service.userService" id="userService"></bean>
```

## 4.配置切入点等等信息

```java
<!--3.配置切入点等等信息 -->
<aop:config>
    <aop:aspect ref="beforeAspect" id="beforeAspect">
        <!--
        aop:before 表明它确实是前置通知
        method 表明它使用的那个方法来切
        pointcut 切入点-->
        <aop:before method="aspect" pointcut="execution(* com.sontan.service..*.*(..))"></aop:before>
    </aop:aspect>

</aop:config>
```

**<u>！！ applicationContext 中的切入点的类要是被spring 管理的</u>**

## 注意

```java
<aop:after method="afteraspect" pointcut="execution(* com.sontan.service.*.afteraspect3(..))"/>
 <!--
            service.*.*(..)
            第一个*是service下面的任意的类
            第二个*是任何的方法名
            （..）任意参数，没有参数，无数个也行
            （）表示切 无参数的方法
            -->
```