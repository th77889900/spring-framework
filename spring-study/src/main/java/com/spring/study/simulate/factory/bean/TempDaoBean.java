package com.spring.study.simulate.factory.bean;

import org.springframework.stereotype.Component;

/**
 * @author ：tengu
 * @date ：Created in 2020/10/9 1:43 下午
 */
@Component
public class TempDaoBean {

	public void tempQuery() {
		System.out.println("this is temp query");
	}
}
