package com.zensar.lambda;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

class Person
{
	private String name;

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}	
}
public class LambdaQ3 {
	//Functional Interface

	public static void main(String[] args) {
		//Predicate- Boolean result
		Predicate<String> checkLength = str -> str.length() > 5;
		System.out.println(checkLength.test("Ramsingh")); // true
		System.out.println(checkLength.test("Ram")); // false
		
		//Consumer Interface
		Person p = new Person();
		Consumer<Person> setName = t -> t.setName("Ramsingh Patel");
		setName.accept(p);
		System.out.println(p.getName());
		
		//Function Interface
		Function<Integer,String> getInt = t -> "data multiply by 5 : " + t*5;
		System.out.println(getInt.apply(6));
		
		//Supplier Interface
		Supplier<Double> getRandomData = ()-> Math.random();
		System.out.println(getRandomData.get()); // no input or It will give random value
	}
}
