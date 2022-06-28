package com.ram;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name="OLX-USER-SERVICE2") 
//CHANGE THE NBAME OF SERVICE OLX-LOGIN
public interface OlxUserServiceClient
{	
	@GetMapping("/unprdicted")
	public String getResponse();

}

