package com.zensar.thread;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class ArraySorterThread extends Thread
{
	int[] oneDArray;
	public ArraySorterThread(int[] oneDArray)
	{
		this.oneDArray = oneDArray;
	}
	@Override
	public void run()
	{
		System.out.println("sorting started");
		Arrays.sort(oneDArray);
		System.out.println("sorting finished");
	}
}
public class ArraySortThreadedDemo
{

	public static void main(String[] args) throws InterruptedException
	{
		int[][] a = {
				{5,48,6,37,9,29,78,73,89,2,58,82},
				{5,48,64,37,9,29,88,73,891,2,8,82,75,89},
				{5,48,16,37,9,99,78,73,9,2,568,82,797},
				{5,48,6,37,91,29,78,83,89,2,8,82},
				{5,48,6,37,19,29,798,33,89,2,8,95,67},
		};
		List<ArraySorterThread> list = new ArrayList<>();
	    for(int i = 0; i<a.length; i++)
		{
			ArraySorterThread t = new ArraySorterThread(a[i]);
			t.start();
			list.add(t);
//			t.join(); //main will wait for t to finish job and return
		}
	    System.out.println("main is waiting to finish");
	    for(int i = 0; i<a.length; i++)
	    {
	    	list.get(i).join(); //wait for each thread to finish
	    }
	    // main must wait for all threads to finish
	    for(int i = 0; i<a.length; i++)
	    {
	    	System.out.println(Arrays.toString(a[i]));
	    }
	}
}

