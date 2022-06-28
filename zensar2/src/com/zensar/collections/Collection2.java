package com.zensar.collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class Collection2 
{
	public static void main(String[] args)
	{
		linkedHashSetDemo();
		hashSetDemo();
	}
	public static void hashSetDemo()
	{
		HashSet<String> set = new HashSet<>();
		set.add("Ramsingh");
		set.add("Ganesh");
		set.add("Harish");
		set.add("Shiva");
		
		Iterator<String> i = set.iterator();
		System.out.println("Hashset: ");
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
	}
	public static void linkedHashSetDemo()
	{
		LinkedHashSet<String> set = new LinkedHashSet<>();
		set.add("Ramsingh");
		set.add("Ganesh");
		set.add("Harish");
		set.add("Shiva");
		Iterator<String> i = set.iterator();
		System.out.println("Linked Hashset: ");
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
	}
}