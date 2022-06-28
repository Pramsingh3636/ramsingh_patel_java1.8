package com.dk.ram;

class Book1
{
	public static void main(String[] args)
	{
		String ar[] = {"java Programming", "Ramsingh", "2", "550.50"};
		System.out.println(ar);	
	}
}

public class Book {
	
     String title;
	 String author;
	 int edition;
     double price;
	
	//Constructor
	public Book(String title, String author, int edition, double price)
	{
		this.title = title;
		this.author = author;
		this.edition = edition;
		this.price = price;
	}
	//default Constructor
	public Book()
	{
		
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public int getEdition() {
		return edition;
	}
	public void setEdition(int edition) {
		this.edition = edition;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Book [title=" + title + ", author=" + author + ", edition=" + edition + ", price=" + price + "]";
	}
	
}
