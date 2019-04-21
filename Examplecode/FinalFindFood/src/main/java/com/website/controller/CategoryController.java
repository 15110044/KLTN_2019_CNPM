package com.website.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.website.model.Category;
import com.website.service.CategoryService;


@Controller
public class CategoryController {
	@Autowired
	CategoryService categoryservice;
	
	 	
	@RequestMapping(value="/getAllCategory",method=RequestMethod.GET,headers="Accept=application/json")
	public String getCategories(Model model){
		List<Category> categories =categoryservice.getAllCategories();
		model.addAttribute("categories", categories);
		return "allCategory";
	}

	@RequestMapping(value="/newCategory", method= RequestMethod.GET, headers="Accept=application/json")
	public String viewAddCategory(Model model){
		Category category = new Category();
		model.addAttribute("category", category);
		return "addCategory";
	}
	@RequestMapping(value="/addCategory", method= RequestMethod.POST, headers="Accept=application/json")
	public String addCategory(@ModelAttribute("category") Category category){
		categoryservice.addCate(category);
		return "redirect:/getAllCategory";
	}

}
