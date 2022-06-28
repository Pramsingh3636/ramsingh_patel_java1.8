package com.telusko.java;

class Casio
{
	public void add(int i)
	{
		System.out.println(i);
	}
	public void add(int i, int j)
	{
		System.out.println(i + j);
	}
	public void add(int i, int j, int k)
	{
		System.out.println(i + j + k);
	}
	public void add(double i, double j)
	{
		System.out.println(i + j);
	}
}


public class MethodOverloadingDemo {

	public static void main(String[] args)
	{
		Casio obj = new Casio();
		obj.add(8);
		obj.add(5,2);
		obj.add(5.5, 7.9);
		obj.add(4,5,6);
		
		
	}

}
