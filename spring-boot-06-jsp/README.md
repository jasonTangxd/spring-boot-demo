
## 大体步骤
19. jsp支持大体步骤：
    1. 创建Maven web project；
    2. 在pom.xml文件添加依赖；
    3. 配置application.properties支持jsp
    4. 编写测试Controller
    5. 编写JSP页面

20. Servlet、Filter、Listener、Interceptor 等等。
    1. 代码注册通过ServletRegistrationBean、FilterRegistrationBean 和ServletListenerRegistrationBean 获得控制。
	也可以通过实现ServletContextInitializer 接口直接注册。
    2. 在SpringBootApplication 上使用@ServletComponentScan注解后，Servlet、Filter、Listener 可以直接通过
    3. @WebServlet、@WebFilter、@WebListener 注解自动注册，无需其他代码。


21. 实现自定义拦截器只需要3步：
    1. 创建我们自己的拦截器类并实现HandlerInterceptor 接口。
    2. 创建一个Java类继承WebMvcConfigurerAdapter，并重写addInterceptors 方法。
    3. 实例化我们自定义的拦截器，然后将对像手动添加到拦截器链中（在addInterceptors方法中添加）。
 
- PS：本文重点在如何在Spring-Boot中使用拦截器，关于拦截器的原理请大家查阅资料了解。
