package com.zensar.file;

import java.io.Serializable;

public class Employee implements Serializable
{

	private int empid;
	private String name;
	private String email;
	private String address;

	public Employee(int empid, String name, String email, String address) {
		super();
		this.empid = empid;
		this.name = name;
		this.email = email;
		this.address = address;
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", name=" + name + ", email=" + email + ", address=" + address + "]";
	}
	
	

		

	

}
