package com.zensar.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Parking2 
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) //AUTO INCREMENT
	int parkid;
	
	@Column(name="floor")
	int floor;
	
	@OneToOne
	@JoinColumn(name ="empid")
	Employee employee;

	public Parking2(int parkid, int floor, Employee employee) {
		super();
		this.parkid = parkid;
		this.floor = floor;
		this.employee = employee;
	}

	public Parking2() {
		super();
	}

	public int getParkid() {
		return parkid;
	}

	public void setParkid(int parkid) {
		this.parkid = parkid;
	}

	public int getFloor() {
		return floor;
	}

	public void setFloor(int floor) {
		this.floor = floor;
	}

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	@Override
	public String toString() {
		return "Parking2 [parkid=" + parkid + ", floor=" + floor + ", employee=" + employee + "]";
	}
	
	
	

}
