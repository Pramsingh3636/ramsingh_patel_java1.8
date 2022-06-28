package com.rams.zensar;

import java.util.Arrays;

public class ExeciseArray {

//	public static void main(String[] args)
//   {
/*		// Add two Arrays
		int[] ar = {3,4,1,6};
		int[] br = {4,5,6};
		
		int ar1 = ar.length;
		int br1 = br.length;
		
		int[] merge = new int[ar1 + br1];
		
		System.arraycopy(ar,0,merge,0,ar1);
		System.arraycopy(br,0,merge,ar1,br1);
		
		System.out.println(Arrays.toString(merge));	
*/
/*		//Find common Integers
		int[] ar = {3,4,1,6};
		int[] br = {4,5,6};
		
		for(int i=0; i<ar.length; i++)
		{
			for(int j=0; j<br.length; j++)
			{
				if((ar[i]) == (br[j]))
					System.out.println("common Integers is : "+(ar[i]));
			}
		}
*/	
/*		// Replace the digit
		int[] ar = {4,5,99,3,2,4,7,5,3};
		System.out.println(Arrays.toString(ar));
		change(ar);
		System.out.println(Arrays.toString(ar));		
	}
	static void change(int[] ar)
	{
		ar[1]=99;
	}
*/
		// Insert The Element
		public static int[] insertElement(int[] ar, int index, int element)
		{
			int[] ar1 = {4,5,99,3,2,4,7,5,3};
			ar1 = Arrays.copyOf(ar1, ar1.length +1);
			for(int i = ar1.length-2; i>= index+1; i--)
			{
				ar1[i] = ar1[i-1];
			}
			ar1[index] = element;
			return ar1;
		}
}
 