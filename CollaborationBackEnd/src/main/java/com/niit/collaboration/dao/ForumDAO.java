package com.niit.collaboration.dao;

import java.util.List;

import com.niit.collaboration.model.Forum;

public interface ForumDAO {

	
	public List<Forum> list();
	public void saveOrUpdate(Forum forum);

}
