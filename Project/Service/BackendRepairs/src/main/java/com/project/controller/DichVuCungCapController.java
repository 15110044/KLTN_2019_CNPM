package com.project.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import com.project.dao.DichVuDAO;
import com.project.model.DichVuCungCap;

@RestController
@EnableWebMvc
@Configuration("/applicationContext.xml")
@RequestMapping(value ="/")
public class DichVuCungCapController {
	@Autowired
	private DichVuDAO dichvuDAO;


	@GetMapping(path="/", produces = "application/json")
    @RequestMapping(value = "/", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public String welcome() {
        return "Welcome to RestAPI for Repairment";
    }
	// Get All Dich Vu
	@GetMapping("/dichvucungcap")
	@RequestMapping(value="/dichvucungcap", method=RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public  List<DichVuCungCap> getDichVu() {
        List<DichVuCungCap> list = dichvuDAO.getAllDichVu();
        return list;
	}
}
