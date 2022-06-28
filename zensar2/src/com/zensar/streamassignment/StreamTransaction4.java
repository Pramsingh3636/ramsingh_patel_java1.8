package com.zensar.streamassignment;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

class Transaction
{
	String trader;
	int year;
	int value;
	public Transaction(String trader, int year, int value) {
		super();
		this.trader = trader;
		this.year = year;
		this.value = value;
	}
	public Transaction(Trader trader, int year, int value) {
		// TODO Auto-generated constructor stub
	}
	public String getTrader() {
		return trader;
	}
	public void setTrader(String trader) {
		this.trader = trader;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}

	public int getValue() {
		return value;
	}
	public void setValue(int value) {
		this.value = value;
	}
}	
public class StreamTransaction4
{
	public static void main(String[] args)
	{
		List<Transaction> list = new ArrayList<>();

		list.add(new Transaction(new Trader("Ramsingh","Delhi"),2011,65000));
		list.add(new Transaction(new Trader("Ganesh","Pune"),2015,76000));
		list.add(new Transaction(new Trader("Harish","Noida"),2011,51000));
		list.add(new Transaction(new Trader("Krishna","Jabalpur"),2017,35000));
		list.add(new Transaction(new Trader("Shiva","Raipur"),2021,27000));

		//Q 7 : All Transactions in year 2011 and sort them by value(small to high)

		System.out.println();
		list.stream().filter(c->c.year==2011).sorted(Comparator.comparing(Transaction::getValue))
		.forEach(c->System.out.println(c));

		//Q 12 : All Transactions values from traders living in Delhi

		System.out.println();
//		list.stream().filter(c->c.trader.city=="Delhi").forEach(c->System.out.println("Value = "+c.value));

		//Q 13 : The highest value of all the Transactions

		System.out.println("\n");
		Transaction a = list.stream().max(Comparator.comparing(Transaction::getValue)).get();
		System.out.println("Highest Transaction Value = "+a.value);

		//Q 14 :  Transaction with the smallest value is

		System.out.println("\n");
		Transaction b = list.stream().min(Comparator.comparing(Transaction::getValue)).get();
		System.out.println("Smallest Transaction Value = "+b.value);

	}

}
