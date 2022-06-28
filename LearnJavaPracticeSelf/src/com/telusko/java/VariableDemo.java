package com.telusko.java;

public class VariableDemo {
	public static void main(String[] args)
	{
		int i = 5;
		short s = 5; // 2 bytes -> 16 bits
		byte b = 5; // 1 byte -> 8 bits
		long l = 50000l; // 8 bytes
		
		char c = 'A';//implicit conversion
		c = 66;
		System.out.println(c); // ASCII Value -> American Standard Code for Information Interchange
		int k = (int)5.5; // explicit convesion -> Type Casting
		System.out.println(k);
	}

}
