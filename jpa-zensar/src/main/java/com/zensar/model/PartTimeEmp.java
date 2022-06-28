package com.zensar.model;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("ParttimeEmp")
public class PartTimeEmp extends Employee
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
