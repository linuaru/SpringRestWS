package com.java.SpringRest.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.java.SpringRest.DAO.DAOImpl;
import com.java.SpringRest.Model.User;

@Service
public class ServiceImpl implements Operations<User> {
	
	DAOImpl daoImpl;
	public DAOImpl getDaoImpl() {
		return daoImpl;
	}
	public void setDaoImpl(DAOImpl daoImpl) {
		this.daoImpl = daoImpl;
	}
	

	public boolean add(User t) {
		return daoImpl.add(t);
	}

	public User get(int primaryKey) {
		return daoImpl.get(primaryKey);
	}

	public List<User> getAll() {
		return daoImpl.getAll();
	}

	public User update(User t) {
		return daoImpl.update(t);
	}

	public boolean delete(int primaryKey) {
		return daoImpl.delete(primaryKey);
	}
	
	

}
