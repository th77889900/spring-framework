package com.spring.study.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author ：tengu
 * @date ：Created in 2020/9/23 1:38 下午
 */
@Component
public class ServiceB {

	@Autowired
    ServiceA serviceA;

	public void get() {
		System.out.println("get");
	}

	public void move() {
		serviceA.add();
	}

}
