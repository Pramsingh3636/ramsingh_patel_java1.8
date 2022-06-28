package com.zensar.lambda;

import java.util.ArrayList;
import java.util.List;

public class LambdaQ4 {

	public static void main(String[] args) 
	{
		List<String> words = new ArrayList<>();
		
		words.add("Ramsingh"); words.add("Ganesh"); words.add("Shyam"); words.add("Krishna");
		words.add("Harish"); words.add("Tarun"); words.add("Sagars"); words.add("Snehal");
		words.add("Shiva"); words.add("Manoj"); words.add("Ram"); words.add("Pradeep");
		
		words.removeIf(word -> (word.length() % 2) != 0);
		System.out.println(words);
	}

}
