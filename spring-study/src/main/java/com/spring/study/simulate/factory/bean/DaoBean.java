package com.spring.study.simulate.factory.bean;

import org.springframework.beans.factory.FactoryBean;
import org.springframework.stereotype.Component;

/**
 * @author ：tengu
 * @date ：Created in 2020/10/9 1:41 下午
 */
@Component("daoFactoryBean")
public class DaoBean implements FactoryBean<TempDaoBean> {

	public void query() {
		System.out.println("this is dao bean query ");
	}

	@Override
	public TempDaoBean getObject() throws Exception {
		return new TempDaoBean();
	}

	@Override
	public Class<?> getObjectType() {
		return null;
	}
}
