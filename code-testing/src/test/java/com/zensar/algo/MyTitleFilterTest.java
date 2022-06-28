package com.zensar.algo;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Matchers.anyObject;
import static org.mockito.Matchers.anyString;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

import com.zensar.algo.service.BookService;

class MyTitleFilterTest {

	@Test
	void testGetFilterBooks()
	{
		BookService bookService = new BookServiceStub();
		MyTitleFilter obj = new MyTitleFilter(bookService);

		List<String> listFiltered = obj.getFilteredBooks();
		assertEquals(listFiltered.size(), 2);

	}
	@Test
	void testGetFilteredBooksMock()
	{
		List<String> list = new ArrayList<>();
		list.add("OOPS"); list.add("Program with Objects");
		list.add("World and Computers"); list.add("OOAD");

		BookService bookService = mock(BookService.class); // dummy object of this interface
		when(bookService.getTitles("Grady Booch")). thenReturn(list);
		when(bookService.getTitles("Henry Korth")). thenThrow(new RuntimeException());
		when(bookService.getTitles(anyObject())).thenReturn(list);
		
		MyTitleFilter obj = new MyTitleFilter(bookService);
		List<String> listFiltered = obj.getFilteredBooks();
		
		verify(bookService, times(1)).getTitles(anyString()); //this function was called 
		assertEquals(listFiltered.size(), 2);
	}
}


