Spring Boot集成Redis实现缓存机制
（1）新建Java Maven Project;
（2）在pom.xml中添加相应的依赖包；在Maven中添加相应的依赖包,主要有：spring boot 父节点依赖；spring boot web支持；缓存服务springcontext-support；
    添加redis支持；JPA操作数据库；mysql 数据库驱动，具体pom.xml文件如下：
  	<!--
          包含支持UI模版（Velocity，FreeMarker，JasperReports），
          邮件服务，
          脚本服务(JRuby)，
          缓存Cache（EHCache），
          任务计划Scheduling（uartz）。
  	-->
	  <dependency>
	      <groupId>org.springframework</groupId>
	       <artifactId>spring-context-support</artifactId>
	  </dependency>
	  <!-- 添加redis支持-->
	  <dependency>
	      <groupId>org.springframework.boot</groupId>
	       <artifactId>spring-boot-starter-redis</artifactId>
	  </dependency>
（3）编写Spring Boot启动类；
（4）配置application.properties;
（5）编写RedisCacheConfig配置类；
缓存主要有几个要实现的类：其一就是CacheManager缓存管理器； 其二就是具体操作实现类； 其三就是CacheManager工厂类（这个可以使用配置文件配置的进行注入，也可以通过编码的方式进行实现）；
其四就是缓存key生产策略（当然Spring自带生成策略，但是在Redis客户端进行查看的话是系列化的key,对于我们肉眼来说就是感觉是乱码了，这里我们先使用自带的缓存策略）。

（6）编写DemoInfo测试实体类；
（7）编写DemoInfoRepository持久化类；
（8）编写DemoInfoService类；
（9）编写DemoInfoController类；
（10）测试代码是否正常运行了
（11）自定义缓存key;
