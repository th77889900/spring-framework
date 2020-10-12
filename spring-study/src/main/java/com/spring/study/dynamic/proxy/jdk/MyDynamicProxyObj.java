package com.spring.study.dynamic.proxy.jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @author ：tengu
 * @date ：Created in 2020/10/7 11:47 下午
 */
public class MyDynamicProxyObj implements InvocationHandler {

	private Object target;

	public MyDynamicProxyObj(Object target) {
		this.target = target;
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		System.out.println("do something before ");
		Object result = method.invoke(target, args);
		System.out.println("do something after  ");
		return result;
	}

}
