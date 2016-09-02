package com.niit.collaboration.testcase;

import static org.junit.Assert.*;


import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.niit.collaboration.dao.UserDAOImpl;
import com.niit.collaboration.model.User;

public class UserTestCase {
	
	
	@Autowired
	private UserDAOImpl userDAO;
	
	@Autowired
	private User user;
	


//	@Test
//	public void userTestCase() 
//	{
//		user=userDAO.get("niit");
//		boolean operation=userDAO.saveOrUpdate(user);
//		assertEquals("user save test case",operation,true);
//		assertEquals("user name test case",user.getName(),"niit");
//	}

}
