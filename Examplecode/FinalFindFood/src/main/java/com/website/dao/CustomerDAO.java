package com.website.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.website.model.Customer;;

@Repository
public class CustomerDAO {

	@Autowired
	private SessionFactory sessionfactory;
	
	public void setSessionfactory(SessionFactory sessionfactory) {
		this.sessionfactory = sessionfactory;
	}

	public List getAll() {
		Session session= this.sessionfactory.getCurrentSession();
		List custoList = session.createQuery("from Customer").list();
		return custoList;
	}
	
	public Customer add(Customer custo){
		Session session= this.sessionfactory.getCurrentSession();
		session.persist(custo);
		return custo;
	}
}
