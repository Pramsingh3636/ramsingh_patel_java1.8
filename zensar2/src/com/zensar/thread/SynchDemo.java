package com.zensar.thread;
/*
 * HashMap : share in 2 threads and try to change : can create problem
 * HashTable : Synchronized methods so no problems to share
 * 
 * StringBuilder : not synchronized
 * StringBuffer : synchronized
 * 
 * countWordThread share map HashTable (synchronized) : Thread safe
 * 
 * Thread 1 : delete 2nd node
 * Thread 2 : change 2nd node value
 */

class Printer
{
	synchronized public void printMessage(String msg)
	{
		//[java][thread]
		System.out.print("[");
		try
		{
			//suppose the message printing takes 1 second\
			Thread.sleep(5000);     
		}
		catch(InterruptedException e)
		{
			e.printStackTrace();
		}
		System.out.print(msg);
		System.out.print("]");
	}
}
class MessagePrinterThread extends Thread
{
	Printer printer;
	String message;
	@Override
	public void run()
	{
		//the thread is going to use printer object
		//other threads please wait
		//Synchronized(printer)
		
		printer.printMessage(message);
	}
	public MessagePrinterThread(Printer printer, String message) {
		super();
		this.printer = printer;
		this.message = message;
	}
}
public class SynchDemo {

	public static void main(String[] args)
	{
		Printer printer = new Printer();
		MessagePrinterThread t1 = new MessagePrinterThread(printer, "java");
		MessagePrinterThread t2 = new MessagePrinterThread(printer, "thread");
		
		t1.start();
		t2.start();
	}
}
