package com.zensar.ram;
class Point
{
	double x, y;
	
	//constructor
	public Point (int a, int b)
	{
		this.x = a;
		this.y = b;
	}
	public Point()
	{
		this.x = 0;
		this.y = 0;
	}
	public void show()
	{	System.out.println("values" + x + "," + y);
	}
	public double distanceFromOrigin()
	{
		double d = Math.sqrt(x * x + y * y);
	return d;
	}
	public Point reflectionInXAxis()
	{
		Point ref = new Point();
		ref.x = x;
		ref.y = -1 * y;
		return ref;
	}
}

public class BasicOfClass {
	//overloading function
	public static int sum (int a, int b)
	{
		return a + b;
	}
	public static int sum (int a, int b, int c)
	{
		return a + b + c;
	}
	public static int sum (int a[])
	{
		int s = 0;
		for(int x : a)
		{
			s = s + x;
		}
		return s;
	}
	public static int sum (int a[], int n)
	{
		int s = 0;
		for (int i = 0; i<n; i++)
		{
			s = s + a[i];
		}
		return s;	
	}
	public static void main(String[] args){
		Point p1 = new Point();
		Point p2 = new Point();
		Point p3 = new Point();
		
		p1.x = 3;
		p1.y = 8;
		System.out.println("values in point =" + p1.x + "," + p1.y);
		p2.x = 45;
		p2.y = 20;
		System.out.println("values in point =" + p2.x + "," + p2.y);
		p3.x = 125;
		p3.y = 163;
		System.out.println("values in point =" + p3.x + "," + p3.y);
		p1.show();
		p2.show();
		p3.show();
		
		System.out.println("distance of p1 " + p1.distanceFromOrigin());
		System.out.println("distance of p2 " + p2.distanceFromOrigin());
		System.out.println("distance of p3 " + p3.distanceFromOrigin());
		
		Point refp1 = p1.reflectionInXAxis();
		Point refp2 = p2.reflectionInXAxis();
		Point refp3 = p3.reflectionInXAxis();
		
		System.out.println("reflection of p1");
		System.out.println("reflection of p2");
		System.out.println("reflection of p3");
		
		refp1.show();
		refp2.show();
		refp3.show();

	}

}
