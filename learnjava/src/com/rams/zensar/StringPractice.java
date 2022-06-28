package com.rams.zensar;

public class StringPractice {

	public static void main(String[] args) 
	{
		String [] arr = {"Ramsingh Patel", "Akshay Pal", "anuRag Jain", 
				"Debarshi Mukharji", "Ganesh majji", "Ganesh Hire", 
				"karishma Shaik", "KeerthiVasan", "Sahana H P"};
        System.out.println("names");
        
        String name = "Ramsingh Patel";
        StringPractice obj = new StringPractice();
        obj.getDateAsDesired("17 - 12 - 99");
        obj.getDateAsDesired("03.03.2004");
	}
	public String getDateAsDesired(String str)
	{
		long currentTimeMillis = System.currentTimeMillis();
		System.out.println(new java.util.Date());
		System.out.println(new java.sql.Date(currentTimeMillis));
		
		String[] words = str.split("[-|.]");
		
		if(words.length != 3)
			return null;
		
		String answer = "";
		int dd = Integer.parseInt(words[0].trim());
		int mm = Integer.parseInt(words[1].trim());
		int yy = Integer.parseInt(words[2].trim());
		
		if(dd<10) {answer = answer + "0" + dd;}
		else answer = answer + dd;
		
		if(mm<10) {answer = answer + "0" + mm; }
		else answer = answer + mm;
		
		if(yy<10) {answer = answer + "200" + yy; }
		else if(yy<100) {answer = answer + "19" + yy; }		
		else answer = answer + yy;
		
		for(String word : words)
		{
			System.out.println(word.trim());
		}
		return null;		
	}
public String makeTitleCaseOneWord(String str)
{
	String lower = str.toLowerCase();
	String rem = lower.substring(1);
	char ch = str.charAt(0);
	
	String upper = (""+ ch).toUpperCase();
	String ans = upper + rem;
	return ans;
}
public String makeTitleCase(String str)
{
	String[] split = str.split("\\s+");
	return str;
}
public void makeTitleCase(String[] arr)
{
	for(int i = 0; i<arr.length; i++)
	{
		arr[i] = makeTitleCase(arr[i]);
	}
}
public void removeOne(String[] arr, int n)
{
	for(int i = n; i<arr.length-1; i++)
	{
		arr[i] = arr[i+1];
	}
}
}







