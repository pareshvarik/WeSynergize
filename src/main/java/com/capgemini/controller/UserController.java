package com.capgemini.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.beans.Employee_data;
import com.capgemini.services.Services;


@RestController
@RequestMapping("/user")
@CrossOrigin(origins="*",allowedHeaders="*")
public class UserController {
	@Autowired
	Services service;
	
	@PostMapping(path = "/login", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public Employee_data loginService(@RequestBody Employee_data  user,HttpServletRequest request) {
		System.out.println(user.getEmployee_id()+" "+user.getPassword());
		Employee_data  employee_data = service.loginService(user.getEmployee_id(), user.getPassword());
		if (employee_data != null) {
			return employee_data;
		} else {
			return null;
		}
	}
	
	@GetMapping(path = "/allemployee", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Employee_data> getAllEmployeeDetails() {
		return service.getAllEmployeeDetails();

	}

}
