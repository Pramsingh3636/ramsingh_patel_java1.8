package com.zensar.ram.service;

import org.springframework.stereotype.Component;

@Component
public class LibraryServiceImpl implements LibraryService
{
	public String getLibraryName()
	{
		
		return "ZENSAR Library";
	}

}
