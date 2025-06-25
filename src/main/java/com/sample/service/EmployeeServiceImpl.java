package com.sample.service;

import java.util.Comparator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sample.entity.Employee;
import com.sample.repository.EmployeeRepository;

@Service
public class EmployeeServiceImpl implements EmployeeService{

	@Autowired
	private EmployeeRepository repository;
	public EmployeeServiceImpl() {
		// TODO Auto-generated constructor stub
	}
	
	public List<Employee> getSortedEmployees(){
		List<Employee> list = repository.findAll();
		list.sort(Comparator.comparing(Employee::getName));
		return list;
	}

	@Override
	public void saveEmployee(Employee employee) {
		repository.save(employee);
		
	}

}
