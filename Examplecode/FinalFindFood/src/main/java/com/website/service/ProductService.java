package com.website.service;

import java.util.List;


import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.website.dao.ProductDAO;
import com.website.model.Product;

@Service("productService")
public class ProductService {
	
	@Autowired
	ProductDAO prodao;
	
	@Transactional
	public List getAllProduct(){
		return prodao.getAll();
		
	}
	@Transactional
	public Product getProductById(int id){
		return prodao.getByID(id);
	}
	
	@Transactional
	public void addProduct(Product pro){
		prodao.add(pro);
	}
	
	@Transactional
	public Product updateProduct(Product pro){
		return prodao.update(pro);
	}
	
	@Transactional
	public void deleteProduct(int id){
		prodao.delete(id);
	}
	@Transactional
	public List<Product> getProductByCookID(int id){
		return prodao.getByCookID(id);
	}
	@Transactional
	public void addCart(Product pro){
		prodao.add(pro);
	}
	@Transactional
	public List getListProductByID(List<Integer> ids){
		return prodao.getListByID(ids);

	}
}
