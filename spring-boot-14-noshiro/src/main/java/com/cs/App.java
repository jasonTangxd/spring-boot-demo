package com.cs;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//@RestController
@SpringBootApplication
public class App {

/*	@RequestMapping("/")
	public String hello() {
		return "Hello world!";
	}*/
	
	public static void main(String[] args) {
		SpringApplication.run(App.class, args);
	}
}
