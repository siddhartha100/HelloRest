package com.home.sid.models.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;

import com.home.sid.models.HelloRequest;

public class HelloRequestTest {

	private String firstName;
	private String lastName;
	private Integer age;
	private HelloRequest request;

	@Test
	public void testGettersAndSetters() {
		request = new HelloRequest();
		Integer age = 10;

		request.setAge(age);
		request.setFirstName("Siddhartha");
		request.setLastName("Biswas");

		assertEquals("Siddhartha", request.getFirstName());
		assertEquals("Biswas", request.getLastName());
		assertEquals(age, request.getAge());

		assertNotNull(request);
		assertNotNull(request.getFirstName());
		assertNotNull(request.getLastName());
		assertNotNull(request.getAge());

	}

}
