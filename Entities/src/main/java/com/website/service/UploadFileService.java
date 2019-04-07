package com.website.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.website.dao.UploadFileDAO;
import com.website.model.UploadFile;

@Service("uploadFileService")
public class UploadFileService {
	@Autowired
	UploadFileDAO uploadfiledao;
	
	@Transactional
	public void saveFile(UploadFile uploadfile){
		 uploadfiledao.save(uploadfile);
	}
	
	@Transactional
	public List<UploadFile> getAllFile(){
		return uploadfiledao.getAll();
	}

}
