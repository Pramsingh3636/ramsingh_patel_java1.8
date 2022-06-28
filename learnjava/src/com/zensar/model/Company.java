package com.zensar.model;

public class Company 
{
	private String name;
	private Employee[] employees;
	
	public Company()
	{
		name ="zensar";
		employees = new Employee[5];
	}
	public boolean add(Employee emp)
	{
		for(int i = 0; i<employees.length; i++)
		{
			if(employees[i]== null)
			{
				employees[i]=emp;
				return true;
			}
		}
		return false; // no position found
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Employee[] getEmployees() {
		return employees;
	}
	public void setEmployees(Employee[] employees) {
		this.employees = employees;
	}
	
}
