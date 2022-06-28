package com.zensar.coll;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import javax.swing.text.html.HTMLDocument.Iterator;

import com.zensar.ram.Student;

public class SetDemo 
{
	private static final String ch = null;
	private static Object str;
	
	public static void main(String[] args)
	{
		setIntDemo();
	}
	public static void getcharOfstr()
	{
		getcharOfstr();
	}
	public static void setIntDemo()
	{
    	Set<Integer> set = new HashSet<>();
		set.add(30); set.add(40); set.add(50);
		System.out.println("size = " + set.size());
		boolean added = set.add(94);
		System.out.println(added);
		added = set.add(40);
		System.out.println(added);
		//Print all elements
		java.util.Iterator<Integer> iterator = set.iterator();
		while(iterator.hasNext())
		{
			Integer next = iterator.next();
			System.out.println(next);
		}
		for(int x : set)
		{
			System.out.println("elements = " + x);
		}
		set.forEach((x) -> {System.out.println(x);});
		
		List<Integer> list = new ArrayList<>();
		list.add(30); list.add(34); list.add(35); list.add(36);
		list.add(30); list.add(34); list.add(35); list.add(36);
		
		set.clear();
		for(int x : list)
			set.add(x);
		
		set.clear();
		set = new HashSet<>();
		set = new TreeSet<>();
		
		list = new ArrayList<>(set);
		Set<List<Student>> set2 = new HashSet<>();
		
		String str = "This is a string java";
		String charOfstr = getCharsOfString((String) str);
		System.out.println(charOfstr);
	}
	private static String getCharsOfString(String str)
	{
		Set<Character> set = new HashSet<>();
		for(int i = 0; i<str.length(); i++)
		{
			char ch = str.charAt(i);
			set.add(ch);
		}
		String answer = "";
		for(char ch : set)
		{
			answer = answer + ch;
		}
		return answer;
	}
}
