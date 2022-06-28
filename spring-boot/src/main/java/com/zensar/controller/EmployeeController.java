package com.zensar.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.zensar.model.Employee;
import com.zensar.service.EmployeeService;

@Controller
public class EmployeeController 
{
	private EmployeeService employeeService;
	
	public EmployeeController(EmployeeService employeeService)
	{
		super();
		this.employeeService = employeeService;
	}

	@GetMapping("/employee/{empid}")
	public Employee getEmployee(@PathVariable("empid") int empid)
	{
		Employee employee = employeeService.getEmployee(empid);
		return employee;
	}
	@PostMapping("/employee")
	public Employee addEmployee(@RequestBody Employee employee)
	{
		Employee addEmployee = employeeService.addEmployee(employee);
		System.out.println(addEmployee);
		return addEmployee;
	}

}
