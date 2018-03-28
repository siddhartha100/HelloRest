package com.home.sid.dao;

import com.home.sid.models.HelloRequest;
import com.home.sid.models.HelloResponse;

public interface IDbAccess {
	
	public HelloResponse getHello(HelloRequest request);

}
