package com.spring.study.simulate.spring.service;

import com.spring.study.simulate.spring.dao.UserDao;

/**
 * @author ：tengu
 * @date ：Created in 2020/10/8 2:10 下午
 */
public class UserServiceImpl implements UserService {

	private UserDao userDao;

	@Override
	public void find() {
		System.out.println("user service impl");
		userDao.query();
	}

	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}
}
