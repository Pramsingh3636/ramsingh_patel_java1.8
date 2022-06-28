package com.zensar.model;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Department 
{
	@Id
	private int depid;

	private String name;

	//	@JoinColumnn(Foreign key) no no
	//in child(referred class) what is name of data member?

	@OneToMany(mappedBy = "department")
	private List<Employee> employees = new ArrayList<>();

	public Department(int depid, String name) {
		super();
		this.depid = depid;
		this.name = name;
	}

	public Department() {
		super();
	}

	public int getDepid() {
		return depid;
	}

	public void setDepid(int depid) {
		this.depid = depid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Department [depid=" + depid + ", name=" + name + "]";
	} 

}
