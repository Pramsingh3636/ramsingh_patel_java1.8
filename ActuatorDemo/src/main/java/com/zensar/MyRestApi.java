package com.zensar;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyRestApi 
{
	@GetMapping("/api")
	public String testApi()
	{
		return "Api";
	}

}