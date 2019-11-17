package com.capgemini.springcore.beans;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class MessageBean implements InitializingBean, DisposableBean {
 
	private String message;

	//Getters and setters
	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	//for initializing purpose
	public void afterPropertiesSet() throws Exception {
System.out.println("Initialiazating Phase");		
	}

	//for destroying purpose
	public void destroy() throws Exception {
System.out.println("Destroy phase !");		
	}
	
}//end of class
