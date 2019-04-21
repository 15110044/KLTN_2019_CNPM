package com.website.controller;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.website.model.Cook;
import com.website.model.Product;
import com.website.service.CookService;

@Controller
public class LogInController {
	@Autowired
	CookService cookService;

	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String login(Model model) {
		Cook cook = new Cook();
		model.addAttribute("cook", cook);
		return "login";
	}

	@RequestMapping(value = "/loginProcess", method = RequestMethod.POST)
	public String loginProcess(@RequestParam("cookName") String username, @RequestParam("cookPass") String password) {
		byte[] hashPass = null;
		try {
			MessageDigest digest = MessageDigest.getInstance("SHA-256");
			hashPass = digest.digest(password.getBytes(StandardCharsets.UTF_8));

		} catch (NoSuchAlgorithmException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		int cookID = cookService.isCookValid(username, hashPass);
		if (cookID != 0) {
			return "redirect:/getProdsByCookId?cookId=" + cookID;
		}
		return "redirect:/login";
	}

	@RequestMapping(value = "/getProdsByCookId", method = RequestMethod.GET)
	public String getProdsByCookId(@RequestParam("cookId") int id, Model model) {
		Cook cook = this.cookService.getCook(id);
		List<Product> products = cook.getProducts();
		model.addAttribute("lopid", products);
		model.addAttribute("cookID", id);
		return "allProductByCookID";
	}

}
