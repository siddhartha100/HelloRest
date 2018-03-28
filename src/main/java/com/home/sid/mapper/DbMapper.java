package com.home.sid.mapper;

import com.home.sid.models.HelloRequest;
import com.home.sid.models.HelloResponse;

public class DbMapper {

	public HelloResponse dataMap(HelloRequest request) {

		HelloResponse response = new HelloResponse();
		String message = "Hello " + request.getFirstName() + " " + request.getLastName() + ". You are "
				+ request.getAge() + " year's old.";

		response.setAge(request.getAge());
		response.setFirstName(request.getFirstName());
		response.setLastName(request.getLastName());
		response.setMessage(message);

		return response;
	}

}
