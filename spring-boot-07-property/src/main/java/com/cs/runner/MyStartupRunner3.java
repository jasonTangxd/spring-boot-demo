package com.cs.runner;

import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.util.Arrays;

/**
 * 服务启动执行
 *
 * Order 注解（或者实现Order接口）来规定所有CommandLineRunner实例的运行顺序
 */
@Component
@Order(value=3)
public class MyStartupRunner3 implements CommandLineRunner{

	@Override
	public void run(String... args) throws Exception {
		System.out.println(Arrays.asList(args));
		System.out.println(">>>>>>>>>>>>>>>服务启动执行，执行加载数据等操作33333333<<<<<<<<<<<<<");
	}
}
