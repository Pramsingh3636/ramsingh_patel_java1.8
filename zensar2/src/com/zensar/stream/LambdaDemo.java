package com.zensar.stream;

import java.util.function.Function;
import java.util.function.Supplier;

interface Calc
{
	public int add(int a, int b);
}
class MyCalc implements Calc
{
	@Override
	public int add(int a, int b) {
		
		return a+b;
	}
}
interface NamedItem
{
	public String getName();
}
interface OddChecker
{
	public boolean isOdd(int x);
}
interface MySupplier<T>
{
	public int getT();
}
public class LambdaDemo {

	public static void main(String[] args) 
	{
		Calc c1 = new MyCalc();
		Calc c2 = new Calc() {
			@Override
			public int add(int a, int b)
			{
				return a+b;
			}};
	
		Calc c3 = (int a, int b) -> { return a+b; } ;
	    NamedItem n1 = () -> { return "Ramsingh"; } ;
	    System.out.println(n1.getName());
	    
	    OddChecker checker = (x) -> { if(x%2 ==0) return false; else return true; } ;
	    System.out.println(checker.isOdd(37));
	    
	    //In Build Functional interface
	    Supplier<Integer> supplier = () -> { return 34 ; } ;
	    System.out.println(supplier.get());
	    
	    Function<String,Integer> fun = (str) -> { return str.length(); } ;
	    System.out.println(fun.apply("Patel"));
	    
	    
//	    Consumer<T> consumer = () -> { return };
	    
//      Predicate<T> predicate = () -> {  };
	}
}
