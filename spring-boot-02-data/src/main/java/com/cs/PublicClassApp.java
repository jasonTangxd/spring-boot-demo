	package com.cs;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//@RestController
@SpringBootApplication
public class PublicClassApp {

/*	@RequestMapping("/")
	public String hello() {
		return "Hello world!";
	}*/
	
	public static void main(String[] args) {
		SpringApplication.run(PublicClassApp.class, args);
	}
}
