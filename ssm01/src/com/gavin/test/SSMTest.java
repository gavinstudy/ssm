package com.gavin.test;

import java.util.List;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.gavin.entity.User;
import com.gavin.service.user.UserService;

public class SSMTest {
	private ApplicationContext applicationContext;
	@Before
	public void init() {
		applicationContext = new ClassPathXmlApplicationContext("mybatis-dao.xml");
	}
	@Test
	public void queryListByUserName() throws Exception {
		UserService us = (UserService)applicationContext.getBean("userService");
		List<User> list = us.queryListByUserName("g");
		for (User user : list) {
			System.out.println(user);
		}
	}
	@Test
	public void queryList() throws Exception {
		UserService us = (UserService)applicationContext.getBean("userService");
		List<User> list = us.queryList();
		for (User user : list) {
			System.out.println(user);
		}
	}
	@Test
	public void insertOneUser() {}
}