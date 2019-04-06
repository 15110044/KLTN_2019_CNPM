package com.website.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.website.model.Product;

@Repository
public class ProductDAO {
	@Autowired
	private SessionFactory sessionfactory;

	public void setSessionfactory(SessionFactory sessionfactory) {
		this.sessionfactory = sessionfactory;
	}

	public List getAll() {
		Session session = this.sessionfactory.getCurrentSession();
		List proList = session.createQuery("from Product").list();
		return proList;
	}

	public Product getByID(int id) {
		Session session = this.sessionfactory.getCurrentSession();
		Product product = (Product) session.get(Product.class, new Integer(id));
		return product;
	}

	public Product add(Product pro) {
		Session session = this.sessionfactory.getCurrentSession();
		session.persist(pro);
		return pro;
	}

	public Product update(Product pro) {
		Session session = this.sessionfactory.getCurrentSession();
		session.update(pro);
		return pro;
	}

	public void delete(int id) {
		Session session = this.sessionfactory.getCurrentSession();
		Product product = (Product) session.load(Product.class, new Integer(id));
		if (product != null) {
			session.delete(product);
		}
	}

	public List<Product> getByCookID(int id) {
		Session session = this.sessionfactory.getCurrentSession();
		List<Product> product = (List<Product>) session.get(Product.class, new Integer(id));
		return product;
	}

	public List getListByID(List<Integer> ids) {
		Session session = this.sessionfactory.getCurrentSession();
		String sql = "from Product where id in :ids";
		Query query = session.createQuery(sql);
		query.setParameterList("ids", ids);
		List<Product> proList = query.list();
		return proList;
	}
}