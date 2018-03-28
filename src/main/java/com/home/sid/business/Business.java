package com.home.sid.business;

import org.springframework.stereotype.Component;

import com.home.sid.models.HelloRequest;
import com.home.sid.models.HelloResponse;

@Component
public class Business implements IBusiness {

	@Override
	public HelloResponse getHello(HelloRequest request) {
		// TODO Auto-generated method stub
		return null;
	}

}
