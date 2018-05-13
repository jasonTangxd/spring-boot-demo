package com.cs;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
//可以使用：basePackageClasses={},basePackages={}
@ComponentScan(basePackages={"cn.kfit","org.kfit"})
public class PublicClassApp {
	
	public static void main(String[] args) {
		SpringApplication.run(PublicClassApp.class, args);
	}
}
