# 简介

Tomcat的静态资源能访问是由于里面有个默认的名字叫`default`的servlet

类的名字是DefaultServlet

可以在tomcat的web.xml里面看到这个

路径/

```xml
 <servlet>
        <servlet-name>default</servlet-name>
        <servlet-class>org.apache.catalina.servlets.DefaultServlet</servlet-class>
        <init-param>
            <param-name>debug</param-name>
            <param-value>0</param-value>
        </init-param>
        <init-param>
            <param-name>listings</param-name>
            <param-value>false</param-value>
        </init-param>
        <load-on-startup>1</load-on-startup>
</servlet>

<servlet-mapping>
        <servlet-name>default</servlet-name>
        <url-pattern>/</url-pattern>
</servlet-mapping>
```

当tomcat默认的url-pattern和开发人员配置的相同时，开发人员的servlet路径优





POJO 一个简单的类，没有继承任何其他的

springMVC属于spring中的一部分，它实现了servlet

# day01

```xml
springMVC的配置过程
1、导入jar
2、在web.xml中配置SpringMVCd的核心（前端）控制器 dispathcerServlet
作用：加载springMVC的配置文件，以下配置时，dispathcerServlet会自动加载默认位置的默认配置
默认位置为WEB-INF 默认配置名为<servlet-name>代表的值-servlet.xml 例如以下为springMVC-servlet.xml
当加载类springMVC的配置文件后，会根据扫描找到控制层
	<servlet>
		<servlet-name>springMVC</servlet-name>
		<servlet-class>org.springframework.web.servlet.DispatcherServlet</servlet-class>
	</servlet> 
	<servlet-mapping>
		<servlet-name>springMVC</servlet-name>
		<url-pattern>/</url-pattern>
	</servlet-mapping>
	
3、创建一个POPJ，在此类加上@Controller注解，springMVC会将其作为控制层，处理请求
4、在控制层中需要加上@RequestMapping(value="xxx") 
springMVC 就是通过此注解访将请求层路径与控制层的方法进行匹配，路径为 localhost:8080/projectName/xxx
5、处理请求的方法会
```

```java
package com.test;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Test {
	
	@RequestMapping("hello")
	public String hello() {
		System.out.println("SUCCESS");
		return "success";
	}
	@RequestMapping("test")
	public String test(String name.String age) {//通过这个直接获取参数
		System.out.println("SUCCESS");
		return "success";
	}

}

```

配置文件web.xml

```xml
<?xml version="1.0" encoding="UTF-8"?>
<web-app xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xmlns="http://java.sun.com/xml/ns/javaee" xsi:schemaLocation="http://java.sun.com/xml/ns/javaee http://java.sun.com/xml/ns/javaee/web-app_2_5.xsd" id="WebApp_ID" version="2.5">
  <display-name>SpringMVC</display-name>
  <welcome-file-list>
    <welcome-file>index.jsp</welcome-file>
  </welcome-file-list>

	<servlet>
		<servlet-name>springMVC</servlet-name>
		<servlet-class>org.springframework.web.servlet.DispatcherServlet</servlet-class>
	</servlet> 
	<servlet-mapping>
		<servlet-name>springMVC</servlet-name>
		<url-pattern>/</url-pattern>
	</servlet-mapping>
	
</web-app>
```

和web.xml位置一样

springMVC-servlet.xml

```xml
<?xml version="1.0" encoding="UTF-8"?>
<beans xmlns="http://www.springframework.org/schema/beans"
	xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
	xmlns:context="http://www.springframework.org/schema/context"
	xsi:schemaLocation="http://www.springframework.org/schema/beans http://www.springframework.org/schema/beans/spring-beans.xsd
		http://www.springframework.org/schema/context http://www.springframework.org/schema/context/spring-context-4.0.xsd">

	<!-- 扫描组件 -->
	<context:component-scan base-package="com.test"></context:component-scan>
	
	<!-- 配置视图解析器
		  作用：将 prefix + 视图名称 +suffix 来确定将要跳转的位置
	
	 -->
	<bean id="viewResolve" class="org.springframework.web.servlet.view.InternalResourceViewResolver">
		<property name="prefix" value="/WEB-INF/view/"></property>
		<property name="suffix" value=".jsp"></property>
	</bean>

</beans>

```

# REST讲解

E:\BaiduNetdiskDownload\新概念英语等多个文件\尚硅谷javaee19年10月毕业班\尚硅谷javaEE 19年10月毕业班\03_框架\day05_02_尚硅谷javaEE技术之SpringMVC\02_尚硅谷javaEE技术之SpringMVC\4.视频\day05_video

09视频



# 处理jackson

E:\BaiduNetdiskDownload\新概念英语等多个文件\尚硅谷javaee19年10月毕业班\尚硅谷javaEE 19年10月毕业班\03_框架部分新 （我们班的）\springmvc03

05

```java
处理方式
    @ResponseBody
    导入jar包
    开启mvc驱动
```
## 前端解析json

```html
<script type="text/javascript">
	$(function () {
		$("#btn").click(function () {
			$.ajax({
				url:"testJson",
				type:"POST",
				dataType:"json",
				success:function (msg){
					/*
						[
							{"id":1001,"lastName":"E-AA","email":"aa@163.com","gender":1,"department":{"id":101,"departmentName":"D-AA"}},
							{"id":1002,"lastName":"E-BB","email":"bb@163.com","gender":1,"department":{"id":102,"departmentName":"D-BB"}},
							{"id":1003,"lastName":"E-CC","email":"cc@163.com","gender":0,"department":{"id":103,"departmentName":"D-CC"}},
							{"id":1004,"lastName":"E-DD","email":"dd@163.com","gender":0,"department":{"id":104,"departmentName":"D-DD"}},
							{"id":1005,"lastName":"E-EE","email":"ee@163.com","gender":1,"department":{"id":105,"departmentName":"D-EE"}}
						]
					*/
					/* for(var i in msg){
						var emp = msg[i];
						alert("id="+emp.id+",lastName="+emp.lastName+",departmentName="+emp.department.departmentName);
					} */
					//第一种实现方式
					/* var tb = "<table>";
					tb += "<tr><th>id</th><th>lastName</th><th>email</th><th>gender</th><th>departmentName</th></tr>";
					for(var i in msg){
						var emp = msg[i];
						tb += "<tr><td>"+emp.id+"</td><td>"+emp.lastName+"</td><td>"+emp.email+"</td><td>"+emp.gender+"</td><td>"+emp.department.departmentName+"</td></tr>";
					}
					tb += "</table>";
					$("body").append(tb); */
					//第二种实现方式
					$("body").append("<table></table>");
					$("table").append("<tr><th>id</th><th>lastName</th><th>email</th><th>gender</th><th>departmentName</th></tr>");
					for(var i in msg){
						var emp = msg[i];
						$("table").append("<tr><td>"+emp.id+"</td><td>"+emp.lastName+"</td><td>"+emp.email+"</td><td>"+emp.gender+"</td><td>"+emp.department.departmentName+"</td></tr>");
					}
				}
			});
		});
	});
</script>
```





# day03  文件上传下载

E:\BaiduNetdiskDownload\新概念英语等多个文件\尚硅谷javaee19年10月毕业班\尚硅谷javaEE 19年10月毕业班\03_框架部分新 （我们班的）\springmvc03

07

## 下载

File.separator获取\或者/就是目录的分隔符

后端

```java
@RequestMapping("/down")
	public ResponseEntity<byte[]> down(HttpSession session) throws IOException{
		
		//获取下载文件的路径
		String realPath = session.getServletContext().getRealPath("img");
		String finalPath = realPath + File.separator + "2.jpg";
		InputStream is = new FileInputStream(finalPath);
		//available():获取输入流所读取的文件的最大字节数
		byte[] b = new byte[is.available()];
		is.read(b);
		//设置请求头
		HttpHeaders headers = new  HttpHeaders();
		headers.add("Content-Disposition", "attachment;filename=zzz.jpg");
		//设置响应状态
		HttpStatus statusCode = HttpStatus.OK;
		ResponseEntity<byte[]> entity = new ResponseEntity<byte[]>(b, headers, statusCode);
		return entity;
	}
```

前端

```html
<a href="down">下载图片</a>
```

配置文件web.xml

```xml
<?xml version="1.0" encoding="UTF-8"?>
<web-app xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xmlns="http://java.sun.com/xml/ns/javaee" xsi:schemaLocation="http://java.sun.com/xml/ns/javaee http://java.sun.com/xml/ns/javaee/web-app_2_5.xsd" id="WebApp_ID" version="2.5">
  <display-name>SpringMVC04</display-name>
  <welcome-file-list>
    <welcome-file>file.jsp</welcome-file>
  </welcome-file-list>
  
  <filter>
  	<filter-name>CharacterEncodingFilter</filter-name>
  	<filter-class>org.springframework.web.filter.CharacterEncodingFilter</filter-class>
  	<init-param>
  		<param-name>encoding</param-name>
  		<param-value>UTF-8</param-value>
  	</init-param>
  </filter>
  <filter-mapping>
  	<filter-name>CharacterEncodingFilter</filter-name>
  	<url-pattern>/*</url-pattern>
  </filter-mapping>
  
  <!-- The front controller of this Spring Web application, responsible for handling all application requests -->
	<servlet>
		<servlet-name>springDispatcherServlet</servlet-name>
		<servlet-class>org.springframework.web.servlet.DispatcherServlet</servlet-class>
		<init-param>
			<param-name>contextConfigLocation</param-name>
			<param-value>classpath:springMVC.xml</param-value>
		</init-param>
		<load-on-startup>1</load-on-startup>
	</servlet>

	<!-- Map all requests to the DispatcherServlet for handling -->
	<servlet-mapping>
		<servlet-name>springDispatcherServlet</servlet-name>
		<url-pattern>/</url-pattern>
	</servlet-mapping>
</web-app>
```

类路径下的srpingMVC.xml配置文件

```xml
<?xml version="1.0" encoding="UTF-8"?>
<beans xmlns="http://www.springframework.org/schema/beans"
	xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
	xmlns:context="http://www.springframework.org/schema/context"
	xmlns:mvc="http://www.springframework.org/schema/mvc"
	xsi:schemaLocation="http://www.springframework.org/schema/mvc http://www.springframework.org/schema/mvc/spring-mvc-4.0.xsd
		http://www.springframework.org/schema/beans http://www.springframework.org/schema/beans/spring-beans.xsd
		http://www.springframework.org/schema/context http://www.springframework.org/schema/context/spring-context-4.0.xsd">

	<context:component-scan base-package="com.file"></context:component-scan>
	
	<bean class="org.springframework.web.servlet.view.InternalResourceViewResolver">
		<property name="prefix" value="/WEB-INF/view/"></property>
		<property name="suffix" value=".jsp"></property>
	</bean>
	
	<mvc:default-servlet-handler/>
	
	<!-- jackson、静态资源 需要开启这个驱动 -->
	<mvc:annotation-driven />
	
	<!-- 
		处理文件，将客户端上传的File文件，处理为MultipartFile
		注意：文件解析器的bean中id必须设置为multipartResolver
	 -->
	<bean id="multipartResolver" class="org.springframework.web.multipart.commons.CommonsMultipartResolver">
		<!-- 设置文件解析的编码，注意：一定要和页面的pageEncoding保持一致 -->
		<property name="defaultEncoding" value="UTF-8"></property>
		<!-- 设置最大上传文件大小 -->
		<property name="maxUploadSize" value="88888888"></property>
	</bean>

    <!--拦截器可以判断是否登录-->
<!-- 	<mvc:interceptors>
		默认拦截所有请求
		<bean class="com.atguigu.interceptor.FirstInterceptor"></bean>
		<bean class="com.atguigu.interceptor.SecondInterceptor"></bean>
		此方式要求拦截器类上必须加注解@Component
		<ref bean="firstInterceptor"/>
		
		设置自定义拦截方式
		<mvc:interceptor>
			<bean></bean>
			<mvc:mapping path=""/>
			<mvc:exclude-mapping path=""/>
		</mvc:interceptor>
	</mvc:interceptors> -->

</beans>

```

## 上传,第二种是springmvc的

```java
	@RequestMapping(value="/up_old", method=RequestMethod.POST)
	public String up_old(String desc, MultipartFile uploadFile, HttpSession session) throws IOException {
		//获取上传文件的名称
		String fileName = uploadFile.getOriginalFilename();
		String path = session.getServletContext().getRealPath("photo") + File.separator + fileName;
		//获取输入流
		InputStream is = uploadFile.getInputStream();
		//获取输出流
		File file = new File(path);
		OutputStream os = new FileOutputStream(file);
		/*int i = 0;
		while((i = is.read()) != -1) {
			os.write(i);
		}*/
		
		/*int i = 0;
		byte[] b = new byte[1024];
		while((i = is.read(b)) != -1) {
			os.write(b, 0, i);
		}*/
		
		os.close();
		is.close();
		return "success";
	}

// 单个上传
	@RequestMapping(value="/up", method=RequestMethod.POST)
	public String up(String desc, MultipartFile uploadFile, HttpSession session) throws IOException {
		String inputVablue = uploadFile.getName();//头像：<input type="file" name="uploadFile" />,结果为uploadFile
		//获取上传文件的名称
		String fileName = uploadFile.getOriginalFilename();
		String finalFileName = UUID.randomUUID() + fileName.substring(fileName.lastIndexOf("."));//获得uuid.jpg/xxx.rar
		String path = session.getServletContext().getRealPath("photo") + File.separator + finalFileName;
		File file = new File(path);
		uploadFile.transferTo(file);
		return "success";
	}

//批量上传
	@RequestMapping(value="/up", method=RequestMethod.POST)
	public String up(String desc, MultipartFile uploadFiles[], HttpSession session) throws IOException {
        //一个for循序就可以了
        for(MultipartFile uploadFile:uploadFiles ){
            String inputVablue = uploadFile.getName();//头像：<input type="file" name="uploadFile" />,结果为uploadFile
            //获取上传文件的名称
            String fileName = uploadFile.getOriginalFilename();
            String finalFileName = UUID.randomUUID() + fileName.substring(fileName.lastIndexOf("."));//获得uuid.jpg/xxx.rar
            String path = session.getServletContext().getRealPath("photo") + File.separator + finalFileName;
            File file = new File(path);
            uploadFile.transferTo(file);
        }
		return "success";
	}

```

```html
	<form action="up" method="post" enctype="multipart/form-data">
		头像1：<input type="file" name="uploadFile" />
        头像2：<input type="file" name="uploadFile" />
        头像3：<input type="file" name="uploadFile" />
		描述：<input type="text" name="desc" />
		<input type="submit" value="上传" />
	</form>
```

## 拦截器

E:\BaiduNetdiskDownload\新概念英语等多个文件\尚硅谷javaee19年10月毕业班\尚硅谷javaEE 19年10月毕业班\03_框架部分新 （我们班的）\springmvc03

12

# spring 整合springmvc

顺序 context-param -> litener -> filter -> servlet

上下文参数、监听器、过滤器、servlet

web.xml整合

```xml
<?xml version="1.0" encoding="UTF-8"?>
<web-app xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xmlns="http://java.sun.com/xml/ns/javaee" xsi:schemaLocation="http://java.sun.com/xml/ns/javaee http://java.sun.com/xml/ns/javaee/web-app_2_5.xsd" id="WebApp_ID" version="2.5">
  <display-name>SpringMVC04</display-name>
  <welcome-file-list>
    <welcome-file>index.jsp</welcome-file>
  </welcome-file-list>
  <filter>
    <filter-name>CharacterEncodingFilter</filter-name>
    <filter-class>org.springframework.web.filter.CharacterEncodingFilter</filter-class>
    <init-param>
      <param-name>encoding</param-name>
      <param-value>UTF-8</param-value>
    </init-param>
  </filter>
  <filter-mapping>
    <filter-name>CharacterEncodingFilter</filter-name>
    <url-pattern>/*</url-pattern>
  </filter-mapping>
  <servlet>
    <servlet-name>springDispatcherServlet</servlet-name>
    <servlet-class>org.springframework.web.servlet.DispatcherServlet</servlet-class>
    <init-param>
      <param-name>contextConfigLocation</param-name>
      <param-value>classpath:springMVC.xml</param-value>
    </init-param>
    <load-on-startup>1</load-on-startup>
  </servlet>
  <servlet-mapping>
    <servlet-name>springDispatcherServlet</servlet-name>
    <url-pattern>/</url-pattern>
  </servlet-mapping>
  
  <!-- needed for ContextLoaderListener -->
	<context-param>
		<param-name>contextConfigLocation</param-name>
		<param-value>classpath:spring.xml</param-value>
	</context-param>

	<!-- Bootstraps the root web application context before servlet initialization -->
	<listener>
		<listener-class>org.springframework.web.context.ContextLoaderListener</listener-class>
	</listener>
  
</web-app>
```

类路径下的

spring.xml

```xml
<?xml version="1.0" encoding="UTF-8"?>
<beans xmlns="http://www.springframework.org/schema/beans"
	xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
	xmlns:context="http://www.springframework.org/schema/context"
	xsi:schemaLocation="http://www.springframework.org/schema/beans http://www.springframework.org/schema/beans/spring-beans.xsd
		http://www.springframework.org/schema/context http://www.springframework.org/schema/context/spring-context-4.0.xsd">

	<!-- <bean id="user" class="com.atguigu.bean.User"></bean> -->
	<context:component-scan base-package="com.atguigu">
		<context:exclude-filter type="annotation" expression="org.springframework.stereotype.Controller"/>
	</context:component-scan>
	
	

</beans>

```

springMVC.xml

```xml
<?xml version="1.0" encoding="UTF-8"?>
<beans xmlns="http://www.springframework.org/schema/beans"
	xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
	xmlns:context="http://www.springframework.org/schema/context"
	xmlns:mvc="http://www.springframework.org/schema/mvc"
	xsi:schemaLocation="http://www.springframework.org/schema/mvc http://www.springframework.org/schema/mvc/spring-mvc-4.0.xsd
		http://www.springframework.org/schema/beans http://www.springframework.org/schema/beans/spring-beans.xsd
		http://www.springframework.org/schema/context http://www.springframework.org/schema/context/spring-context-4.0.xsd">

	<context:component-scan base-package="com.atguigu.controller"></context:component-scan>
	
	<bean class="org.springframework.web.servlet.view.InternalResourceViewResolver">
		<property name="prefix" value="/WEB-INF/view/"></property>
		<property name="suffix" value=".jsp"></property>
	</bean>
	
	<mvc:default-servlet-handler/>
	
	<mvc:annotation-driven />
	
	<!-- 
		处理文件，将客户端上传的File文件，处理为MultipartFile
		注意：文件解析器的bean中id必须设置为multipartResolver
	 -->
	<bean id="multipartResolver" class="org.springframework.web.multipart.commons.CommonsMultipartResolver">
		<!-- 设置文件解析的编码，注意：一定要和页面的pageEncoding保持一致 -->
		<property name="defaultEncoding" value="UTF-8"></property>
		<!-- 设置最大上传文件大小 -->
		<property name="maxUploadSize" value="88888888"></property>
	</bean>
	
	<bean class="org.springframework.web.servlet.handler.SimpleMappingExceptionResolver">
		<property name="exceptionMappings">
			<props>
				<prop key="java.lang.NullPointerException">error</prop>
			</props>
		</property>
	</bean>

	<!-- <mvc:interceptors>
		默认拦截所有请求
		<bean class="com.atguigu.interceptor.FirstInterceptor"></bean>
		<bean class="com.atguigu.interceptor.SecondInterceptor"></bean>
		此方式要求拦截器类上必须加注解@Component
		<ref bean="firstInterceptor"/>
		
		设置自定义拦截方式
		<mvc:interceptor>
			<bean></bean>
			<mvc:mapping path=""/>
			<mvc:exclude-mapping path=""/>
		</mvc:interceptor>
	</mvc:interceptors> -->

</beans>

```

