package com.zensar.model;

//import java.util.Collection;
//import java.util.Iterator;
import java.util.List;
//import java.util.ListIterator;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Student
{
	@Id
	private int sid;
	private String sname;
	private  String email;
	private String phone;
	private String branch;
	public Student(int sid, String sname, String email, String phone, String branch)
	{
		super();
		this.sid = sid;
		this.sname = sname;
		this.email = email;
		this.phone = phone;
		this.branch = branch;
	}
	public Student()
	{
		super();
	}
	public int getSid()
	{
		return sid;
	}
	public void setSid(int sid)
	{
		this.sid = sid;
	}
	public String getSname()
	{
		return sname;
	}
	public void setSname(String sname)
	{
		this.sname = sname;
	}
	public String getEmail()
	{
		return email;
	}
	public void setEmail(String email)
	{
		this.email = email;
	}
	public String getPhone()
	{
		return phone;
	}
	public void setPhone(String phone)
	{
		this.phone = phone;
	}
	public String getBranch()
	{
		return branch;
	}
	public void setBranch(String branch)
	{
		this.branch = branch;
	}
	@Override
	public String toString()
	{
		return "Student [sid=" + sid + ", sname=" + sname + ", email=" + email + ", phone=" + phone + ", branch=" + branch
				+ "]";
	}
	public void remove(Student student) {
		// TODO Auto-generated method stub
		
	}
	public Student getStudent(int addedid) {
		// TODO Auto-generated method stub
		return null;
	}
	public Student addStudent(Student student) {
		// TODO Auto-generated method stub
		return null;
	}
	public void updateStudent(Student student) {
		// TODO Auto-generated method stub
		
	}
	public List<Student> finAll() {
		// TODO Auto-generated method stub
		return null;
	}
}