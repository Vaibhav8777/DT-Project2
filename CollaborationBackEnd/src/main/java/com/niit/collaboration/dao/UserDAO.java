package com.niit.collaboration.dao;

import java.util.List;

import com.niit.collaboration.model.User;

public interface UserDAO {
	
	public List<User> list();

	public User getUserById(String id);
	public User getUserByUsername(String username);
	public void delete(String id);
	public void saveOrUpdate(User user);

}
