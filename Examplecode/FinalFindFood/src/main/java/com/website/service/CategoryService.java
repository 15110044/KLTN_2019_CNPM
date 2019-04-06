package com.website.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.website.dao.CategoryDAO;
import com.website.model.Category;

@Service("categoryService")
public class CategoryService {
	@Autowired
	CategoryDAO catedao;
	
	@Transactional
	public List getAllCategories(){
		return catedao.getAll();
		
	}
	
	@Transactional
	public void addCate(Category cate){
		catedao.add(cate);
	}
	
	@Transactional
	public Category getCategoryByID(int id){
		return catedao.getByID(id);
	}

}
