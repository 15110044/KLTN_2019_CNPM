package com.website.dao;

import java.sql.*;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.transform.Transformers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;
import com.website.model.YeuCau;

@Repository
public class YeuCauDAO {
	@Autowired
	private SessionFactory sessionfactory;

	public void setSessionfactory(SessionFactory sessionfactory) {
		this.sessionfactory = sessionfactory;
	}

	public List<YeuCau> getAll() {
		Session session = this.sessionfactory.getCurrentSession();
		List<YeuCau> ycList = session.createQuery("select maYeuCau,tinhTrang,ngayYeuCau,ghiChu,diaChi,dichvucungcap.maDVCC, khachhang.maKH from YeuCau",YeuCau.class).getResultList();
	//List<YeuCau> ycList = session.createQuery("select a from YeuCau a",YeuCau.class).getResultList();
//		
//		
//		 Gson gson = new Gson();
//		 String YeuCautojson = gson.toJson(productEntities);
//		ResultSet rs = null;
//	      
//		try
//	    {
//	      // create our mysql database connection
//	      String myDriver = "org.gjt.mm.mysql.Driver";
//	      String myUrl = "jdbc:mysql://localhost/repairment";
//	      Class.forName(myDriver);
//	      Connection conn = DriverManager.getConnection(myUrl, "root", "1234");
//	      
//	      // our SQL SELECT query. 
//	      // if you only need a few columns, specify them by name instead of using "*"
//	      String query = "SELECT * FROM yeucau";
//
//	      // create the java statement
//	      Statement st = conn.createStatement();
//	      
//	      // execute the query, and get a java resultset
//	      rs = st.executeQuery(query);
//	      
//	      st.close();
//	    }
//	    catch (Exception e)
//		{
//	      System.err.println(e.getMessage());
//	    }
		
		
		
		return ycList;
	}

	public YeuCau getByID(int id) {
		Session session = this.sessionfactory.getCurrentSession();
		YeuCau YeuCau = (YeuCau) session.get(YeuCau.class, new Integer(id));
		return YeuCau;
	}

	public YeuCau post(YeuCau yc) {
		Session session = this.sessionfactory.getCurrentSession();
		session.persist(yc);
		return yc;
	}

	public YeuCau update(YeuCau yc) {
		Session session = this.sessionfactory.getCurrentSession();
		session.update(yc);
		return yc;
	}

	public void delete(int id) {
		Session session = this.sessionfactory.getCurrentSession();
		YeuCau YeuCau = (YeuCau) session.load(YeuCau.class, new Integer(id));
		if (YeuCau != null) {
			session.delete(YeuCau);
		}
	}

	public List<YeuCau> getByCookID(int id) {
		Session session = this.sessionfactory.getCurrentSession();
		List<YeuCau> YeuCau = (List<YeuCau>) session.get(YeuCau.class, new Integer(id));
		return YeuCau;
	}

	public List getListByID(List<Integer> ids) {
		Session session = this.sessionfactory.getCurrentSession();
		String sql = "from YeuCau where id in :ids";
		Query query = session.createQuery(sql);
		query.setParameterList("ids", ids);
		List<YeuCau> ycList = query.list();
		return ycList;
	}
}