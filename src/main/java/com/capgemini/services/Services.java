package com.capgemini.services;

import java.util.List;

import com.capgemini.beans.Employee_data;

public interface Services {
	public Employee_data loginService(Integer userid, String password);
	public List<Employee_data> getAllEmployeeDetails();
}
