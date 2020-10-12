package com.spring.study.simulate.factory;

import com.spring.study.simulate.factory.bean.DaoBean;
import com.spring.study.simulate.factory.bean.TempDaoBean;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author ：tengu
 * @date ：Created in 2020/10/9 1:45 下午
 */
public class FactoryTest {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(FactoryConfig.class);

		TempDaoBean tempDaoBean = (TempDaoBean) context.getBean("daoFactoryBean");

		tempDaoBean.tempQuery();

		DaoBean daoBean = (DaoBean) context.getBean("&daoFactoryBean");

		daoBean.query();
	}
}
