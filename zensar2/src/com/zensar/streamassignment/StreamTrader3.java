package com.zensar.streamassignment;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Comparator;
import java.util.stream.Collectors;

class Trader
{
	String name;
	String city;
	int year;

	public Trader(String name, String city) {
		super();
		this.name = name;
		this.city = city;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}
}
public class StreamTrader3
{

	public static void main(String[] args) 
	{
		List<Trader> list = new ArrayList<>();
				new Trader("Ramsingh", "Delhi");
				new Trader("Ganesh", "Pune");
				new Trader("Shyam", "Pune");
				new Trader("Harish", "Noida");
				new Trader("Krishna", "Jabalpur");
				
//				Q 8 : All the unique cities where the traders work

				System.out.println("  All the unique cities where the traders work.");
				List<String> l1 = new ArrayList<>();
				list.stream().forEach(c->l1.add(c.city));
				l1.stream().distinct().forEach(c->System.out.print(c+", "));
				System.out.println("\n");
				
//				Q 9 : All traders from Pune and sort them by name.

				System.out.println(" All traders from Pune and sort them by name. ");
				list.stream().filter(c->c.city=="Pune").sorted(Comparator.comparing(Trader::getName))
				.forEach(c->System.out.print(c.name+"="+c.city+", "));;
				System.out.println("\n");
				
//				Q 10 : A string of all traders’ names sorted alphabetically

				System.out.println("A string of all traders’ names sorted alphabetically."
						+ "");
				StringBuilder sd = new StringBuilder();
				list.stream().sorted(Comparator.comparing(Trader::getName)).forEach(c->sd.append(c.name+", "));
				System.out.println(sd);
				
//				Q11 : Are any traders based in Indore?

				System.out.println("\nAre any traders based in Indore?");
				List<String> l2 = new ArrayList<>();
				list.stream().forEach(c->{if(c.city=="Indore") l2.add(c.name);});
				if(l2.size()!=0) {
					System.out.println("YES\n"+l2);
				}else {
					System.out.println("NO");
				}

	}
}