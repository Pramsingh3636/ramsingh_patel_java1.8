package com.zensar.ram;

public class Fibonacci {

	public static void main(String[] args) {
		
		int i, n1 = 0, n2 = 1, sum, count = 15;
		
		System.out.println(n1+""+n2);
		
		for(i =1; i<count; i++)
		{
			sum = n1 + n2;
			System.out.println(""+sum);
			n1 = n2;
			n2 = sum;
		}

	}

}
