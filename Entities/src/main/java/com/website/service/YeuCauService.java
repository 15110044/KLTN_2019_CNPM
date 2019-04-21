package com.website.service;

import java.sql.ResultSet;
import java.util.List;


import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.website.dao.YeuCauDAO;
import com.website.model.YeuCau;

@Service("ycductService")
public class YeuCauService {
	
	@Autowired
	YeuCauDAO ycdao;
	
	@Transactional
	public List<YeuCau> getAllYeuCau(){
		return ycdao.getAll();
		
	}
	@Transactional
	public YeuCau getYeuCauById(int id){
		return ycdao.getByID(id);
	}
	
	@Transactional
	public void postYeuCau(YeuCau yc){
		ycdao.post(yc);
	}
	
//	@Transactional
//	public YeuCau update(YeuCau yc){
//		return ycdao.update(yc);
//	}
	
	@Transactional
	public void deleteYeuCau(int id){
		ycdao.delete(id);
	}
////	@Transactional
////	public List<ycduct> getycductByCookID(int id){
////		return ycdao.getByCookID(id);
////	}
////	@Transactional
////	public void addCart(ycduct yc){
////		ycdao.add(yc);
////	}
////	@Transactional
////	public List getListycductByID(List<Integer> ids){
////		return ycdao.getListByID(ids);
//
//	}
}
