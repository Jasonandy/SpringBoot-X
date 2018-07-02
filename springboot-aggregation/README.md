![Mongo](http://upload-images.jianshu.io/upload_images/7802425-9eb1bcd006e34aa6.png?imageMogr2/auto-orient/strip%7CimageView2/2/w/1240)

# Ucaner
> You are what you want to be. - w.b

# Boot
* Project：Boot
* OfficialWebsite：http://boot.ucaner.cn
* describe：SpringBoot整合一些常见的 aop poi mysql log 整合等等


### 简述
SpringBoot是由Pivotal团队提供的全新框架，其设计目的是用来简化新Spring应用的初始搭建以及开发过程。
该框架使用了特定的方式来进行配置，从而使开发人员不再需要定义样板化的配置。


### 代码结构图
![](http://upload-images.jianshu.io/upload_images/7802425-144db0878a080284.png?imageMogr2/auto-orient/strip%7CimageView2/2/w/1240)
### 逻辑结构图
![](http://upload-images.jianshu.io/upload_images/7802425-5e5f420981c98149.png?imageMogr2/auto-orient/strip%7CimageView2/2/w/1240)
### POM Maven结构
```java
<!--aop - SpringBoot -->
<dependency>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-starter-aop</artifactId>
</dependency>
<!--aop - SpringBoot ****  -->
<!--mail - SpringBoot-->
<dependency>
    <groupId>junit</groupId>
    <artifactId>junit</artifactId>
    <scope>test</scope>
</dependency>
<dependency>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-starter-mail</artifactId>
</dependency>
<!--mail - SpringBoot **** -->
<!--Spring boot - freeMark -->
<dependency>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-starter-freemarker</artifactId>
</dependency>
<!--Spring boot - freeMark *** -->

<!--springboot 集成Mybatis所需jar配置 start -->
<!--支持使用 JDBC 访问数据库 -->
<dependency>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-starter-jdbc</artifactId>
</dependency>
<!--testMybatis-->
<dependency>
    <groupId>org.mybatis.spring.boot</groupId>
    <artifactId>mybatis-spring-boot-starter</artifactId>
    <version>1.2.0</version>
</dependency>
<!--mapper-->
<dependency>
    <groupId>tk.mybatis</groupId>
    <artifactId>mapper-spring-boot-starter</artifactId>
    <version>1.1.1</version>
</dependency>
<!--pagehelper-->
<dependency>
    <groupId>com.github.pagehelper</groupId>
    <artifactId>pagehelper-spring-boot-starter</artifactId>
    <version>1.1.1</version>
</dependency>
<!--mysql-->
<dependency>
    <groupId>mysql</groupId>
    <artifactId>mysql-connector-java</artifactId>
</dependency>
<!--springboot 集成Mybatis所需jar配置 end -->

<dependency>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-starter-web</artifactId>
</dependency>

<!--test-->
<dependency>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-starter-test</artifactId>
</dependency>

<dependency>
    <groupId>junit</groupId>
    <artifactId>junit</artifactId>
    <version>4.12</version>
</dependency>

<dependency>
    <groupId>org.springframework</groupId>
    <artifactId>springloaded</artifactId>
    <version>1.2.3.RELEASE</version>
</dependency>
<!--Spring docs-->
<dependency>
    <groupId>org.springframework.restdocs</groupId>
    <artifactId>spring-restdocs-mockmvc</artifactId>
    <scope>test</scope>
</dependency>
<dependency>
    <groupId>junit</groupId>
    <artifactId>junit</artifactId>
</dependency>
<dependency>
    <groupId>com.alibaba</groupId>
    <artifactId>fastjson</artifactId>
    <version>1.2.37</version>
</dependency>
<dependency>
    <groupId>org.projectlombok</groupId>
    <artifactId>lombok</artifactId>
</dependency>
<!--Spring docs  -->
```

> 整合常见组件
- Aop
- FreeMark
- Interceptor
- Mail
- Mybatis
- RestDocs
- Servlet

> Todo
- [X] Validator
- [ ] MongoDB
- [ ] ElasticSearch


### FAQ
- Maven很多依赖估计有问题
- SpringBoot 启动时加载DataSource问题
- Pom配置问题
- SpringBoot加载启动问题


### ENV
- JDK 1.8
- Intellij IDEA 14
- Mysql 5.5
- Git
- gitHub
- gitee

## Contact
- QQ:603043194
- E-Mail: jasonandy@hotmail.com

## License
开源协议 [Apache License, Version 2.0](http://www.apache.org/licenses/LICENSE-2.0.html)

![](http://upload-images.jianshu.io/upload_images/7802425-bb910b4ae954107a.png?imageMogr2/auto-orient/strip%7CimageView2/2/w/1240)