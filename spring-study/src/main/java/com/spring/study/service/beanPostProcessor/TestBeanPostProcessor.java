package com.spring.study.service.beanPostProcessor;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

/**
 * @author ：tengu
 * @date ：Created in 2020/10/13 4:50 下午
 */
@Component
public class TestBeanPostProcessor implements BeanPostProcessor {

	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		if (beanName.equals("bustomizeService")) {
			System.out.println("i can do something before bean init ");
		}
		return bean;
	}

	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		if (beanName.equals("bustomizeService")) {
			System.out.println("i can do something after bean init ");
		}
		return bean;
	}
}
