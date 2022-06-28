package com.zensar.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table (name="project")
public class Project
{
	@Id
	@Column(name="pid")
	private int pid;
	
	@Column (name= "ptitle")
	String title;
	
	@ManyToMany
	@JoinTable(name="workson", joinColumns =  { @JoinColumn(name="pid") },
	 inverseJoinColumns = { @JoinColumn(name="empid") } )	
	private List<Employee> employees = new ArrayList<>();

	public Project(int pid, String title, List<Employee> employees) {
		super();
		this.pid = pid;
		this.title = title;
		this.employees = employees;
	}

	public Project() {
		super();
	}

	public int getPid() {
		return pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public List<Employee> getEmployees() {
		return employees;
	}

	public void setEmployees(List<Employee> employees) {
		this.employees = employees;
	}

	@Override
	public String toString() {
		return "Project [pid=" + pid + ", title=" + title + ", employees=" + employees + "]";
	}
}
	