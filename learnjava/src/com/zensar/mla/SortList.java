package com.zensar.mla;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

import com.zensar.ram.Student;

class MyComparator implements Comparator<Integer>
{

	@Override
	public int compare(Integer i, Integer j) {
		// TODO Auto-generated method stub
		return i - j;
	}

}

public class SortList 

{
	public static void  sortStudentList() {


		List<Student> list = new LinkedList<>();
		Student s1 = new Student("Ramsingh", "CSE");
		Student s2 = new Student("Lucky", "CSE");
		Student s3 = new Student("Ganesh", "CSE");
		Student s4 = new Student("Ramsingh", "Mech");
		Student s5 = new Student("Shyam", "ECE");
		Student s6 = new Student("Ved", "EEE");
		Student s7 = new Student("Harish", "IT");
		list.add(s1); list.add(s2); list.add(s3);
		list.add(s4); list.add(s5); list.add(s6); list.add(s7);
		System.out.println(list);
	
		Collections.sort(list);
		System.out.println(list);

		Comparator<Student> comparator  = new Comparator<Student>()
		{

			@Override
			public int compare(Student o1, Student o2) 
			{
				// TODO Auto-generated method stub
				return o1.getName().compareTo(o2.getName());
			}
		};
		Collections.sort(list, comparator);
		System.out.println(list);

		list.sort(comparator);

		Collections.sort(list);
		Collections.sort(list, comparator);
	}
	public static void main(String[] args) 
	{
		sortStudentList();
	}
	public static void sortIntList()
	{
		List<Integer> list = new ArrayList<>();
		list.add(34);list.add(36);list.add(35);

		System.out.println(list);
		Collections.sort(list);
		System.out.println(list);

		MyComparator comp = new MyComparator();
		list.sort(comp);


		//Method 2

		Comparator<Integer> comp2 = new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				// TODO Auto-generated method stub
				return o1-o2;
			}

		};
		//method 3 lambda expression
		Comparator<Integer> comp3 = (o1,o2) -> {return o1- o2;};
		list.sort(comp3);
	}
	public static void main1(String[] args) 
	{
		sortIntList();
		sortStudentList1();
	}
	public static void sortStudentList1()
	{
		List<Student> list = new LinkedList<>();
		Student s1 = new Student("Ramsingh", "CSE");
		Student s2 = new Student("Lucky", "CSE");
		Student s3 = new Student("Ganesh", "CSE");
		Student s4 = new Student("Ramsingh", "Mech");
		Student s5 = new Student("Shyam", "ECE");
		Student s6 = new Student("Ved", "EEE");
		Student s7 = new Student("Harish", "IT");
		list.add(s1); list.add(s2); list.add(s3);
		list.add(s4); list.add(s5); list.add(s6); list.add(s7);
		System.out.println(list);
		Collections.sort(list);
		System.out.println(list);

		Comparator<Student> comparator =new Comparator<Student>()
		{
			@Override
			public int compare(Student o1, Student o2)
			{
				// TODO Auto-generated method stub
				return o1.getName().compareTo(o2.getName());
			}
		};
		Collections.sort(list,comparator);
		System.out.println(list);
		list.sort(comparator);

		Collections.sort(list);
		Collections.sort(list, comparator);
	}
}