package com.zensar.lambda;

import java.util.Map;
import java.util.TreeMap;

public class LambdaQ7 {

	public static void main(String[] args)
	{
		Map<String, Integer> map = new TreeMap<>();
		
		map.put("Ram", 81);
		map.put("Singh", 65);
		map.put("Patel", 121);
		map.put("Ganesh", 20);
		map.put("Harish", 59);
		
		StringBuilder value = new StringBuilder();
		map.entrySet().forEach(e -> value.append(e.getKey())
				      .append(e.getValue() ) );
		
		System.out.println(value.toString());

	}
}
