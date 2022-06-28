package com.zensar.file;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ReadCharFileWithFis
{

	public static void main(String[] args)
	{
		try(FileInputStream fis = new FileInputStream("src/com/zensar/file/Employee.java"))
		{
			int ch = fis.read();
			while(ch != -1)
			{
				System.out.print((char)ch);
				ch = fis.read();
			}
		}
		catch(FileNotFoundException e)
		{
			e.printStackTrace();
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}	

	}

}
