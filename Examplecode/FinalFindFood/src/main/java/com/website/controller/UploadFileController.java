package com.website.controller;

import java.io.IOException;


import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.Base64Utils;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.commons.CommonsMultipartFile;
import org.springframework.web.multipart.support.DefaultMultipartHttpServletRequest;
import org.springframework.web.multipart.support.StandardMultipartHttpServletRequest;

import com.website.model.UploadFile;
import com.website.service.UploadFileService;

@Controller
public class UploadFileController {
	//private static String UPLOADED_FOLDER = "C://img//";
	
	@Autowired
	UploadFileService uploadfileservice;

	@RequestMapping(value = "/upload", method = RequestMethod.GET, headers = "Accept=application/json")
	public String showUploadForm(Model model) {
		 UploadFile uploadFile = new UploadFile();
		 model.addAttribute("uploadfile", uploadFile);
		return "uploadFile";
	}

	@RequestMapping(value = "/uploadStatus", method = RequestMethod.GET, headers = "Accept=application/json")
	public String showUploadStatus(Model model) {
		List<UploadFile> lof = uploadfileservice.getAllFile();
		model.addAttribute("lof", lof);
		return "Success";
	}

	@RequestMapping(value = "/doUpload", method = RequestMethod.POST)
	public String handleFileUpload(@RequestParam("fileUpload") CommonsMultipartFile[] afile,Model model) {
		for (CommonsMultipartFile file : afile) {
			try {
				byte[] filedata = file.getBytes();
				System.out.println("Data: " + filedata);
				
				UploadFile uploadfile = new UploadFile();
				uploadfile.setFilename(file.getOriginalFilename());
				uploadfile.setData(file.getBytes());
				
				//encode filedata to 64 bit data
				byte[] encode64bit = Base64Utils.encode(file.getBytes());
				String base64Encoded = new String(encode64bit, "UTF-8");
				uploadfile.setBase64Data(base64Encoded);
				System.out.println("Data64: " + base64Encoded);
				
				uploadfileservice.saveFile(uploadfile);
				
//				byte[] filedata = file.getBytes();
//				System.out.println("Data: " + filedata);
//				Path path = Paths.get(UPLOADED_FOLDER + file.getOriginalFilename());
//				Files.write(path, filedata);

				model.addAttribute("message", "You have upload successfully " + file.getOriginalFilename() + "'");

			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		return "redirect:/uploadStatus";
	}

}
