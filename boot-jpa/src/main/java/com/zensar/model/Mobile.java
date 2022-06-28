package com.zensar.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Mobile 
{
	@Id
	int mobid;
	
	String company;
	String speed;
	int memory;
	double screenSize;
	public Mobile(int mobid, String company, String speed, int memory, double screenSize) {
		super();
		this.mobid = mobid;
		this.company = company;
		this.speed = speed;
		this.memory = memory;
		this.screenSize = screenSize;
	}
	public Mobile() {
		super();
	}
	public int getMobid() {
		return mobid;
	}
	public void setMobid(int mobid) {
		this.mobid = mobid;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public String getSpeed() {
		return speed;
	}
	public void setSpeed(String speed) {
		this.speed = speed;
	}
	public int getMemory() {
		return memory;
	}
	public void setMemory(int memory) {
		this.memory = memory;
	}
	public double getScreenSize() {
		return screenSize;
	}
	public void setScreenSize(double screenSize) {
		this.screenSize = screenSize;
	}
	@Override
	public String toString() {
		return "Mobile [mobid=" + mobid + ", company=" + company + ", speed=" + speed + ", memory=" + memory
				+ ", screenSize=" + screenSize + "]";
	}

}
