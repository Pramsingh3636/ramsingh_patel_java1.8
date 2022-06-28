package com.zensar.model;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="course")
public class Course 
{
	@Id
	int cid;
	String cname;

	@ManyToMany
	private List<Student> student=new ArrayList<>();

	public List<Student> getStudent() {
		return student;
	}

	public void setStudent(List<Student> student) {
		this.student = student;
	}

	public Course(int cid, String cname) {
		super();
		this.cid = cid;
		this.cname = cname;
	}

	public Course() {
		super();
	}

	public int getCid(int i) {
		return cid;
	}

	public void setCid(int cid) {
		this.cid = cid;
	}

	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}
	

	@Override
	public String toString() {
		return "Course [cid=" + cid + ", cname=" + cname + ", student=" + student + "]";
	}

	public List<Course> getCid() {
		// TODO Auto-generated method stub
		return null;
	}
}
