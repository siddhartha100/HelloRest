package com.home.sid.models.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import org.junit.Test;
import com.home.sid.models.HelloResponse;

public class HelloResponseTest {

	private String firstName;
	private String lastName;
	private Integer age;
	private String message;
	private HelloResponse response;

	@Test
	public void testGettersAndSetters() {
		response = new HelloResponse();
		Integer age = 10;

		response.setAge(age);
		response.setFirstName("Siddhartha");
		response.setLastName("Biswas");
		response.setMessage("Test");

		assertEquals("Siddhartha", response.getFirstName());
		assertEquals("Biswas", response.getLastName());
		assertEquals(age, response.getAge());
		assertEquals("Test", response.getMessage());

		assertNotNull(response);
		assertNotNull(response.getFirstName());
		assertNotNull(response.getLastName());
		assertNotNull(response.getAge());
		assertNotNull(response.getMessage());

	}

}
