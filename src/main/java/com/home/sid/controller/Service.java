package com.home.sid.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Service implements IService {

	@Override
	@GetMapping("/hello")
	public String helloWorld() {
		return "Hello World! - Your service is working.";
	}

}
