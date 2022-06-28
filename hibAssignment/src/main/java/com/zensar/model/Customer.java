package com.zensar.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="customer")
public class Customer
{

	@Id
	int cid;
	String name;  
	String address;
	public Customer() 
	{
		super();
	}
	public Customer(int cid, String name, String address) {
		super();
		this.cid = cid;
		this.name = name;
		this.address = address;
	}
	protected int getCid() {
		return cid;
	}
	protected void setCid(int cid) {
		this.cid = cid;
	}
	protected String getName() {
		return name;
	}
	protected void setName(String name) {
		this.name = name;
	}
	protected String getAddress() {
		return address;
	}
	protected void setAddress(String address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Customer [cid=" + cid + ", name=" + name + ", address=" + address + "]";
	}
}
