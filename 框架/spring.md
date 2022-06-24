# 简介

struts1、2 封装了servlet

struts1 封装了servlet

struts2 封装了filter

* MVC框架 springMVC
* 持久层 mybatis
* 整合型框架，设计型框架 spring

# 02看视频

路径

E:\BaiduNetdiskDownload\新概念英语等多个文件\尚硅谷javaee19年10月毕业班\尚硅谷javaEE 19年10月毕业班\03_框架\day02_video

## Dao

```java
package com.ioc.userDao.dao;

public interface UserDao {

	public void addUser();
}


package com.ioc.userDao.dao;

import org.springframework.stereotype.Repository;

@Repository
public class UserDaoImpl implements UserDao {
	
	public UserDaoImpl() {
		System.out.println("UserDaoImpl");
	}

	@Override
	public void addUser() {
		System.out.println("UserDaoImpl：添加成功");
		
	}
}

```

## service

```java
package com.ioc.userDao.service;

public interface UserService {

	public void addUser();
}

package com.ioc.userDao.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.ioc.userDao.dao.UserDao;


@Service
public class UserServiceImpl implements UserService {

	@Autowired
	@Qualifier("userDaoMybatisImpl")//有多个能为其赋值时，指定自动装配的bean,实际开发不会这样。它默认使用UserDao impl类上的来复制
	private UserDao userDao;// = new UserDaoImpl();
    
    //private UserDao userDao = new UserDaoImpl(); 原来是这样写的
    
    private UserDao userDao;// = new UserDaoImpl();
	
	public UserServiceImpl() {
		System.out.println("UserServiceImpl");
	}

	@Override
	public void addUser() {
		userDao.addUser();
		
	}
}

```

## controller(原来的servlet)

```java
package com.ioc.userDao.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.ioc.userDao.service.UserService;
import com.ioc.userDao.service.UserServiceImpl;

//@Controller(value="aaa")
@Controller("aaa") //默认为当前类名首字母小写 @Controller("userController")
public class UserController {
	
	@Autowired
	private UserService userService; // = new UserServiceImpl(); 自动装配不用手动赋值
	
	public void addUser() {
		userService.addUser();
	}
	
	public UserController() {
		System.out.println("userController");
	}
}

```

spring.xmlL配置

```xml
<?xml version="1.0" encoding="UTF-8"?>
<beans xmlns="http://www.springframework.org/schema/beans"
	xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
	xmlns:context="http://www.springframework.org/schema/context"
	xsi:schemaLocation="http://www.springframework.org/schema/beans http://www.springframework.org/schema/beans/spring-beans.xsd
		http://www.springframework.org/schema/context http://www.springframework.org/schema/context/spring-context-4.0.xsd">
	
	<!-- 
		<context:component-scan>:扫描组件，对设置的包下面的类进行扫描，
		会将加上注解的类进行spring组件进行加载：指spring中的bean
		作为spring的组件：会自动在spring中生成bean
		这些bean的id会以这些类的首字母小写为id
	 -->
	<!-- <context:component-scan base-package="com.ioc.userDao" use-default-filters="false"> 关闭默认的use
		<context:include-filter type="annotation" expression="org.springframework.stereotype.Controller"/>注解方式
		<context:include-filter type="assignable" expression="com.ioc.userDao.controller.UserController"/>类方式
	</context:component-scan> -->
	<context:component-scan base-package="com.ioc.userDao" use-default-filters="true"> 
		
	</context:component-scan>
	<!-- 在用exclude 时要用默认的use 全部扫描 -->
	
<!-- 	<bean id="userServiceImpl" class="com.ioc.userDao.service.UserServiceImpl"></bean>
	<bean id= "userController" class="com.ioc.userDao.controller.UserController"></bean>
	<bean id="userDaoImpl" class="com.ioc.userDao.dao.UserDaoImpl"></bean> -->
	
	<bean id="userDao" class="com.ioc.userDao.dao.UserDaoImpl"></bean><!-- @autowried能进行切换选择能行的  -->
</beans>

```

# 动态代理

E:\BaiduNetdiskDownload\新概念英语等多个文件\尚硅谷javaee19年10月毕业班\尚硅谷javaEE 19年10月毕业班\03_框架\day03_video

01

#03 day

aop 面向切面编程 横向抽取 【代理】

oop面向对象编程 纵向基础

 