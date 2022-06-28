package com.zensar.file;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileCopyDemo {

	public static void main(String[] args)
	{
		try
		{
			//if file does not exist, throws exception
			//this file should be in the present working directory(project : zensar2)
			FileReader fr = new FileReader("src/com/zensar/file/somelines.txt"); //checked at compile time
			Scanner sc = new Scanner(fr);
			
			// if file does not exist, will create new
			FileWriter fw = new FileWriter("halffile.txt");
			//loop to read from file and write to another file
			
			String line = null;
			int ch = fr.read();
			while(sc.hasNextLine()) //when EOF reaches it returns -1
			{
				line = sc.nextLine();
				fw.write(line + "\n");
			//	fw .write(ch);
			//	ch = fr.read();
				if(sc.hasNext())
					line = sc.nextLine();
				//do not write to output
			}
			System.out.println("half file copied");
			
			fr.close();
			fw.close();	
		}
		catch(FileNotFoundException e)
		{
			System.out.println("file not found for reading " + e);
		}
		catch(IOException e)
		{
			System.out.println("file not created for writing");
			e.printStackTrace();
		}
	}	
}
/* Q1. Calculate sum of all integers in a text file and write sum to another text file
  sum.txt
 */ 

