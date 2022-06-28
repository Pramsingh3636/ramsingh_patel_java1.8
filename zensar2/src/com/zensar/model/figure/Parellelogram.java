package com.zensar.model.figure;

public class Parellelogram 
{
	double dimension1;
	double dimension2;
	double angle;
	
	public Parellelogram(double dimension1) {
		super();
		this.dimension1 = dimension1;
		this.dimension2 = dimension1;
		this.angle = 90;
	}
	
	public Parellelogram(double dimension1, double dimension2) {
		super();
		this.dimension1 = dimension1;
		this.dimension2 = dimension2;
		this.angle = 90;
	}

	public Parellelogram(double dimension1, double dimension2, double angle) {
		super();
		this.dimension1 = dimension1;
		this.dimension2 = dimension2;
		this.angle = angle;
	}
	
	public double getDimension1() {
		return dimension1;
	}
	public void setDimension1(double dimension1) {
		this.dimension1 = dimension1;
	}
	public double getDimension2() {
		return dimension2;
	}
	public void setDimension2(double dimension2) {
		this.dimension2 = dimension2;
	}
	public double getAngle() {
		return angle;
	}
	public void setAngle(double angle) {
		this.angle = angle;
	}
	
	public double area()
	{
		double area = dimension1*dimension2*Math.sin(angle);
		return area;
	}
}
