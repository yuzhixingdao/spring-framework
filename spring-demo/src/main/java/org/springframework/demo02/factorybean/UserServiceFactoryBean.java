package org.springframework.demo02.factorybean;

import org.springframework.beans.factory.FactoryBean;
import org.springframework.stereotype.Component;

@Component("userService")
public class UserServiceFactoryBean implements FactoryBean<UserService> {
	@Override
	public UserService getObject() throws Exception {
		return new UserService();
	}

	@Override
	public Class<?> getObjectType() {
		return UserService.class;
	}

	@Override
	public boolean isSingleton() {
		return true;
	}

	public void test() {
		System.out.println("UserFactoryBean test ... ");
	}
}
