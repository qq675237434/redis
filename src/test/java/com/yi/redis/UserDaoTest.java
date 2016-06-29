package com.yi.redis;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.yi.redis.dao.impl.UserDaoImpl;
import com.yi.redis.domian.User;

public class UserDaoTest {

	public static void main(String[] args) {
		 ApplicationContext ac =  new ClassPathXmlApplicationContext("classpath:/applicationContext.xml");
	        UserDaoImpl userDAO = (UserDaoImpl)ac.getBean("userDAO");
	        User user1 = new User();
	        user1.setId(1L);
	        user1.setName("obama");
	        userDAO.save(user1);
	        User user2 = userDAO.get(1L);
	        System.out.println(user2.getName());
	}
}
