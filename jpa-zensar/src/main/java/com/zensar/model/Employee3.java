package com.zensar.model;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public class Employee3  
{
	@Id
	int empid;
	String name;

	public Employee3()
	{
		super();
	}

	public int getEmpid()
	{
		return empid;
	}

	public void setEmpid(int empid)
	{
		this.empid = empid;
	}

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	@Override
	public String toString()
	{
		return "Employee [empid=" + empid + ", name=" + name + "]";
	}


}