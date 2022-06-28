package com.zensar.model;

public class Vehicle 
{
	int vid;
	String vname;
	String type;
	
	public Vehicle() {
		super();
	}

	public Vehicle(int vid, String vname, String type) {
		super();
		this.vid = vid;
		this.vname = vname;
		this.type = type;
	}

	public int getVid() {
		return vid;
	}

	public void setVid(int vid) {
		this.vid = vid;
	}

	public String getVname() {
		return vname;
	}

	public void setVname(String vname) {
		this.vname = vname;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return "Vehicle [vid=" + vid + ", vname=" + vname + ", type=" + type + "]";
	}
}
