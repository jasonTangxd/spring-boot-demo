package com.cs;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.web.SpringBootServletInitializer;
import org.springframework.boot.web.servlet.ServletComponentScan;

@SpringBootApplication
@ServletComponentScan//这个就是扫描相应的Servlet包;
public class AppServlet2 extends SpringBootServletInitializer{
	
	public static void main(String[] args) {
		SpringApplication.run(AppServlet2.class, args);
	}
}
