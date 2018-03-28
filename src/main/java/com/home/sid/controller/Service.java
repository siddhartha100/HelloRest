package com.home.sid.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.home.sid.models.HelloRequest;
import com.home.sid.models.HelloResponse;

@RestController
public class Service implements IService {

	@Override
	@GetMapping("/hello-get")
	public String helloWorld() {
		return "Hello World! - Your service is working.";
	}

	@Override
	@PostMapping("/hello-post")
	public ResponseEntity<?> getHello(HelloRequest request) {
		
		HelloResponse response = null;		
		return new ResponseEntity<>(response, HttpStatus.OK);
	}

}
