package com.rs.zensar;
import java.util.Scanner;

class MyException extends Exception
{
	
}
public class UserDefinedException {

	public static void main(String[] args) throws MyException {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a word of min length 5");
		
		String str = sc.next();
		
		if(str.length() < 5)
		{
			MyException obj = new MyException();
			throw obj;
		}
		System.out.println("you have entered = " + str);
		
		try
		{
			Exception obj = new Exception("some exception");
			throw obj;
		}
		catch(Exception e)
		{
			System.out.println(e);
		}	
	}	
}
