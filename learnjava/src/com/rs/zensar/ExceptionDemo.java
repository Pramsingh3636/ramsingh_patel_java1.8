package com.rs.zensar;

import java.io.FileReader;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionDemo {

	public static void main(String[] args)
	{
		Scanner sc = null;
		try
		{
			System.out.println("program starts");

			sc = new Scanner (System.in);
			System.out.println("enter integers to divide");

			int x = sc.nextInt();
			int y = sc.nextInt();
			int z = x/y;
			System.out.println("Quotient is: " + z);

			String str = "12";
			int parsed = Integer.parseInt(str);
			System.out.println("converted int = " + parsed);

		}
		catch(ArithmeticException e)
		{
			System.out.println("Arithmetic Error Occured " + e);
		}
		catch(NumberFormatException e)
		{
			System.out.println("Number Format Problem " + e);
		}
		catch(InputMismatchException e)
		{
			System.out.println("User entered wrong input" + e);
		}
		catch(Exception e)
		{
			System.out.println("some error occured " + e);
		}
		finally
		{
			System.out.println("This code will always run exceptionoccurs or do not occur");
		}
		try
		{
			while(true)
			{
				try
				{
					System.out.println("enter file name");
					sc.nextLine();
					String file = sc.nextLine();
					FileReader fr = new FileReader(file);
					System.out.println("file opened");
					break;
				}
				catch(Exception e)
				{
					System.out.println("wrong file name, Try again ");
				}
			}
		}
		catch (Exception e)
		{
			System.out.println(e);
		}
		finally
		{
			sc.close();
		}

	}

}
