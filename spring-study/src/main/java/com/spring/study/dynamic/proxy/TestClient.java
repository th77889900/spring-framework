package com.spring.study.dynamic.proxy;

import com.spring.study.dynamic.proxy.cglib.CglibProxyHandler;
import com.spring.study.dynamic.proxy.jdk.MyDynamicProxyObj;
import com.spring.study.dynamic.proxy.jdk.MyTargetInter;
import com.spring.study.dynamic.proxy.jdk.MyTargetObj;

import java.lang.reflect.Proxy;

/**
 * @author ：tengu
 * @date ：Created in 2020/10/7 11:57 下午
 */
public class TestClient {
	public static void main(String[] args) {
		MyTargetObj targetObj = new MyTargetObj();

		MyDynamicProxyObj proxyObj = new MyDynamicProxyObj(targetObj);

		MyTargetInter inter = (MyTargetInter) Proxy.newProxyInstance(
				Thread.currentThread().getContextClassLoader(), MyTargetObj.class.getInterfaces(), proxyObj);
		inter.queryThings();

		CglibProxyHandler handler = new CglibProxyHandler();

		MyTargetInter inter1 = (MyTargetInter) handler.getInstance(targetObj);

		inter1.queryThings();

	}
}
