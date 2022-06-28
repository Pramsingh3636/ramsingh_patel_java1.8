package com.zensar.ram;

import java.util.Scanner;

public class Aacend {
	public static void main(String args[]) {
		
		int x = 3, y = 8, z = 1;
		Scanner sc = new Scanner(System.in);
		x = sc.nextInt();
		y = sc.nextInt();
		z = sc.nextInt();
		
		if(x>y)
			System.out.println("largest="+x);
		else
			System.out.println("middle="+x);
		if(x>z)
			System.out.println("middle="+x);
		else
			System.out.println("smallest="+x);
		
		
	}

}
