package com.capgemini.springcore.annotation.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.capgemini.springcore.annotation.bean.MessageBean;

@Configuration //make the class as configuration class

public class MessageConfig {

	@Bean      //to Specify the object as java bean
	
	@Scope("prototype")//
	public MessageBean getMessageBean() {
		
		MessageBean messageBean = new MessageBean();
		messageBean.setMessage("Hello world....");
		
		return messageBean;
		
	}//End of getMessageBean()
	
}//End of class
