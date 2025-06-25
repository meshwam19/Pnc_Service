package com.sample.service;

import java.util.List;

import com.sample.entity.Employee;

public interface EmployeeService {


	public List<Employee> getSortedEmployees();
	
	public void saveEmployee(Employee employee);
}
