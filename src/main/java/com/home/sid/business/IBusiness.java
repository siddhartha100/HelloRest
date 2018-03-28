package com.home.sid.business;

import com.home.sid.models.HelloRequest;
import com.home.sid.models.HelloResponse;

public interface IBusiness {
	
	public HelloResponse getHello(HelloRequest request);
}
