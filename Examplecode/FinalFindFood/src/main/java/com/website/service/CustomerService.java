package com.website.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.website.dao.CustomerDAO;
import com.website.model.Customer;

@Service("customerService")
public class CustomerService {

	@Autowired
	CustomerDAO custodao;
	
	@Transactional
	public List getAllCategories(){
		return custodao.getAll();
		
	}
	
	@Transactional
	public void addCusto(Customer custo){
		custodao.add(custo);
	}
}
