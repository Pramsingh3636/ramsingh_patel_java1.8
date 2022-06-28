package com.zensar.file;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializeDemo
{
	public static void main(String[] args)
	{
		try
		{
			Employee emp = new Employee(101, "Ramsingh", "pramsingh3636@gmail.com", "Jabalpur");
			
	    	FileOutputStream fout = new FileOutputStream("mydata.bin");
      		ObjectOutputStream oos = new ObjectOutputStream(fout);
		
			oos.writeInt(129);
			oos.writeInt(8768);
			oos.writeDouble(15.4);
			oos.writeObject(emp);
			//serialize : to convert an object to bytes
		
			System.out.println("Data written in binary file");
			oos.close();
			fout.close();
			
			FileInputStream fis = new FileInputStream("mydata.bin");
			ObjectInputStream ois = new ObjectInputStream(fis);
			
			int x = ois.readInt();
			int y = ois.readInt();
			double d = ois.readDouble();
			
			Employee emp2 = (Employee) ois.readObject();
			System.out.println(x + " , " + y + " , " + d );			System.out.println("got employee from file : " + emp2);
		
			ois.close();
			fis.close();
			
		}
		catch(FileNotFoundException e)
		{
			e.printStackTrace();
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
		catch(ClassNotFoundException e)
		{
			e.printStackTrace();
		}
	}
}
/*Q2
 * text file roll marks 
 * 
 * marks.txt
 * 562 65
 * 845 96
 * 4859 205
 * 1520 12
 * 
 * To write all this data in a binary file marks.bin
 * Read the data from binary file and store in a list and print the list
 */





