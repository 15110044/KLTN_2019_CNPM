package com.website.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.website.dao.KhachHangDAO;
import com.website.model.KhachHang;

@Service("khachhangService")
public class KhachHangService {

	@Autowired
	KhachHangDAO khachhangdao;
	
	@Transactional
	public List<KhachHang> getAllKhachHang(){
		return khachhangdao.getAll();
	}
	
//	@Transactional
//	public void addCook(Cook cook){
//		cookdao.add(cook);
//	}
//	@Transactional
//	public Cook getCook(int id){
//		return cookdao.getCook(id);
//	}
//	
//	@Transactional
//	public void updateCook(Cook cook){
//		cookdao.updateCook(cook);
//	}
//	@Transactional
//	public int isCookValid(String username,byte[] password){
//		return cookdao.isValid(username,password);
//	}

}
