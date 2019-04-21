package com.Repairment.Controller;

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

import com.Repairment.Model.DichVuCungCap;
import com.Repairment.DAO.*;

@RestController
@EnableWebMvc
@Configuration("/applicationContext.xml")
@RequestMapping("/")
public class DichVuController {
	@Autowired
	private DichVuDAO dichvuDAO;
    
    @GetMapping("/")
    @RequestMapping(value = "/", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public String welcome() {
        return "Welcome to RestAPI for Repairment 1";
    }
    @GetMapping("/api")
    @RequestMapping(value = "/api", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public String welcome1() {
        return "Welcome to RestAPI for Repairment Second";
    }
	// Get All Notes
    @GetMapping("/api/dichvucungcap")
	@RequestMapping(value="/api/dichvucungcap", method=RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public  List<DichVuCungCap> getDichVu() {
        List<DichVuCungCap> list = dichvuDAO.getAllDichVu();
        return list;
	}
}
