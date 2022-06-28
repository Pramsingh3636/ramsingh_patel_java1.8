package com.zensar.model.figure;

public class Rectangle extends Parellelogram
{
	public Rectangle(double dimension1, double dimension2, double angle)
	{
		super(dimension1,dimension2,angle);
	}

	@Override
	public void setAngle(double angle) throws RuntimeException
	{
		System.out.println("Angle can not change for Rectangle");		
	}

}
