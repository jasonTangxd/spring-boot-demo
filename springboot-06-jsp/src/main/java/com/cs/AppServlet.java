package com.cs;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.embedded.ServletRegistrationBean;
import org.springframework.boot.context.web.SpringBootServletInitializer;
import org.springframework.context.annotation.Bean;

import com.cs.servlet.MyServlet1;

@SpringBootApplication
public class AppServlet extends SpringBootServletInitializer{

	/**
	* 注册Servlet.不需要添加注解：@ServletComponentScan
	* @return
	*/
	@Bean
	public ServletRegistrationBean MyServlet1(){
		return new ServletRegistrationBean(new MyServlet1(),"/myServlet/*");
	}
	
	public static void main(String[] args) {
		SpringApplication.run(AppServlet.class, args);
	}
}
