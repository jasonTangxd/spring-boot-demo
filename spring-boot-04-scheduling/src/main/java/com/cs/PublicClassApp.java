	package com.cs;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.context.annotation.Bean;

import com.plugin.spring.SpringUtil;


@ServletComponentScan
@SpringBootApplication
public class PublicClassApp {
	
	/**注册Spring Util
	* 这里为了和上一个冲突，所以方面名为：springUtil2
	* 实际中使用springUtil
	*/
	@Bean
	public  SpringUtil springUtil2(){
		return new SpringUtil();
	}
	
	/**
	* 参数里VM参数设置为：-javaagent:.\lib\springloaded-1.2.4.RELEASE.jar -noverify
	* @param args
	*/
	
	public static void main(String[] args) {
		SpringApplication.run(PublicClassApp.class, args);
/*		PublicClassApp app = new PublicClassApp();
		SpringUtil springUtil = app.springUtil2();
		System.out.println(springUtil.getBean("springUtil"));*/
	}
}
