package com.zensar.collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

class Employee
{
	int id;
	String name;
	public Employee(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	@Override
	public boolean equals(Object obj) {

		return true;
	}
	@Override
	public int hashCode() {

		int fixed=123456;
		return fixed;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + "]";
	}	
}
public class Collection5 
{

	public static void main(String[] args) {

		Employee emp1 =new Employee(1,"Ramsingh");
		Employee emp2 =new Employee(2,"Ganesh");
		Employee emp3 =new Employee(3,"Harish");
		Employee emp4 =new Employee(4,"Shiva");

		Map<Employee,String> map=new HashMap<>();
		map.put(emp1, "CE");
		map.put(emp2, "Mech");
		map.put(emp3, "IT");
		map.put(emp4, "CSE");
		
		Set<Entry<Employee, String>> r = map.entrySet();
		Iterator<Entry<Employee, String>> i = r.iterator();
		while(i.hasNext()) 
		{
			System.out.println("After overriding both method map is saving First"
					+ " object as Key with Last Object as value\n"+i.next());
		}
	}
}

