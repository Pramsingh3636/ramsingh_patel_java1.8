package com.zensar.streamassignment;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Comparator;

class Fruit
{
	String name;
	int calories;
	int price;
	String color;
	public Fruit(String name, int calories, int price, String color) {
		super();
		this.name = name;
		this.calories = calories;
		this.price = price;
		this.color = color;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getCalories() {
		return calories;
	}
	public void setCalories(int calories) {
		this.calories = calories;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}

}
public class StreamFruit1
{
	public static void main(String[] args)
	{
		List<Fruit> list = new ArrayList<>();
		list.add(new Fruit("Apple",130,100,"Red"));
		list.add(new Fruit("Banana",110,50,"Yellow"));
		list.add(new Fruit("Avocado",50,250,"Green"));
		list.add(new Fruit("Grapes",90,60,"Green"));
		list.add(new Fruit("Kiwi",90,180,"Green"));
		list.add(new Fruit("Orange",80,70,"Orange"));
		list.add(new Fruit("Pineapple",50,40,"Green"));
		list.add(new Fruit("Strawberry",50,240,"Red"));
		list.add(new Fruit("Watermelon",80,50,"Red"));
		list.add(new Fruit("Mango",60,250,"Yellow"));


		System.out.println("Fruit names of low calories fruits i.e. calories < 100 sorted in descending order of calories.");
		list.stream().filter(c->c.calories<100).sorted(Comparator.comparing(Fruit::getCalories).reversed())
		.forEach(c->System.out.print(c.name+"="+c.calories+", "));
		System.out.println("\n");

		Map<String,String> map = new HashMap<>();
		list.stream()
		.forEach(c->{if(map.containsKey(c.color)) map.put(c.color, map.get(c.color)+","+c.toString()); else map.put(c.color, c.toString()); });
		map.entrySet().forEach(e->{System.out.println(e.getKey()+" = "+e.getValue());});
		System.out.println();

		System.out.println("RED color fruits sorted as per their price in ascending order.");
		list.stream().filter(c->c.color=="Red").sorted(Comparator.comparing(Fruit::getPrice))
		.forEach(c->System.out.println(c));
	}
}
