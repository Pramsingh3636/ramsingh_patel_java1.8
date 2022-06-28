package com.zensar.model;

import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;

@Entity
@PrimaryKeyJoinColumn(name="empid")
public class PartTimeEmp3 extends Employee3
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
