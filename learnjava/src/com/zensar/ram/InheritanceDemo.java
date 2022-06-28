package com.zensar.ram;

public class InheritanceDemo {
	
	public static void main(String[] args)
	{
		Student s1 = new Student("Ramsingh", "CSE");
		RegularStudent reg = new RegularStudent("Harish", "CSE", "Mon To Fri", "RGPV");
		PartTimeStudent part = new PartTimeStudent("Ganesh", "CSE", "RDVV");
		
		int roll = reg.getRoll();
		String name = part.getName();
		
		s1 = reg;
		
		reg.getCollege();
		
		Figure f; //ABSTRACT CLASS
//		Figure f = new Figure();
		Rectangle r = new Rectangle(6,5);
		Circle c = new Circle (8);
		
//		System.out.println(f.area());
		System.out.println(r.area());
		System.out.println(c.area());
		
		f = c;
		System.out.println(c.area());
		
		f = r;
		System.out.println(r.area());
		
	}

}
