package com.zensar.model;

public class Car extends Vehicle
{
	String cmodel;

	public Car() {
		super();
	}

	public Car(String cmodel)
	{
		this.cmodel=cmodel;
	}
	
	public String getCmodel() {
		return cmodel;
	}

	public void setCmodel(String cmodel) {
		this.cmodel = cmodel;
	}	
}