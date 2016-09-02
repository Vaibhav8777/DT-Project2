package com.niit.collaboration.testcase;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.collaboration.dao.UserDAO;
import com.niit.collaboration.model.User;

public class UserTest {

	
	public static void main(String[] args) 
	{
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.scan("com.niit.collaboration");
		context.refresh();
		
		UserDAO userDAO=(UserDAO) context.getBean("userDAO");
		User user=(User) context.getBean("user");
		
		user.setId("003");
		user.setName("prashanth");
		user.setPassword("123");
		user.setMail("rahul@gmail.com");
		user.setAddress("delhi");
		user.setRole("alumni");
		user.setStatus('N');
		user.setContact("9999999989");
		
		
		
		userDAO.saveOrUpdate(user);
		
	
		
	}
}
