package com.rs.zensar;

import java.util.ArrayList;
import java.util.List;

public class ListDemo1 {

	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<>();
		
		int size = list.size();
		System.out.println("size= " + size);
//		
//		list.add(34);
//		list.add(91);
//		list.add(58);
//		list.add(58);
//		list.add(34);
//		list.add(3);
////		
//		Integer valatzero = list.get(0);
//		for(int i =0; i<list.size(); i++)
//		{
//			System.out.print(list.get(i) + " ");
//		}
//		System.out.println();
//		
//		for(int x : list)
//		{
//			System.out.print(x + " ");
//		}
//		System.out.println();
//		
//		list.add(2,88);
////		list.add(3,1);
////		list.add(4,2);
////		list.add(5,3);
//		for(int x : list)
//		{
//			System.out.print(x + " ");
//		}
//		System.out.println();
//		
//		list.clear();
//		// 1,2,3,4,5,6
//		list.add(2); list.add(3); list.add(5);
//		list.add(6);
//		list.add(0, 1);
//		list.add(3, 4);
//		for(int x : list)
//		{
//			System.out.print(x + " ");
//		}
//		System.out.println();
//		
//		list.set(1, 22);
//		System.out.println(list);
//		
//		list.remove(5);
//		System.out.println(list);
//		
//		boolean contains = list.contains(3);
//		System.out.println(contains);
//		
//		boolean contains1 = list.contains(10);
//		System.out.println(contains1);
//		
//		int index = list.indexOf(3);
//		System.out.println(index);
//		
//		list.remove(new Integer(22));
//		System.out.println(list);
//		
//		list.add(6); list.add(7);
//		System.out.println(list);
//		
//		list.lastIndexOf(2);
//		List<Integer> sublist = list.subList(2, 5);
//		System.out.println(sublist);
//		
//	
//		
		// 4,5,3,2,4,6,7,5,4,5
		list.add(4);
		list.add(5);
		list.add(3);
		list.add(2);
		list.add(4);
		list.add(6);
		list.add(7);
		list.add(5);
		
	Integer valatzero = list.get(0);

		for(int x : list)
		{
			System.out.print(x + " ");
		}
		
		System.out.println();
		
		//remove 1/4 elements both si
		List<Integer> sublist = list.subList(2, 6);
		System.out.println(sublist);
		
		//remove Alternate elements
		
	    List<String> list1 = new ArrayList<String>();
	    for (String i : list1) {
	        if (i.contains(".")) {
	            list1.remove(i);
	        }
	    }
	    System.out.println(list1);
	    
	    //remove all duplicate elements
	    
	    
	   
	}
}


