package com.telusko.java;

public class JumpDemo {

	public static void main(String[] args)
	{
		for(int i=1; i<=10; i++)
		{
	/*		if(i==5)
			{
				break; //can't execute the further line
			}
	*/
			if(i==5)
			{
				continue; // can't execute the current line
			}
			System.out.println("value is " + i);
		}
	
	}

}
