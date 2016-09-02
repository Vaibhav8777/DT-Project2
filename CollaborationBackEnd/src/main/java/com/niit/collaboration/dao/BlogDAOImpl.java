package com.niit.collaboration.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.niit.collaboration.model.Blog;


@Repository("blogDAO")
public class BlogDAOImpl implements BlogDAO{
	
	@Autowired
	private SessionFactory sessionFactory;


	public BlogDAOImpl(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@Transactional
	public List<Blog> list() {
		@SuppressWarnings("unchecked")
		
		List<Blog> listBlog = (List<Blog>) 
		          sessionFactory.getCurrentSession()
				.createCriteria(Blog.class)
				.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY).list();

		return listBlog;
	}
	
	@Transactional
	public void saveOrUpdate(Blog blog) {
		sessionFactory.getCurrentSession().saveOrUpdate(blog);
	}

}
