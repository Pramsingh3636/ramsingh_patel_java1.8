package com.zensar.stream;

import java.awt.Point;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamAPIDemo {

	public static void main(String[] args)
	{
		//Stream API
		//Stream info about existing data structure
		//not a DATA  STRUCTURE
		//it will be created, used and thrown away
		// can be used only once...!!!!!
		
		List<Integer> list = new ArrayList<>();
		list.add(34); list.add(95); list.add(35); list.add(34);
		list.add(134); list.add(955); list.add(55); list.add(354);
		list.add(346); list.add(105); list.add(85); list.add(33);
		
		Stream<Integer> stream = list.stream(); 
	
		boolean allMatch = stream.allMatch((x) -> { return x > 10; }) ; 
		System.out.println(allMatch);
		
//		boolean allMatch2 = stream.allMatch((x) -> { return x > 50; }) ; 
		//stream can not be used again
		boolean allMatch2 = list.stream().allMatch((x) -> { return x > 50; }) ;	
		System.out.println(allMatch2);
		
		boolean anyMatch = list.stream().anyMatch(x -> x >= 1000);
		System.out.println(anyMatch);
		
		Stream<Integer> filter = list.stream().filter(x -> x >= 300);
		filter.forEach(System.out::println);
		
		long count = list.stream().count();
		System.out.println();
		
		list.stream().distinct().forEach(System.out::println);
		list.stream().forEach((obj) -> { } );
		
		Consumer<Object> ob = (obj) -> { System.out.println(obj);};
		ob = System.out::println;
		Function<String,Integer> fun = (str) -> 87;
		int parseInt = Integer.parseInt("34");
		fun = Integer::parseInt;
		//Functonal interface = object, function(lambda), similar function obj :: method
		//reference to the function
		
		list.stream().sorted().forEach(System.out::println);
		//to collect data in a list / set / map
		List<Integer> subList = list.stream().filter(x -> x > 100).collect(Collectors.toList());
		
		//to convert one type to another type
		List<Point> pts = new ArrayList<>();
		pts.add(new Point(4,5)); pts.add(new Point(14,5)); pts.add(new Point(48,7));
		pts.add(new Point(5,5)); pts.add(new Point(45,5)); pts.add(new Point(4,75));
		
		//List<Integer> where x coordinate is there
		List<Integer> xlist = new ArrayList<>();
		for(Point p : pts)
		{
			xlist.add(p.x);
		}
		//Stream API
		//to convert one type to another type
		List<Integer> xlist2 = pts.stream()
				.map(p -> p.x)
				.collect(Collectors.toList());
	}
}
