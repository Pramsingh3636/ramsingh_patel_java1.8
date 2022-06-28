package com.zensar.model;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
@AttributeOverrides({
	@AttributeOverride(name="empid", column =  @Column(name="empid")),
	@AttributeOverride(name="name", column =  @Column(name="name"))
})

public class PartTimeEmp2 extends Employee2
{
	int dailycharges;

	public int getDailycharges()
	{
		return dailycharges;
	}

	public void setDailycharges(int dailycharges)
	{
		this.dailycharges = dailycharges;
	}

	@Override
	public String toString()
	{
		return "ParttimeEmp [dailycharges=" + dailycharges + ", empid=" + empid + ", name=" + name + "]";
	}	
}
