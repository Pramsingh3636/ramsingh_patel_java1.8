package com.rs.zensar;

interface Figure
{
	double area();
}
class Rectangle implements Figure
{
	double len, wid;
	public Rectangle(double len, double wid)
	{
		super();
		this.len = len;
		this.wid = wid;
	}
	public double area()
	{
		return len * wid;
	}
}
public class FigureInterfaceDemo {

	public static void main(String[] args) {
		Rectangle r = new Rectangle(5,6);
		r.area();
		
		Figure f = r;
		f.area();

	}

}
