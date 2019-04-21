package com.Repairment.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.PathVariable;
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
        return "Welcome to RestAPI for Repairment";
    }
	// Get All DichVuCungCap
    @GetMapping("/api/dvcc")
	@RequestMapping(value="/api/dvcc", method=RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public  List<DichVuCungCap> getDichVu() {
        List<DichVuCungCap> list = dichvuDAO.getAllDichVu();
        return list;
	}
    // Get One DichVuCungCap
    @GetMapping("/api/dvcc/{id}")
	@RequestMapping(value="/api/dvcc/{id}", method=RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public  DichVuCungCap getDichVuNo(@PathVariable int id) {
        DichVuCungCap dv = dichvuDAO.getDichVuNo(String.valueOf(id));
        return dv;
	}
    // Add DichVuCungCap
    @PostMapping("/api/adddvcc")
	@RequestMapping(value="/api/adddvcc", method=RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public  DichVuCungCap addDichVu(@RequestBody DichVuCungCap dvcc) {
        DichVuCungCap dv = dichvuDAO.addDichVu(dvcc);
        return dv;
	}
    // Update DichVuCungCap
    @PutMapping("/api/updatedvcc")
	@RequestMapping(value="/api/updateDVCC", method=RequestMethod.PUT, produces = MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public  DichVuCungCap updateDichVu(@RequestBody DichVuCungCap dvcc) {
        DichVuCungCap dv = dichvuDAO.updateDichVu(dvcc);
        return dv;
	}
    // delete DichVuCungCap
    @DeleteMapping("/api/deleteDVCC/{id}")
	@RequestMapping(value="/api/deleteDVCC/{id}", method=RequestMethod.DELETE, produces = MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public  void deleteDichVu(@PathVariable int dichvuNo) {
        dichvuDAO.deleteDichVu(String.valueOf(dichvuNo));
	}
}
