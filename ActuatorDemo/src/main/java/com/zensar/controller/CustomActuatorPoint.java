package com.zensar.controller;

import org.springframework.boot.actuate.endpoint.web.annotation.RestControllerEndpoint;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;

@Component
@RestControllerEndpoint(id="customend")
public class CustomActuatorPoint
{
	@GetMapping("/")
	public String customHome()
	{
		//my logic about the app to return info required
		return "Custom actuator end ponit";
	}

}