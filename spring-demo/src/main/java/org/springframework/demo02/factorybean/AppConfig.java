package org.springframework.demo02.factorybean;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("org.springframework.demo02")
public class AppConfig {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);

		UserServiceFactoryBean userFactoryBean = (UserServiceFactoryBean) applicationContext.getBean("&userService");
		userFactoryBean.test();

		UserService userService = (UserService) applicationContext.getBean("userService");
		userService.test();

		UserDao userDao = (UserDao) applicationContext.getBean("userDao");
		userDao.test();
	}

}
