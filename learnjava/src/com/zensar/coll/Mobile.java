package com.zensar.coll;

public class Mobile {
	
	String company;
	double size;
	int memory;
	double rank;
	double price;
	
	public Mobile(String company, double size , int memory, double rank, double price)
	{
		super();
		this.company = company;
		this.size = size;
		this.memory = memory;
		this.rank = rank;
		this.price = price;
	}
	public String getCompany() {
		return company;
	}
	
	public void setCompany(String company) {
		this.company = company;
	}

	public double getSize() {
		return size;
	}

	public void setSize(double size) {
		this.size = size;
	}

	public int getMemory() {
		return memory;
	}

	public void setMemory(int memory) {
		this.memory = memory;
	}

	public double getRank() {
		return rank;
	}

	public void setRank(double rank) {
		this.rank = rank;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public static void main(String[] args)
	{
		
		

	}

}
