package com.home.sid.models;

public class HelloRequest {
	
	private String firstName;
	private String lastName;
	private Integer age;
	
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
	public HelloRequest(String firstName, String lastName, Integer age) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
	}
	public HelloRequest() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
