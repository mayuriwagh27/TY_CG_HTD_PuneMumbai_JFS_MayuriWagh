package com.capgemini.springcore.beans;

public class MessageBean2 {
	
	private String message;
	
	public MessageBean2() {
		System.out.println("Inside constructor");
	}

	//Getters and setters
	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
	public void init() { //to initialize
		System.out.println("Its init phase...");
	}
	
	public void destroy() { //to destroy
		System.out.println("Its destroy phase...");
	}

}
