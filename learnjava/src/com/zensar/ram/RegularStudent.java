package com.zensar.ram;

public class RegularStudent extends Student{
	
	String timeTable;
	String college;
	public RegularStudent (String name, String branch, String timeTable, String college)
	{
		super(name, branch);
		
		this.timeTable = timeTable;
		this.college = college;
	}
	public String getTimeTable()
	{
		return timeTable;
	}
	public String getCollege() {
		return college;
	}
	public void setCollege(String college) {
		this.college = college;
	}
	public void setTimeTable(String timeTable) {
		this.timeTable = timeTable;
	}
	public void introduction()
	{
		System.out.println("This is introduction of REGULAR Student");
	}
}