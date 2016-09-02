package com.niit.collaboration.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.niit.collaboration.model.Forum;


@Repository("forumDAO")
public class ForumDAOImpl implements ForumDAO{
	
	@Autowired
	private SessionFactory sessionFactory;


	public ForumDAOImpl(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@Transactional
	public List<Forum> list() {
		@SuppressWarnings("unchecked")
		
		List<Forum> listForum = (List<Forum>) 
		          sessionFactory.getCurrentSession()
				.createCriteria(Forum.class)
				.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY).list();

		return listForum;
	}
	
	@Transactional
	public void saveOrUpdate(Forum forum) {
		sessionFactory.getCurrentSession().saveOrUpdate(forum);
	}

}
