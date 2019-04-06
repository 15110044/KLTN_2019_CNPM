package com.website.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.website.model.Category;;

@Repository
public class CategoryDAO {

	@Autowired
	private SessionFactory sessionfactory;
	
	public void setSessionfactory(SessionFactory sessionfactory) {
		this.sessionfactory = sessionfactory;
	}

	public List getAll() {
		Session session= this.sessionfactory.getCurrentSession();
		List cateList = session.createQuery("from Category").list();
		return cateList;
	}
	
	public Category add(Category cate){
		Session session= this.sessionfactory.getCurrentSession();
		session.persist(cate);
		return cate;
	}
	
	public Category getByID(int id){
		Session session= this.sessionfactory.getCurrentSession();
		Category category = (Category) session.get(Category.class, new Integer(id));
		return category;
	}
}
