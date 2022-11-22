package com.demo1.extend;

import org.springframework.boot.BootstrapRegistry;
import org.springframework.boot.Bootstrapper;

/**
 * @desc: MyBootstrapper
 * @author: Yuan
 * @create: 2022/11/22
 **/
public class MyBootstrapper implements Bootstrapper {
	@Override
	public void intitialize(BootstrapRegistry registry) {
		System.out.println(registry);
	}
}
