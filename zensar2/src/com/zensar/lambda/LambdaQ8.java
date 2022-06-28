package com.zensar.lambda;

import java.util.Arrays;

public class LambdaQ8 {

	public static void main(String[] args) 
	{
		new Thread ( ()-> Arrays.asList(14,165,45,60,35,21,67,85,69,54)
				.forEach(System.out::println))
		        .start();
		
	}

}
