package com.zensar.lambda;

import java.util.ArrayList;
import java.util.List;

interface Print_Order
{
	public void orders(List<Orders> list);
}
class Orders{
	String name= "";
	int amount=0;
	String status = "";
	public Orders(String name, int amount, String status) 
	{
		super();
		this.name = name;
		this.amount = amount;
		this.status = status;
	}
	@Override
	public String toString() {
		return "Orders [name=" + name + ", amount=" + amount + ", status=" + status + "]";
	}
}
public class LambdaQ2 
{
	public static void main(String[] args) 
	{
		Orders o1= new Orders("mobile",4000,"complete");
		Orders o2= new Orders("laptop",70000,"incomplete");
		Orders o3= new Orders("macbook",90000,"incomplete");
		Orders o4= new Orders("mouse",170,"incomplete");
		Orders o5= new Orders("pen",300,"Accepted");

		List<Orders>list= new ArrayList<>();
		list.add(o1);
		list.add(o2);
		list.add(o3);
		list.add(o4);
		list.add(o5);

		Print_Order print=(o)->{
			for(int i=0;i<o.size();i++) {
				boolean s1=o.get(i).status.equalsIgnoreCase("Accepted");
				boolean s2=o.get(i).status.equalsIgnoreCase("Complete");
				if((o.get(i).amount>10000)||(s1)||(s2))
				{System.out.println(list.get(i));}
			}
		};
		print.orders(list);
	}
}

