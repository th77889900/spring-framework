package com.spring.study.simulate.spring;

import com.spring.study.simulate.spring.dao.UserDao;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author ：tengu
 * @date ：Created in 2020/10/8 2:12 下午
 */
public class SpringTest {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath:spring.xml");

		UserDao userDao = context.getBean(UserDao.class);

		userDao.query();
	}
}
