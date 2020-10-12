package com.spring.study.aop;

import com.spring.study.aop.dao.IndexDao;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author ：tengu
 * @date ：Created in 2020/10/7 4:34 下午
 */
public class Test {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

		IndexDao indexDao = context.getBean(IndexDao.class);

		indexDao.query();
	}
}
