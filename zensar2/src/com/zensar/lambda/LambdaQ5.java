package com.zensar.lambda;

import java.util.Arrays;

public class LambdaQ5 {

	public static void main(String[] args)
	{
		StringBuilder list = new StringBuilder();
		Arrays.asList("Ram", "Shyam", "Ganesh", "Tarun", "Krishna", "Shiva", "Akash")
	        .forEach(word -> list.append(word.charAt(0)));
		
		System.out.println(list);
		
	}
		
}
