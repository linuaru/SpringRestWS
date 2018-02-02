package com.java.SpringRest.Controller;


import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import com.java.SpringRest.DAO.Employee;

@RestController
public class UserController {
	
	@RequestMapping(value = "/msg", method = RequestMethod.GET)
	public String getMsg(){
		return "Hello";
	}
	
	@RequestMapping(value = "/emp", method = RequestMethod.GET, produces = "application/json")
	public Employee getEmp(){
		return new Employee(20, 40);
	}
	


}
