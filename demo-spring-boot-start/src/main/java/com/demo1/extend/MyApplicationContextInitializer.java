package com.demo1.extend;

import org.springframework.context.ApplicationContextInitializer;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * @desc: MyApplicationContextInitializer
 * @author: Yuan
 * @create: 2022/11/22
 **/
public class MyApplicationContextInitializer implements ApplicationContextInitializer {
	@Override
	public void initialize(ConfigurableApplicationContext applicationContext) {
		System.out.println(applicationContext);
	}
}
