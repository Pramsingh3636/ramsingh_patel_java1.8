
package com.zensar.model;

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
		return "Student [sid=" + sid + ", name=" + sname + ", email=" + email + ", phone=" + phone + ", branch=" + branch
				+ "]";
	}
	
}