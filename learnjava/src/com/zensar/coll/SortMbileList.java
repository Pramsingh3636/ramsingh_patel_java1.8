package com.zensar.coll;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class SortMbileList {

	public static void main(String[] args)
	{
		List<Mobile> list = new ArrayList<>();
		list.add(new Mobile("Samsung", 6.2, 8, 3.5, 16000));
		list.add(new Mobile("Xiomi", 6.2, 12, 4.2, 12000));
		list.add(new Mobile("Samsung", 6.2, 4, 4.1, 8000));
		list.add(new Mobile("Vivo", 6.1, 8, 4.7, 11000));
		list.add(new Mobile("Samsung", 6.3, 16, 4.5, 18400));
		list.add(new Mobile("Vivo", 5.6, 8, 4.2, 12000));
		
		sortMobileListByCompany(list);
		printList(list);
		sortMobileListByPrice(list);
		printList(list);
		sortMobileListByRank(list);
		printList(list);
		sortMobileListByMemory(list);
		printList(list);
		
	}
	private static void printList(List<Mobile> list)
	{
		
	}
	public static void sortMobileListByMemory(List<Mobile> list)
	{
		list.sort((m1,m2)-> m1.getCompany().compareTo(m2.getCompany()));
	}
	public static void sortMobileListByPrice(List<Mobile> list)
	{
		Comparator<Mobile> comp = (m1, m2) ->
		{
			if(m1.getPrice() > m2.getPrice())
				return 1;
			else if(m1.getPrice() < m2.getPrice())
				return -1;
			return 0;
		};
		list.sort(comp);
	}
	public static void sortMobileListByRank(List<Mobile> list)
	{
		Comparator<Mobile> comp = (m1, m2) ->
		{
			if(m1.getRank() > m2.getRank())
				return 1;
			else if(m1.getPrice() < m2.getPrice())
				return -1;
			return 0;
		};
		list.sort(comp);
	}
	public static void sortMobileListByCompany(List<Mobile> list)
	{
	}

	
}
