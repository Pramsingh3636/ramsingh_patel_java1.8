package com.telusko.java;

class Ram
{
	int num1; //instance Variable
	int num2;
	int result;
	public Ram()//Default Constructor
	{
		num1 = 5;
		num2 = 5;
		System.out.println("In Constructor");
	}
	public Ram(int num1, int num2) //Parameterized Constructor
	{
		this.num1 = num1; //Local Variable
		this.num2 = num2; // this. --> current object/ Keyword
	}
	public Ram(double d, int n)//Parameterized Constructor
	{
		num1 = (int) d;
		num2 = n;
	}
}	
public class ObjectConstructorDemo {

	public static void main(String[] args)
	{
		Ram obj = new Ram(9.5, 8); //Constructor
	    
		System.out.println(obj.num1);
		System.out.println(obj.num2);
		
	}
}



