package com.rs.zensar;

interface Calculator
{
	public static final int COLOR = 1;
	
	int add(int a, int b);
	int multiply(int a, int b);
	
	default public int divide(int a, int b)
	{
		return a/b;
	}
	static public String getDetails()
	{
		return "This is a Calculator";
	}
}
interface ScientificCalc extends Calculator
{
	public double  sin(double d); //abstract method
}
class MyCalc implements ScientificCalc
{
	public int add(int a, int b)
	{
		return a + b;
	}
	public int multiply(int a, int b)
	{
		return a * b;
	}
	public double sin(double d)
	{
		return Math.sin(d);
	}
}
class RealCalculator implements Calculator
{
	public int add(int a, int b)
	{
		return 5*a*b;
	}
	public int multiply(int a, int b)
	{
		return a + b + 25;
	}
}
public class FunnyCalculatorDemo {
	public static void useCalculator(Calculator calc)
	{
		System.out.println("adding 5 and 6 =" + calc.add(5, 6));
		System.out.println("multiplying 5 and 6 =" + calc.multiply(5, 6));
	}
	public static void main(String[] args)
	{
//		Calculator calc = new Calculator() => ERROR
;		MyCalc fcalc = new MyCalc();
		RealCalculator rcalc = new RealCalculator();
		useCalculator(fcalc);
		useCalculator(rcalc);
	}
}
