package com.rams.zensar;

public class StringDemo {
	public static void main(String[]args)
	{

	String s1 = "abc";
	String s2 = "xyz";
	String s3 = "123";
	String s4 = "A";
	
	String s5 = new String("abc"); //from HEAP
	String s6 = new String("JAVA");
	String s7 = new String("");
	
	String s8 = "abc"; //from POOL
	String s9 = new String("abc"); //from HEAP
	
	System.out.println(s1 == s8); //pointing to same object or not
	System.out.println(s5 == s9);
	//compare the content
	boolean equals = s1.equals(s5);
	System.out.println("content equals " + equals);
	
	//Strings are immutable(can not change the object)
	s1 = "Hello Ramsingh. This is java for you ! ";
	s1.concat("Ramsingh");
	System.out.println(s1);
	
	//methods
	int length = s1.length();
	System.out.println(length);
	
	char charAt = s1.charAt(3);
	System.out.println(charAt);
	
	int epos = s1.indexOf('e');
	System.out.println(epos);
	
	int indexOf = s1.indexOf("is");
	System.out.println(indexOf);
	
	int indexOf2 = s1.indexOf("big");
	System.out.println(indexOf2);
	
	boolean startsWith = s1.startsWith("java");
	System.out.println(startsWith);
	
	boolean endsWith = s1.endsWith(" ! ");
	System.out.println(endsWith);

	boolean contains = s1.contains("this");
	System.out.println(contains);
	
	s1.indexOf("e");
	int lastIndexOf = s1.lastIndexOf("e");
	System.out.println(lastIndexOf);
	
	String substring = s1.substring(8);
	System.out.println(s1);
	System.out.println(substring);
	
	String substring2 = s1.substring(8,10);
	System.out.println(substring2);
	
	String upperCase = s1.toUpperCase ();
	System.out.println(upperCase);
	
	String f = "ganesh";
	String s = "RAM";
	int diff = f.compareTo(s);
	System.out.println("diff = " + diff);
	
	s1 = "this is java for you";
	String[] words = s1.split(" ");
	for(String word : words)
		System.out.println(word);
	
	char[] charArray = s1.toCharArray();
	for(char ch : charArray)
		System.out.println(ch);
	
	//for(int i = 0; i<s1.length(); i++);
	//System.out.println(s1.charAt(i));
	    
	 //System.in.skip(System.in.available());
	 //Scanner sc = new Scanner(System.in);
	// System.out.println("line = " + line);	
	
	}
}			

