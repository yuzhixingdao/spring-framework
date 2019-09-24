package org.springframework.demo03.beanfactorypostprocessor;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.stereotype.Component;

@Component
public class MyBeanFactoryPostProcessor implements BeanFactoryPostProcessor {
	@Override
	public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
		BeanDefinition bd = beanFactory.getBeanDefinition("userService");
		System.out.println("MyBeanFactoryPostProcessor 01 >> " + bd);

		bd.setBeanClassName(OrderService.class.getName());
		System.out.println("MyBeanFactoryPostProcessor 02 >> " + bd);
	}
}
