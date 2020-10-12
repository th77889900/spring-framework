package com.spring.study.dynamic.proxy.jdk;

/**
 * @author ：tengu
 * @date ：Created in 2020/10/7 11:48 下午
 */
public class MyTargetObj implements MyTargetInter {


	@Override
	public void queryThings() {
		System.out.println("query things ......");
	}
}
