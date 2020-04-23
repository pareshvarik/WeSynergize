package com.capgemini.dao;



import java.util.List;

import com.capgemini.beans.Employee_data;

public interface DAO {
	public Employee_data login(Integer userid,String password);
	public List<Employee_data> getAllEmployeeDetails();
}
