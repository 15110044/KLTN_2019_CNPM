package com.website.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.website.model.Customer;
import com.website.service.CustomerService;

@Controller
public class CustomerController {

	@Autowired
	CustomerService customerservice;
	
	
	@RequestMapping(value="/getAllCustomer",method=RequestMethod.GET,headers="Accept=application/json")
	public String getCustomers(Model model){
		List lop =customerservice.getAllCategories();
		model.addAttribute("lop", lop);
		return "allCustomer";
	}

	@RequestMapping(value="/newCustomer", method= RequestMethod.GET, headers="Accept=application/json")
	public String viewAddCustomer(Model model){
		Customer customer = new Customer();
		model.addAttribute("customer", customer);
		return "addCustomer";
	}
	@RequestMapping(value="/addCustomer", method= RequestMethod.POST, headers="Accept=application/json")
	public String addCustomer(@ModelAttribute("customer") Customer customer){
		customerservice.addCusto(customer);;
		return "redirect:/getAllCustomer";
	}
}
