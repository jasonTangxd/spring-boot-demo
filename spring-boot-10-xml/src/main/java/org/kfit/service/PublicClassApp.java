package org.kfit.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//@SpringBootApplication 注解等价于以默认属性使用 @Configuration ，
//@EnableAutoConfiguration 和 @ComponentScan 。

@SpringBootApplication
public class PublicClassApp {


    public static void main(String[] args) {
        SpringApplication.run(PublicClassApp.class, args);
    }
}
