package com.sample.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sample.entity.Employee;
import com.sample.service.EmployeeService;

@RestController
@RequestMapping("/pnc/employees")
public class EmployeeController {
	
	@Autowired
	private EmployeeService service;

	@GetMapping("/details")
	public ResponseEntity<List<Employee>> getAll(){
		return ResponseEntity.ok(service.getSortedEmployees());
	}
	
	@PostMapping("/create")
	public ResponseEntity<String> create(@RequestBody Employee employee){
		service.saveEmployee(employee);
		return ResponseEntity.status(201).body("Saved");
	}
	
	

}
