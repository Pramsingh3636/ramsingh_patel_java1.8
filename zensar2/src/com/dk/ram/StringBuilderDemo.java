package com.dk.ram;

public class StringBuilderDemo {

	public static void main(String[] args)
	{
		String str = "";
		for(char ch='A'; ch<='Z'; ch++)
		{
			str = str + ch;
		}
		System.out.println(str);
		//String Builder
		StringBuilder sb = new StringBuilder();
		for(char ch='A'; ch<='Z'; ch++)
		{
			sb.append(ch);
		}
		System.out.println(sb);
		
		StringBuffer sbf = new StringBuffer();
		for(char ch='A'; ch<='Z'; ch++)
		{
			sbf.append(ch);
		}
		System.out.println(sbf);
	}
}
