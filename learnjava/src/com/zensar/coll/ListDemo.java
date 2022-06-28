package com.zensar.coll;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListDemo {

	public static void main(String[] args) {
		String[] ar = {"Ramsingh Patel", "Harish", "keerthi reddy", "alka", "shruti"};
		String[] br = getSmallNames(ar, 6);

		for(String word: br)
		{
			System.out.println(word);
		}
		List<String> list =getSmallNamesList(ar, 6);
		for(String word : list)
		{
			System.out.println(word);
		}
	}
	private static List<String> getSmallNamesList(String[] ar, int len)
	{
		List<String> list = new ArrayList<>();
		for(int i = 0; i<ar.length; i++)
		{
			if(ar[i].length() <= len)
			{
				list.add(ar[i]);
			}
		}
		return list;
	}

	private static String[] getSmallNames(String[] ar, int len)
	{
		int j = 1;
		String br[] = new String[ar.length];
		for(int i = 1; i<ar.length; i++)
		{
			if(ar[i].length()<=len)
			{
				br[j]= ar[i];
				j++;	
			}
		}
		br = Arrays.copyOf(br, j);
		return br;
	}

}
