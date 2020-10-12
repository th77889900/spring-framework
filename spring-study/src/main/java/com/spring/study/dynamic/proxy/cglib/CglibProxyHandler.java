package com.spring.study.dynamic.proxy.cglib;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @author ：tengu
 * @date ：Created in 2020/10/8 12:08 上午
 */
public class CglibProxyHandler implements MethodInterceptor {

	private Object target;

	public Object getInstance(Object obj) {
		this.target = obj;
		Enhancer enhancer = new Enhancer();

		enhancer.setSuperclass(this.target.getClass());
		enhancer.setCallback(this);

		return enhancer.create();
	}

	@Override
	public Object intercept(Object obj, Method method, Object[] args, MethodProxy proxy) throws Throwable {

		System.out.println("this is my cglib test before advice");
		Object result = proxy.invoke(target, args);
		System.out.println("this is my after advice ......");
		return result;
	}

}
