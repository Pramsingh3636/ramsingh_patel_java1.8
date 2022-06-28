package com.zensar.model;

public class Manager extends Employee
{
	private String zone;

	public Manager(int empid, String name, String designation, String zone) {
		super(empid, name, designation);
		this.zone = zone;
	}

	public Manager(int empid, String name, String designation, String department, String zone) {
		super(empid, name, designation, department);
		this.zone = zone;
	}

	public String getZone() {
		return zone;
	}

	public void setZone(String zone) {
		this.zone = zone;
	}
}
