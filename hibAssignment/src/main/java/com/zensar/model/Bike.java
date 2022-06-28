package com.zensar.model;

public class Bike  extends Vehicle
{
	String bmodel;
	
	public Bike() {
		super();
	}

	public Bike(String bmodel) {
		super();
		this.bmodel = bmodel;
	}

	public String getBmodel() {
		return bmodel;
	}

	public void setBmodel(String bmodel) {
		this.bmodel = bmodel;
	}	
}