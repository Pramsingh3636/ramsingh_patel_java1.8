package com.zensar.file;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

class AddMultiThreadArray
{
	int[][] twoDArray;
	public AddMultiThreadArray(int[][] twoDArray)
	{
		this.twoDArray = twoDArray;
	}
	public void run()
	{
		Arrays.sort(twoDArray);
	}
}
public class AddMultiThreadedArrays {

	public static void main(String[] args)
	{
		int[][] ar = {
				{4,5,4,4,5,5},
				{4,5,4,4,5,5},
				{4,5,4,4,5,5},
				{4,5,4,4,5,5},
				{4,5,4,4,5,5},
		};
		int[][] br = {
				{4,5,4,4,5,5},
				{4,5,4,4,5,5},
				{4,5,4,4,5,5},
				{4,5,4,4,5,5},
				{4,5,4,4,5,5},
		};
		int [][] cr = new int[5][6];

		List<AddMultiThreadArray> sum = new ArrayList<>();
		for(int i = 0; i<5; i++)
		{
			for(int j = 0; j<6; j++)
			{
				cr[i][j] = ar[i][j] + br[i][j];

				System.out.println(cr[i][j]+ " ");

				sum.add(null);
//				sum.join();
			}

		}
	}
}

