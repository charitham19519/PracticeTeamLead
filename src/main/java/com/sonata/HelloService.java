package com.sonata;

public class HelloService {
	private String name;
	
	public void setName(String name) {
		this.name=name;
		
	}
	
	public String sayHello() {
		return "hello!" +name;
	}

}
