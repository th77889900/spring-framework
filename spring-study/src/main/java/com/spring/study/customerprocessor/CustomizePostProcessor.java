package com.spring.study.customerprocessor;

import com.spring.study.service.CustomizeService;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.GenericBeanDefinition;
import org.springframework.stereotype.Component;

/**
 * @author ：tengu
 * @date ：Created in 2020/9/24 6:13 下午
 */
@Component
public class CustomizePostProcessor implements BeanFactoryPostProcessor {
	@Override
	public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
		GenericBeanDefinition serviceA =
				(GenericBeanDefinition) beanFactory.getBeanDefinition("serviceA");
		serviceA.setBeanClass(CustomizeService.class);
	}
}
