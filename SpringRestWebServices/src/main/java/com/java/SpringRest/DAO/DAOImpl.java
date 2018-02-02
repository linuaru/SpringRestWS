package com.java.SpringRest.DAO;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.stereotype.Repository;

import com.java.SpringRest.Model.User;

@Repository
public class DAOImpl implements Operations<User>{

	HibernateUtil hibernateUtil;
	public HibernateUtil getHibernateUtil() {
		return hibernateUtil;
	}
	public void setHibernateUtil(HibernateUtil hibernateUtil) {
		this.hibernateUtil = hibernateUtil;
	}

	public boolean add(User t) {
		Session s = hibernateUtil.getSessionFactory().openSession();
		Transaction tr = s.beginTransaction();
		s.save(t);
		tr.commit();
		s.close();
		return true;
	}

	public User get(int primaryKey) {
		Session s = hibernateUtil.getSessionFactory().openSession();
		Transaction tr = s.beginTransaction();
		User u = s.get(User.class, primaryKey);
		tr.commit();
		s.close();
		return u;
	}

	public List<User> getAll() {
		Session s = hibernateUtil.getSessionFactory().openSession();
		Transaction tr = s.beginTransaction();
		List<User> l = s.createQuery("from User").list();
		tr.commit();
		s.close();
		return l;
	}

	public User update(User t) {
		Session s = hibernateUtil.getSessionFactory().openSession();
		Transaction tr = s.beginTransaction();
		s.update(t);
		tr.commit();
		s.close();
		return t;
	}

	public boolean delete(int primaryKey) {
		Session s = hibernateUtil.getSessionFactory().openSession();
		Transaction tr = s.beginTransaction();
		s.delete(get(primaryKey));
		tr.commit();
		s.close();
		return false;
	}
}
