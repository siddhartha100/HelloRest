package com.home.sid.dao;

import org.springframework.stereotype.Component;

import com.home.sid.business.IBusiness;
import com.home.sid.models.HelloRequest;
import com.home.sid.models.HelloResponse;

@Component
public class DbAccess implements IBusiness {

	@Override
	public HelloResponse getHello(HelloRequest request) {
		// TODO Auto-generated method stub
		return null;
	}

}
