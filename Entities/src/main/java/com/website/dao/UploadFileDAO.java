package com.website.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.website.model.UploadFile;

@Repository
public class UploadFileDAO {
	@Autowired
	SessionFactory sessionFactory;

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	public List<UploadFile> getAll(){
		Session session = this.sessionFactory.getCurrentSession();
		List<UploadFile> fileList = session.createQuery("from UploadFile").list();
		return fileList;
	}
	public void save(UploadFile uploadfile){
		Session session = this.sessionFactory.getCurrentSession();
		session.save(uploadfile);
	}
	
	
	

}
