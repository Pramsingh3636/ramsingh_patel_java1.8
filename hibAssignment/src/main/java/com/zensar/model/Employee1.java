package com.zensar.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Table(name="employee")
@Entity
@NamedQuery(name="total",query="select sum(e.salary) from Employee e")
@NamedQuery(name="order",query="select e from Employee e order by e.salary")
@NamedQuery(name="group",query="select e.city, count(e.name) from Employee e group by e.city")
@NamedQuery(name="average",query="select avg(e.salary) from Employee e")
@NamedQuery(name="moreThan",query="select e from Employee e where e.salary>20000")

public class Employee1 
{
	@Id
	int empid;
	String name;
	String city;
	int salary;
	public Employee1(int empid, String name, String city, int salary) {
		super();
		this.empid = empid;
		this.name = name;
		this.city = city;
		this.salary = salary;
	}
	public Employee1() {
		super();
	}
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee1 [empid=" + empid + ", name=" + name + ", city=" + city + ", salary=" + salary + "]";
	}
}