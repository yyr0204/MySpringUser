package myspring.di.mission;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.GenericXmlApplicationContext;

import myspring.di.strategy1.service.UserService;

public class Strategy1Test {
	BeanFactory factory;
	
	@BeforeEach
	void init() {
		factory = new GenericXmlApplicationContext("classpath:Spring-Bean-Configuration.xml");
	}
	
	@Test
	void user() {
		UserService us = factory.getBean("userServiceImpl",UserService.class);
		System.out.println(us.getUserList());
	}
}
