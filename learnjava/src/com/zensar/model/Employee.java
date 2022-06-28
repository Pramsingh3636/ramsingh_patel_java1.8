package com.zensar.model;

public class Employee 
{
	private int empid;
	private String name;
	private String designation;
	private String department;
	
	public Employee(int empid, String name) {
		super();
		this.empid = empid;
		this.name = name;
	}
	public Employee(int empid, String name, String designation) {
		super();
		this.empid = empid;
		this.name = name;
		this.designation = designation;
	}

	public Employee(int empid, String name, String designation, String department) {
		super();
		this.empid = empid;
		this.name = name;
		this.designation = designation;
		this.department = department;
	}
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + "]";
	}

}

