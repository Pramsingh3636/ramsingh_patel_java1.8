package com.zensar.model;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="student")
public class Student2 
{
	@Id
	int sid;
	String name;
	String email;
	String branch;
	
	@ManyToMany
	List<Course> course=new ArrayList<>();

	public Student2(int sid, String name, String email, String branch, List<Course> course) {
		super();
		this.sid = sid;
		this.name = name;
		this.email = email;
		this.branch = branch;
		this.course = course;
	}

	public Student2() {
		super();
	}

	public int getSid() {
		return sid;
	}

	public void setSid(int sid) {
		this.sid = sid;
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

	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}

	public List<Course> getCourse() {
		return course;
	}

	public void setCourse(List<Course> course) {
		this.course = course;
	}

	@Override
	public String toString() {
		return "Student2 [sid=" + sid + ", name=" + name + ", email=" + email + ", branch=" + branch + ", course="
				+ course + "]";
	}
	
}