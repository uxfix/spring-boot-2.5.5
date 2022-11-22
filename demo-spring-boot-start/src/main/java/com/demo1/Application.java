package com.demo1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * @author Yuan
 * @description Application
 * @date 2022/10/14
 */
@SpringBootApplication
public class Application {
	public static void main(String[] args) {
		// SpringApplication.run(Application.class,args);
		// 先创建 SpringApplication 对象
		SpringApplication springApplication = new SpringApplication(Application.class);
		// 然后调用 SpringApplication 对象的 run 方法
		ConfigurableApplicationContext context = springApplication.run(args);
		System.out.println(context);

	}
}
