package com.telusko.java;

class Calc
{
	int num1;
	int num2;
	double result;
	
	public void perform()
	{
		result = num1 + num2;
	}
}	
public class ObjectDemo {

	public static void main(String[] args)
	{
	//  Calc obj;
	//	obj = new Calc(); //Reference
		Calc obj = new Calc();
		obj.num1 = 4;
		obj.num2 = 5;
		obj.perform();
		System.out.println(obj.result);
	}
}
