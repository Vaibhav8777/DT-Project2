package com.niit.collaboration.test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.collaboration.dao.UserDAO;
import com.niit.collaboration.model.User;

public class Test {
	
	
//	static AnnotationConfigApplicationContext context;
//	public Test()
//	{
//		context = new AnnotationConfigApplicationContext();
//		context.scan("com.niit.collaboration");
//		context.refresh();
//	}
	
//	public static void createUser(User user)
//	{
//		
//		UserDAO  userDAO =  (UserDAO) context.getBean("userDAO");
//		userDAO.saveOrUpdate(user);
//		
//		
//	}

	public static void main(String[] args) {
		
AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		
		context.scan("com.niit.collaboration");
		context.refresh();
		
		User user = (User)context.getBean("user");
		
		
		user.setId("001");
		user.setName("vk");
//		user.setPassword("vk@123");
//		user.setRole("admin");
//		user.setStatus('N');
		
		
		UserDAO userDAO = (UserDAO)context.getBean("userDAO");
	    userDAO.saveOrUpdate(user);

	}

}
