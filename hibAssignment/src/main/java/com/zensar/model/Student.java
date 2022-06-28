package com.zensar.model;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="student")

public class Student
{
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
//	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="parkingseq")
//	@GeneratedValue(strategy=GenerationType.TABLE)
//	@GeneratedValue(strategy=GenerationType.IDENTITY)

	private int sid;
	private String name;
	private String email;
	private String phone;
	private String branch;
	public Student(int sid, String name, String email, String phone, String branch) {
		super();
		this.sid = sid;
		this.name = name;
		this.email = email;
		this.phone = phone;
		this.branch = branch;
	}
	public Student() {
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
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	@Override
	public String toString() {
		return "Student [sid=" + sid + ", name=" + name + ", email=" + email + ", phone=" + phone + ", branch=" + branch
				+ "]";
	}	

}
