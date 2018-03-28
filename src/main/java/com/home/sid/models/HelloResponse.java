package com.home.sid.models;

public class HelloResponse {
	
	private String firstName;
	private String lastName;
	private Integer age;
	private String message;
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public HelloResponse(String firstName, String lastName, Integer age,
			String message) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.message = message;
	}
	public HelloResponse() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
