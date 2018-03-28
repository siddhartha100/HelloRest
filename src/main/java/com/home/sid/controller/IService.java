package com.home.sid.controller;

import org.springframework.http.ResponseEntity;
import com.home.sid.models.HelloRequest;


public interface IService {
	
	public String helloWorld();
	public ResponseEntity getHello(HelloRequest request);

}
