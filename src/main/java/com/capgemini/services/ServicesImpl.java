package com.capgemini.services;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.beans.Employee_data;
import com.capgemini.dao.DAO;
@Service
public class ServicesImpl implements Services {
	@Autowired
	private DAO d;
	@Override
	public Employee_data loginService(Integer userid, String password) {
		System.out.println(userid);
		System.out.println(password);
		return d.login(userid, password);
	}
	@Override
	public List<Employee_data> getAllEmployeeDetails() {
		return d.getAllEmployeeDetails();
	}
	
}
