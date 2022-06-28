package com.zensar.coll;

import java.security.KeyStore.Entry;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapDemo {

	public static void main(String[] args)
	{
//		Map<String, Integer> map = new HashMap<>();
//		map.put("Ramsingh", 90);
//		map.put("Ganesh", 91);
//		map.put("Harish", 87);
//		map.put("Shiva", 85);
//		map.put("Krishna", 67);
//
//		System.out.println(map);
//
//		Integer marks = map.get("Ramsingh");
//		Integer marks2 = map.get("Harish");
//
//		Boolean containsKey = map.containsKey("Shyam");
//		map.put("Harish", 80);
//		System.out.println(map);
//		
//		Set<String> keySet = map.keySet();
//		Collection<Integer> values = map.values();
////    	Set<Entry<String, Integer>> entrySet = map.entrySet();
//	
		String str = "this is a string in java";
		Map<Character, Integer> map1 = new HashMap<>();
		
		for(int i=0; i<str.length(); i++)
		{
			if(map1.containsKey(str.charAt(i)))
			{
				map1.put(str.charAt(i), map1.get(str.charAt(i)) + 1);
			}
			else
			{
				map1.put(str.charAt(i), 1);
			}
		}
		System.out.println(map1);	
		
	}

}
