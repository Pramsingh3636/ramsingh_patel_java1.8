package com.zensar.controller;

import java.util.Map;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;

//@FeignClient (name="OLX-LOGIN", url = "http://localhost:9000")

@FeignClient (name="OLX-LOGIN")
public interface MyUserFeignClient
{
	@PostMapping("/user/authenticate")
	public String getJwt(@RequestBody Map<String, String> map);

	@GetMapping("/user")
	public String getUser(@RequestHeader("Authorization") String jwt);

	//	eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJtaW5hdGkiLCJhZG1pbiI6ImJoaW1hIiwiY2F0ZWdvcnkiOiJiaWtlIiwiZXhwIjoxNjUyNzM1NjI0LCJ1c2VyIjoibWluYXRpIiwiaWF0IjoxNjUyNjk5NjI0fQ.Nzl7r9PqB8YzqJqb6JzPzVzmwVcKyJ6FqJmWODp83yw
	//	eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJtaW5hdGkiLCJhZG1pbiI6ImJoaW1hIiwiY2F0ZWdvcnkiOiJiaWtlIiwiZXhwIjoxNjUyNzM1NjI0LCJ1c2VyIjoibWluYXRpIiwiaWF0IjoxNjUyNjk5NjI0fQ.Nzl7r9PqB8YzqJqb6JzPzVzmwVcKyJ6FqJmWODp83yw

	@GetMapping("/token/validate")
	public String getValidatoinStatus(@RequestHeader("Authorization") String jwt);
	@GetMapping("/eureka-test")
	public String eurekatest();

}
