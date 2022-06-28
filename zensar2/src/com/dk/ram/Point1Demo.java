package com.dk.ram;

class Point
{
	public int x, y;
	public void show()
	{
		System.out.println("x= " + x + " y " + y);
	}
}

public class Point1Demo
{

	public static void main(String[] args) 
	{
		Point p1 = new Point();
		p1.x = 10;
		p1.y = 15;

		Point p2 = new Point();
		p2.x = 20;
		p2.y = 25;

		Book b1 = new Book("java Programming", "gustlin", 3, 450.5);
		Book b2 = new Book();
		// all the data of book b2 create same as book b1
		b2.setTitle(b1.getTitle() );
		b2.setAuthor(b1.getAuthor() );
		b2.setEdition(b1.getEdition() );
		b2.setPrice(b1.getPrice() );
		//Array of Book and their value
		Book[] books = new Book[5];
		books[0] = b1;
		books[1] = b2;
		books[4] = new Book("DBMS", "Ram", 2, 599.0);
		Book bk = new Book("Spring", "Ganesh", 5, 799.0);
		
		// this method searches for a null position in the array and
		// puts the book at that position
		}
	// AddInArray(books,bk)
	static void add(Book[] books)
	{
//		Book[] books = new Book(1, bk);
//		books.add(bk);
	}
}	
	    
	






