package com.spring.study;

import com.spring.study.config.ConfigClass;
import com.spring.study.service.CustomizeFactoryBean;
import com.spring.study.service.CustomizeService;
import com.spring.study.service.ServiceA;
import com.spring.study.service.ServiceB;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author ：tengu
 * @date ：Created in 2020/9/23 1:24 下午
 */
public class Client {

	public static void main(String[] args) {

		System.out.println();

		AnnotationConfigApplicationContext applicationContext =
				new AnnotationConfigApplicationContext(ConfigClass.class);

		CustomizeService customizeService = applicationContext.getBean(CustomizeService.class);

		ServiceB serviceB = applicationContext.getBean(ServiceB.class);

		serviceB.get();

		customizeService.doSomething();


//		customizeService.doSomething();

		// yingg

//		ServiceA serviceA = (ServiceA) applicationContext.getBean("customizeFactoryBean");
//		serviceA.add();
//
//		CustomizeFactoryBean customizeFactoryBean = (CustomizeFactoryBean) applicationContext.getBean("&customizeFactoryBean");
//		customizeFactoryBean.add();

	}
}
