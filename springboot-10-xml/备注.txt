（1）新建一个工程;

（2）在App.java类编写HelloService2;

（3）在App.java类无法扫描的包下编写HelloService;

（4）编写application-bean.xml注入HelloService;

（5）编写配置文件application-bean.xml;
	<?xml version="1.0" encoding="UTF-8"?>
	<beans xmlns="http://www.springframework.org/schema/beans"
	xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
	xsi:schemaLocation="http://www.springframework.org/schema/beans http://www.springframework.org/schema/beans/spring-beans.xsd">
		<!-- 注入spring boot无法扫描到的bean. -->
		<bean id="helloService" class="org.kfit.service.HelloService"></bean>
	</beans>

（6）编写ConfigClass注入配置文件application-bean.xml;
	/**
	* classpath路径：locations={"classpath:application-bean1.xml","classpath:application-bean2.xml"}
	* file路径： locations = {"file:d:/test/application-bean1.xml"};
	*/
	@Configuration
	@ImportResource(locations={"classpath:application-bean.xml"})
	//@ImportResource(locations={"file:d:/test/application-bean1.xml"})
	public class ConfigClass {
	
	}

（7）编写App.java启动类进行测试；

（8）其它说明
ImportResouce有两种常用的引入方式：classpath和file，具体查看如下的例子：
classpath路径：locations={"classpath:application-bean1.xml","classpath:application-bean2.xml"}
file路径：locations = {"file:d:/test/application-bean1.xml"};