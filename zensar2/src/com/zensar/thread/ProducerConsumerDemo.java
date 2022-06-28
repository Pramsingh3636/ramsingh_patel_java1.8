package com.zensar.thread;

import java.util.Random;

class MsgQ
{
	int item;
	boolean valueSet = false;
	
   synchronized public void put(int x)
	{
		while(valueSet) //value is already there
		{
			//Special method from object class(super class of all classes)
			try
			{
				wait();
			}
			catch(InterruptedException e)
			{
				e.printStackTrace();
			}
		}
		// come out of loop value is not there
		item = x;
		valueSet = true;
		System.out.println("PUT " + item);
		
		//I have put the value if consumer is blocked, wake up him
		notify(); //from object class
	}
	synchronized public void get()
	{
		while(valueSet == false) // no value in the queue
		{
			try
			{
				wait(); //consumer will wait block till the time producer wakes up
			}
			catch(InterruptedException e)
			{
				e.printStackTrace();
			}
		}
		System.out.println("GOT " + item);
		valueSet = false;
		
		//if producer is blocked, wake him up
		notify();
	}
}
class Producer extends Thread
{
	MsgQ q;
	public Producer(MsgQ q)
	{
		super();
		this.q = q;
	}
	@Override
	public void run()
	{
		int val = 1;
		while(true)
		{
			//produce an item
			Random rand = new Random();
			int time = rand.nextInt(1000)+5000;
			try
			{
				Thread.sleep(time);
			}
			catch(InterruptedException e)
			{
				e.printStackTrace();
			}
			System.out.println("Producer is trying to put ");
			q.put(val++);
		}
	}
}
class Consumer extends Thread
{
	MsgQ q;
	public Consumer(MsgQ q)
	{
		super();
		this.q = q;
	}
	@Override
	public void run()
	{
		while(true)
		{
			System.out.println("Consumer trying to pick up item ");
			q.get();
			//Take time to consume it
			Random rand = new Random();
			int time = rand.nextInt(1000)+5000;
			try
			{
				Thread.sleep(time);
			}
			catch(InterruptedException e)
			{
				e.printStackTrace();
			}
		}
	}
}
public class ProducerConsumerDemo 
{
	public static void main(String[] args) 
	{
		MsgQ q = new MsgQ();
		Producer p = new Producer(q);
		Consumer c = new Consumer(q);
		
		p.start();
		c.start();		
	}
}
