1、整体步骤：
(1) —— Druid简单介绍，具体看官网；
Druid是Java语言中最好的数据库连接池，并且能够提供强大的监控和扩展功能。
业界把Druid 和HikariCP 做对比后，虽说HikariCP 的性能比Druid 高，但是因为Druid 包括很多维度的统计和
分析功能，所以这也是大家都选择使用它的原因。
(2) —— 在pom.xml配置druid依赖包；
(3) —— 配置application.properties加入数据库源类型等参数；
(4) —— 编写druid servlet和filter提供监控页面访问；
(5) —— 输入地址进行测试；http://127.0.0.1:8080/druid/index.html


2、普通类调用Spring bean对象
(1)实现接口：ApplicationContextAware，然后加上@Component 注解即可
(2)注册Spring Util  这里为了和上一个冲突，所以方面名为：springUtil2
	@Bean
	public SpringUtil springUtil2(){return new SpringUtil();}
(3)主要是在App.java中使用@Import进行导入。
	@SpringBootApplication
	@ServletComponentScan
	@Import(value={SpringUtil.class})
	publicclass App {//省略其它代码.}	