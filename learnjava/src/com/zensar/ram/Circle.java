package com.zensar.ram;

public class Circle extends Figure{
	
	double rad;
	public Circle(double rad)
	{
		super();
		this.rad = rad;
	}
	public double area()
	{
		return Math.PI * rad * rad;
	}
//	ABSTRACT CLASS
	public void draw()
	{
		System.out.println("a circle is drawn");
	}
}


