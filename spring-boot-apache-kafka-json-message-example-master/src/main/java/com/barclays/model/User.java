package com.barclays.model;

public class User {

	private String name;
	
	private BodyObject test;

	public void setTest(BodyObject test) {
		this.test = test;
	}

	public BodyObject getTest() {
		return test;
	}

	public User() {		
	}
	
	public User(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
		
	@Override
	public String toString() {
		return "User [name=" + name + "]";
	}

}
