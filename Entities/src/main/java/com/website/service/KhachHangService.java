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
//	public void khachhangPost(KhachHang khachhang){
//		khachhangdao.post(khachhang);
//	}
//	@Transactional
//	public KhachHang getKhachHang(int id){
//		return khachhangdao.getKhachHang(id);
//	}
//	
//	@Transactional
//	public void updateKhachHang(KhachHang khachhang){
//		khachhangdao.updateKhachHang(khachhang);
//	}
//	@Transactional
//	public int isCookValid(String username,byte[] password){
//		return cookdao.isValid(username,password);
//	}

}
