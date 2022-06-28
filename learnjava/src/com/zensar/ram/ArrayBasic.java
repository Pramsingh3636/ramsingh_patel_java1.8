package com.zensar.ram;
public class ArrayBasic 
{  
	static int arr[] = { 10,20,15,13,99};
	
	static int largest()
	
		{
			int i;
			
			int max = arr[0];
			
			for (i = 1; i< arr.length; i++)
				if (arr[i]>max)
					max = arr[i];
			
			return max;
			
		}
		
		public static void main(String[] args)
		
		{
			System.out.println("largest in given array is : "+ largest());
	    }
}