package com.website.controller;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.Base64Utils;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.website.model.KhachHang;
import com.website.model.YeuCau;
import com.website.service.KhachHangService;


@Controller
public class KhachHangController {
	@Autowired
	KhachHangService khachhangservice;
//	@Autowired
//	ProductService productservice;

	@RequestMapping(value = "/getAllKhachHang", method = RequestMethod.GET)
	public @ResponseBody List<KhachHang> getAllKhachHang(Model model) {
		List<KhachHang> loc = khachhangservice.getAllKhachHang();
//		model.addAttribute("loc", loc);
		return loc;
	}

	@RequestMapping(value = "/postNew", method = RequestMethod.GET)
	public String viewPostNew(Model model) {
		KhachHang khachhang = new KhachHang();
		model.addAttribute("khachhang", khachhang);
		return "postNew";

	}
//
//	@RequestMapping(value = "/getKhachHang/{id}", method = RequestMethod.GET, headers = "Accept=application/json")
//	public String getKhachHang(@PathVariable int id,Model model) {
//		KhachHang khachhang = khachhangservice.getKhachHang(id);
//		List<YeuCau> dsyc = khachhang.getDsyc();
//		model.addAttribute("khachhang", khachhang);
//		model.addAttribute("lodsyc", dsyc);
//		return "cookDetail";
//	}
//	
//	@RequestMapping(value="/getCookProduct/{id}", method = RequestMethod.GET)
//	public String getCookProduct(@PathVariable int id, Model model){
//		Product product = this.productservice.getProductById(id);
//		model.addAttribute("product", product);
//		model.addAttribute("proID", product.getIdProduct());
//		return "cookProductDetail";
//	}
//
//	@RequestMapping(value = "/addCook", method = RequestMethod.POST)
//	public String addCook(@RequestParam("cookID") int id, @RequestParam("fName") String fname,
//			@RequestParam("lName") String lname, @RequestParam("email") String email,
//			@RequestParam("password") String pass, @RequestParam("phone") int phone,
//			@RequestParam("desc") String description, @RequestParam("avatar") MultipartFile avatar) {
//
//		try {
//			Cook cook;
//			if (id == 0) {
//				cook = buildCook(new Cook(), fname, lname, email, pass, phone, description, avatar.getBytes());
//				cookservice.addCook(cook);
//			} else {
//				cook = buildCook(this.cookservice.getCook(id), fname, lname, email, pass, phone, description,
//						avatar.getBytes());
//				cookservice.updateCook(cook);
//			}
//
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//
//		return "redirect:/getAllCook";
//	}
//
//	private Cook buildCook(Cook cook, String fname, String lname, String email, String pass, int phone,
//			String description, byte[] avatardata) {
//		// TODO Auto-generated method stub
//		try {
//
//			cook.setFname(fname);
//			cook.setLname(lname);
//			cook.setEmail(email);
//
//			// Hash password with SHA algorithm
//			MessageDigest digest = MessageDigest.getInstance("SHA-256");
//			byte[] hash = digest.digest(pass.getBytes(StandardCharsets.UTF_8));
//			cook.setPassword(hash);
//
//			
//			cook.setPhone(phone);
//			cook.setDescription(description);
//
//			if (avatardata != null && avatardata.length > 0) {
//				cook.setAvartaData(avatardata);
//				// encode to 64 bit avatar image
//				byte[] encodeAva = Base64Utils.encode(avatardata);
//				String avatar64 = new String(encodeAva, "UTF-8");
//				cook.setAvatar64bit(avatar64);
//			}
//
//		} catch (NoSuchAlgorithmException | IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		return cook;
//	}
//
//	@RequestMapping(value = "/updateCook/{id}", method = RequestMethod.GET)
//	public String updateCook(@PathVariable int id, Model model) {
//		model.addAttribute("cook", this.cookservice.getCook(id));
//		return "updateCook";
//	}

}

