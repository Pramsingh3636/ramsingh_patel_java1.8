package com.zensar.model;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("RegEmp")
public class RegEmp extends Employee
{
	int salary;

	public int getSalary()
	{
		return salary;
	}

	public void setSalary(int salary)
	{
		this.salary = salary;
	}

	@Override
	public String toString()
	{
		return "RegEmp [salary=" + salary + ", empid=" + empid + ", name=" + name + "]";
	}

}
