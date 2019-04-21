package com.website.dao;

import java.sql.ResultSet;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.website.model.KhachHang;


@Repository
public class KhachHangDAO {
	@Autowired
	SessionFactory sessionFactory;

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	
	public List getAll(){
		Session session = this.sessionFactory.getCurrentSession();
		List khachhanglist = session.createQuery("select maKH, tenNguoiDung from KhachHang").list();
		return khachhanglist;
		
		
	}
	
//	public KhachHang post(KhachHang khachhang){
//		Session session = this.sessionFactory.getCurrentSession();
//		session.persist(khachhang);
//		return khachhang;
//	}
//	public KhachHang getKhachHang(int id){
//		Session session = this.sessionFactory.getCurrentSession();
//		KhachHang khachhang = (KhachHang) session.get(KhachHang.class, new Integer(1));
//		return khachhang;
//	}
//	public void updateKhachHang(KhachHang khachhang){
//		Session session = this.sessionFactory.getCurrentSession();
//		session.update(khachhang);
//	}

//	public int isValid(String username,byte[] password){
//		Session session = this.sessionFactory.getCurrentSession();
//		Query query = session.createQuery("from Cook where firstname = :fname and password = :pass");
//		query.setParameter("fname", username);
//		query.setParameter("pass", password);
//		Cook cook = (Cook) query.uniqueResult();
//		if(cook != null){
//			return cook.getIdCook();
//		}
//		return 0;
//	}
}
