package com.zensar.lambda;

import java.util.ArrayList;
import java.util.function.UnaryOperator;

class UpCase implements UnaryOperator<String>
{
	public String apply(String str)
	{
		return str.toUpperCase();
	}
}
public class LambdaQ6 
{
	public static void main(String[] args) throws CloneNotSupportedException
	{
		ArrayList<String> list = new ArrayList<>();
		list.add("ramsingh");
		list.add("ganesh");
		list.add("shiva");
		list.add("harish");
		list.add("krishna");
		
		System.out.println("List : " + list);
		
		list.replaceAll(new UpCase());
		System.out.println("After Replace : " + list);
	}
}
