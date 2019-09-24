package org.springframework.demo05.aware;

import org.springframework.beans.factory.BeanClassLoaderAware;
import org.springframework.stereotype.Component;

@Component
public class MyBeanClassLoaderAware implements BeanClassLoaderAware {
	@Override
	public void setBeanClassLoader(ClassLoader classLoader) {
		System.out.println("MyBeanClassLoaderAware >> " + classLoader.getParent());
	}
}
