package com.zensar.model;

import java.util.LinkedList;
import java.util.List;

import com.zensar.ram.Student;

public class CompanyDemo {

	public static void main(String[] args)
	{
		Employee[] emp = new Employee[5];
				
		Employee e1= new Employee(101,"Ramsingh patel","employee","IT");
		Employee e2= new Employee(102,"Ganesh","employee","IT");
		Employee e3= new Employee(103,"Harish","employee","IT");
		Employee e4= new Employee(104,"Ram","employee","IT");
		Employee e5= new Employee(105,"Shiva","Manager","CSE");
		
		emp[0]=e1;
		emp[1]=e2;
		emp[2]=e3;
		emp[3]=e4;
		emp[4]=e5;
		
		Company c = new Company();
		Employee temp[]=c.getEmployees();
		for(Employee e:temp)
		{
			System.out.println(e);
		}

	}

}

