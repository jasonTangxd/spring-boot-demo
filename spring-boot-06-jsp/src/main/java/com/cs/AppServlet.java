package com.cs;

import com.cs.servlet.MyServlet1;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class AppServlet extends SpringBootServletInitializer {

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
