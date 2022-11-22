package com.demo1.extend;

import org.springframework.boot.BootstrapRegistry;
import org.springframework.boot.BootstrapRegistryInitializer;

/**
 * @desc: MyBootstrapRegistryInitializer
 * @author: Yuan
 * @create: 2022/11/22
 **/
public class MyBootstrapRegistryInitializer implements BootstrapRegistryInitializer {
	@Override
	public void initialize(BootstrapRegistry registry) {
		System.out.println(registry);
	}
}
