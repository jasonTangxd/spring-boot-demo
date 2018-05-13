package com.banner;

import java.io.PrintStream;

import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.env.Environment;

@SpringBootApplication
public class PublicClassApp3{

	public static void main(String[] args) {
		
	   SpringApplication app = new SpringApplication(PublicClassApp3.class);  
	   app.setBanner(new Banner() {  
	        @Override  
	        public void printBanner(Environment environment, Class<?> sourceClass, PrintStream out) {  
	        	out.print("\n\n\tSpring Boot Sample App!\n\n".toUpperCase());  
	        }  
	    });  
	    app.run(args); 
		
		//SpringApplication.run(PublicClassApp.class, args);
	}
}
