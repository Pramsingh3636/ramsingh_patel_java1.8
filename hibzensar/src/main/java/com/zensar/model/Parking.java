package com.zensar.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

//this class is managed by hibernate
//@Table (name ="parking") => if table name anmd class name is same, we don't need it

@Entity
public class Parking 
{
	@SequenceGenerator (name = "parkingseq", initialValue = 20, allocationSize =1)
	
	@Id
//	@GeneratedValue (strategy = GenerationType.AUTO) //SELECYT ANY FROM OTHER STRATEGY(SEQUENCE)
//	@GeneratedValue (strategy = GenerationType.SEQUENCE, generator = "parkingseq") //CREATE A TABLE FOR ID ONLY
//	@GeneratedValue (strategy = GenerationType.TABLE) //ONE TABLE FOR ALL ENTITIES
//	@GeneratedValue (strategy = GenerationType.IDENTITY) //AUTO INCREMENT(DATA BASE generate Parking, get that value)
	int parkid;
	
	@Column (name = "floor")
	int floor;
	
	//if value can be null, don't use basic data type, use Wrapper class ==>int empid;
	Integer empid;
	
	String name;

	public Parking(int parkid, int floor, Integer empid, String name) {
		super();
		this.parkid = parkid;
		this.floor = floor;
		this.empid = empid;
		this.name = name;
	}

	public Parking() {
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

	public Integer getEmpid() {
		return empid;
	}

	public void setEmpid(Integer empid) {
		this.empid = empid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Parking [parkid=" + parkid + ", floor=" + floor + ", empid=" + empid + ", name=" + name + "]";
	}
	
	

}






