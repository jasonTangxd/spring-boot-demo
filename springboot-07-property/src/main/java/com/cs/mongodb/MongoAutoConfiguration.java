package com.cs.mongodb;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.mongo.MongoProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;

//@Configuration
//@ConditionOnClass表明该@Configuration仅仅在一定条件下才会被加载，这里的条件是Mongo.class位于类路径上
@ConditionalOnClass(Mongo.class)
//@EnableConfigurationProperties将Spring Boot的配置文件（application.properties）中的
//spring.data.mongodb.*属性映射为MongoProperties并注入到MongoAutoConfiguration中。
@EnableConfigurationProperties(MongoProperties.class)
//@ConditionalOnMissingBean说明Spring Boot仅仅在当前上下文中不存在Mongo对象时，才会实例化一个
//Bean。这个逻辑也体现了Spring Boot的另外一个特性——自定义的Bean优先于框架的默认配置，我们如果显式的在
//业务代码中定义了一个Mongo对象，那么Spring Boot就不再创建。

/**
 * 
 * @author Administrator
 *
 */
public class MongoAutoConfiguration {

	@Autowired
	private MongoProperties properties;
}
