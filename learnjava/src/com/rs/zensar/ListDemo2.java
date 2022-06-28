package com.rs.zensar;
import java.util.LinkedList;
import java.util.List;

import com.zensar.ram.Student;
public class ListDemo2 {
	 public static void main(String[] args)
   	 {
		 listDemo2();
   	 }
	public static void listDemo2()
	{
		 List<Student> list = new LinkedList<>();
		 
		 Student s1 = new Student("Ramsingh", "CSE"); 
		 Student s2 = new Student("Ganesh", "CSE");
		 Student s3 = new Student("Harish", "IT");
         Student s4 = new Student("Shiva", "ECE");
         
         list.add(s1); list.add(s2); list.add(s3); list.add(s4);
         
         System.out.println(list);
         
         Student student = new Student("Ramsingh", "CSE");
         student.setRoll(101);
         
         boolean contains = list.contains(s1);
         System.out.println(contains);
         
         boolean contains2 = list.contains(student);
         System.out.println(contains);
         
         System.out.println(s1.equals(student));
         System.out.println(s1.equals(s2));
         System.out.println(s1.hashCode());
       	 System.out.println(student.hashCode());  
	}
}

