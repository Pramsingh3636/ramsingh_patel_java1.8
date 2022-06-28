package com.zensar.service;

import org.springframework.stereotype.Component;

import com.zensar.model.Employee;

@Component
public interface EmployeeService 
{
	Employee getEmployee(int empid);
	Employee addEmployee(Employee employee);
	Employee getEmployee();

}
