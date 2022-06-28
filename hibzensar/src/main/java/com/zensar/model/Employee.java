package com.zensar.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Employee 
{
	@Id
	int empid;

	String name;
	//	int depid; //this is foreign key : referering to an object of class Department
	//	                    (row in department table)
	@ManyToOne
	@JoinColumn(name ="depid")
	Department department;
	public Employee(int empid, String name, Department department) {
		super();
		this.empid = empid;
		this.name = name;
		this.department = department;
	}
	public Employee() {
		super();
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
	public Department getDepartment() {
		return department;
	}
	public void setDepartment(Department department) {
		this.department = department;
	}
	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", name=" + name + ", department=" + department + "]";
	}
	



}
