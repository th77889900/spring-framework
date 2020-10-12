package com.spring.study.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author ：tengu
 * @date ：Created in 2020/9/23 1:38 下午
 */
@Component
public class ServiceA {

	@Autowired
    ServiceB serviceB;

	public void add() {
		System.out.println("ServiceA  add");
	}

	public void doGet() {
		serviceB.get();
	}
}
