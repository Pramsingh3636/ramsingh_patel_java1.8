package com.zensar.algo;

import java.util.ArrayList;
import java.util.List;

import com.zensar.algo.service.BookService;

public class BookServiceStub implements BookService
{
	@Override
	public List<String> getTitles(String author)
	{
		List<String> list = new ArrayList<>();
		list.add("OOPS"); 
		list.add("Program with Objects");
		list.add("World and Computers");
		list.add("OOAD");
		return list;
	}
}
