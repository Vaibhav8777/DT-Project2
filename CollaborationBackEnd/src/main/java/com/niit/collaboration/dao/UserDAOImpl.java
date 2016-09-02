package com.niit.collaboration.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.niit.collaboration.model.User;


@Repository("userDAO")
public class UserDAOImpl implements UserDAO {
	
	@Autowired
	private SessionFactory sessionFactory;


	public UserDAOImpl(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@Transactional
	public List<User> list() {
		@SuppressWarnings("unchecked")
		List<User> list = (List<User>) sessionFactory.getCurrentSession()
				.createCriteria(User.class)
				.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY).list();

		return list;
	}

	@Transactional
	public void saveOrUpdate(User user) {
		sessionFactory.getCurrentSession().saveOrUpdate(user);
	}
	
	@Transactional
	public User getUserById(String id) {
		String hql = "from User where id=" + id;
		Query query = sessionFactory.getCurrentSession().createQuery(hql);
		
		@SuppressWarnings("unchecked")
		List<User> list = (List<User>) query.list();
		
		if (list != null && !list.isEmpty()) {
			return list.get(0);
		}
		
		return null;
	}
	
	@Transactional
	public User getUserByUsername(String username) {
		Session session = sessionFactory.getCurrentSession();
		@SuppressWarnings("unchecked")
		List<User> users = session.createQuery("from User u where u.username='" + username + "'").list();
		User user=users.get(0);
		
			System.out.println("user Details retrieved successfully, User Details::" + user);
		

		return user;
	}

	@Transactional
	public void delete(String id) {
		User user = new User();
		user.setId(id);
		sessionFactory.getCurrentSession().delete(user);
	}
	
}
