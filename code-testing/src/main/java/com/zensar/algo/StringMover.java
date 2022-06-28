package com.zensar.algo;

public class StringMover
{
	public String moveTwoChars(String str)
	{
		//move first two chars of the string to last
		//hello -> llohe
		//java -> vaja
		//program -> ogrampr
		try
		{
			Thread.sleep(2000);
		}
		catch(InterruptedException e)
		{
			e.printStackTrace();
		}		
		String startstring = str.substring(0, 2);
		String endstring = str.substring(2);
		String answer = endstring + startstring;
		
		return answer;
	}
	public static void main(String[] args)
	{
		StringMover obj = new StringMover();
		String output = obj.moveTwoChars("hello");
		System.out.println(output);
		/*
		 * JUNIT TESTING
		 * program
		 * ab
		 * a
		 * cccc
		 */	
	}
}

