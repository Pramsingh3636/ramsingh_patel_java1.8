package com.zensar.thread;

import com.zensar.thread.MyThread;
import com.zensar.thread.YourThread;

/*
 * Eclipse teams chrome, vlc : MultiProgramming
 * when a program does 2 or more jobs at the time : MultiThreading
 * Ex : Whatsapp share video and check other message at the time
 * load webPage : image, image , image browser is doownloading multi images 
 * add select the song, add to the list
 * 
 * one program doing 2 things at the same time 
 */

//Method 2 : implement Runnable interface
class YourThread implements Runnable
{
	@Override
	public void run()
	{
		for(int i =1; i<=100; i++)
		{
			System.out.println("runnable " + i);
		}
	}
}
//Method 1: Extend Thread class
class MyThread extends Thread
{
	@Override
	public void run()
	{
		for(int i = 1; i<=100; i++)
		{
			System.out.println("child " + i);
		}
	}
}
public class ThreadDemo
{
	public static void main(String[] args)
	{
		YourThread obj = new YourThread();

//        obj.run(); //will not run in backGround
		
		Thread t2 = new Thread(obj);
		t2.start(); // it will call obj.run() in backGround
		
		MyThread t1 = new MyThread();
//		t1.run(); //First complete run then come here
		t1.start(); // super class method start, start will call run
		// It will return at the same time, run() will run in backGround
		
		for(int i = 1; i<=100; i++)
		{
			System.out.println("main " + i);
		}
	}
}

