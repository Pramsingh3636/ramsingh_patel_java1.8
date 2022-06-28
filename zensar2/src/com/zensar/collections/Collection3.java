package com.zensar.collections;

import java.util.ArrayList;

import java.util.ListIterator;

public class Collection3 {

	public static void main(String[] args) {
		ArrayList<Integer>list=new ArrayList<>();
		list.add(1);
		list.add(2);list.add(3);list.add(4);
		list.add(5);
		ListIterator li=list.listIterator(list.size());
		while(li.hasPrevious())
		{
			System.out.println(li.previous());
		}
	}

}

