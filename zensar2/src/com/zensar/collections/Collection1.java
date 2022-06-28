package com.zensar.collections;

import java.util.Set;
import java.util.TreeSet;

class Person implements Comparable<Person>
{
	String name;
    double height;
	double weight;
	
	public Person(String name, double height, double weight) {
		super();
		this.name = name;
		this.height = height;
		this.weight = weight;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", height=" + height + ", weight=" + weight + "]";
	}
	@Override
	public int compareTo(Person o) 
	{
		if(this.getWeight() == o.getHeight())
		{
			if(this.getHeight() > o.getHeight())
				return 1;
			else
				return -1;
		}
		else
		{
			if(this.getWeight() > o.getWeight())
				return 1;
			else
				return -1;
		}	
	}	
}

public class Collection1 {

	public static void main(String[] args) 
	{
		Set<Person> set = new TreeSet<Person>();
		
		Person p = new Person("Ramsingh", 72.67, 54);
		Person p1 = new Person("Ganesh", 75.580, 64);
		Person p2 = new Person("Harish", 56.32, 36);
		Person p3 = new Person("Krishna", 121.53, 89.80);
		Person p4 = new Person("Shiva", 82.874, 76.29);
		Person p5 = new Person("Amit", 106.87, 82.56);
		
		set.add(p); set.add(p1); set.add(p2);
		set.add(p3); set.add(p4); set.add(p5);
		
		System.out.println("In Sorted order : ");
		set.forEach((x) -> System.out.println(x + ""));
	}
}
