package com.home.sid.business;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.home.sid.dao.IDbAccess;
import com.home.sid.models.HelloRequest;
import com.home.sid.models.HelloResponse;

@Component
public class Business implements IBusiness {

	@Autowired
	private IDbAccess dbAcesss;

	@Override
	public HelloResponse getHello(HelloRequest request) {

		HelloResponse response = null;
		try {
			response = dbAcesss.getHello(request);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return response;
	}

}
