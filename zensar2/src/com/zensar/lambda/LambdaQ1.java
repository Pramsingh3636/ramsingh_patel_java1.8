package com.zensar.lambda;

interface Add
{
	public int add(int x, int y);
}
interface Substract
{
	public int sub(int x, int y);
}
interface Multiply
{
	public int mul(int x, int y);
}
interface Division
{
	public double div(int x, int y);
}
public class LambdaQ1 {

	public static void main(String[] args)
	{
		Add ad = (x,y) -> {return x+y;};
		System.out.println(ad.add(6,7));
		
		Substract sb = (x,y) -> {return x-y;};
		System.out.println(sb.sub(6,9));
		
		Multiply ml = (x,y) -> {return x*y;};
		System.out.println(ml.mul(6,3));
		
		Division d = (x,y) -> {return x/y;};
		System.out.println(d.div(10,5));
	}
}
