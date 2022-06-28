package com.zensar.ram;

public class PartTimeStudent extends Student{
	
	String university;
	public PartTimeStudent(String name, String branch, String university)
	{
		super(name, branch);
		this.university = university;	
	}
	public String getUniversity()
	{
		return university;
	}
	public void setUniversity(String university) {
		this.university = university;
	}
}
