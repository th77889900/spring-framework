package com.spring.study.aop.dao;

import org.springframework.stereotype.Repository;

/**
 * @author ：tengu
 * @date ：Created in 2020/10/7 4:32 下午
 */
@Repository
public class IndexDao {
	public void query() {
		System.out.println("query");
	}
}
