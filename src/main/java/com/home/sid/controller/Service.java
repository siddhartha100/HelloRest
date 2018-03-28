package com.home.sid.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.home.sid.business.IBusiness;
import com.home.sid.models.HelloRequest;
import com.home.sid.models.HelloResponse;

@RestController
public class Service implements IService {

	@Autowired
	private IBusiness business;

	@Override
	@GetMapping("/hello-get")
	public String helloWorld() {
		return "Hello World! - Your service is working.";
	}

	@Override
	@PostMapping(path = "/hello-post", consumes = "application/json", produces = "application/json")
	public ResponseEntity<?> getHello(@RequestBody HelloRequest request) {

		HelloResponse response = null;
		try {
			response = business.getHello(request);
		} catch (Exception e) {
			e.printStackTrace();
		}
		if (response != null) {
			return new ResponseEntity<>(response, HttpStatus.OK);
		}
		return new ResponseEntity<>(response, HttpStatus.NOT_FOUND);
	}

}
