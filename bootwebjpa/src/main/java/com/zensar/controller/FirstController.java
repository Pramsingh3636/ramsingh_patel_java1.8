package com.zensar.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class FirstController
{
	
	@RequestMapping ("/first")
	public String getFirstMessage()
	{
		return "index.html";
	}
	@RequestMapping("/message")
	@ResponseBody
	public String getImportantMessage()
	{
		return "The actual message : meeting at 1 pm today"; //it is actual response body (not html page)
	}
	
	@GetMapping("/readRequest/{sid}")
	@ResponseBody
	public String getParams(@PathVariable ("sid") int sidnum,
			@RequestParam(name= "dept", required= false) String dept,
			@RequestParam(name= "toDate", required= false) String toDate,
			@RequestHeader("myheader") String headerValue,
			@RequestBody String text)
	{
		String resp="path variable sent by client :" +sidnum;
		resp += "request param + " + dept;
		resp += "todate" + toDate;
		resp += "myheader value " + headerValue;
		resp += "text as body " + text;
		return resp;
	}
}
