package com.spring.study.service;

import org.springframework.beans.factory.FactoryBean;
import org.springframework.stereotype.Component;

/**
 * @author ：tengu
 * @date ：Created in 2020/9/24 6:18 下午
 */
@Component("customizeFactoryBean")
public class CustomizeFactoryBean implements FactoryBean<ServiceA> {

	public void doSomething() {
		System.out.println("I am customer service ......");
	}

	public void add() {
		System.out.println("customizeFactoryBean  add");
	}


	@Override
	public ServiceA getObject() throws Exception {
		return new ServiceA();
	}

	@Override
	public Class<?> getObjectType() {
		return null;
	}

	@Override
	public boolean isSingleton() {
		return false;
	}
}

