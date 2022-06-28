package com.zensar.algo;

import java.util.List;

import com.zensar.algo.service.BookService;

public class MyTitleFilter 
{
	private BookService bookService;
	public MyTitleFilter(BookService bookService)
	{
		super();
		this.bookService = bookService;
	}
	List<String> getFilteredBooks()
	{
		List<String> list = bookService.getTitles("Grady Booch");
		list.removeIf(str -> str.length() > 5);
		return list;
	}

}
