package com.zensar.ram;
import java.util.Scanner;

public class Hello{
	
	public static void main(String args[])
	{
		int x;
		Scanner sc = new Scanner(System.in);
		x = sc.nextInt();
		
		switch(x)
		{
		case 0:
			System.out.println("sunday");
			break;
		case 1:
			System.out.println("monday");
			break;
		case 2:
			System.out.println("tuesday");
			break;
		case 6:
			System.out.println("saturday");
			break;
		default:
			System.out.println("Invalid day number");
			
		}
	}
}