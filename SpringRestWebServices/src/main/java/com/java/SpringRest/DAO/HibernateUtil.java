package com.java.SpringRest.DAO;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {
	
	
	SessionFactory sessionFactory;

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	public static void resourceCleanup(Session s, Transaction t) {
		if (t!=null)
			t.commit();
		if (s!=null)
			s.close();
	}
	
	
	
}
