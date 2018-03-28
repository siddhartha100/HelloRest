package com.home.sid.dao;

import org.springframework.stereotype.Component;

import com.home.sid.business.IBusiness;
import com.home.sid.mapper.DbMapper;
import com.home.sid.models.HelloRequest;
import com.home.sid.models.HelloResponse;

@Component
public class DbAccess implements IDbAccess {

	@Override
	public HelloResponse getHello(HelloRequest request) {

		DbMapper mapper = new DbMapper();
		HelloResponse response = mapper.dataMap(request);
		return response;
	}

}
