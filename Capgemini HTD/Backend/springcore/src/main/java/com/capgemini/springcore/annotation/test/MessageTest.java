package com.capgemini.springcore.annotation.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.capgemini.springcore.annotation.bean.MessageBean;
import com.capgemini.springcore.annotation.config.MessageConfig;

public class MessageTest {

	public static void main(String[] args) {

		ApplicationContext context = new AnnotationConfigApplicationContext(MessageConfig.class); // config class name

		MessageBean messageBean1 = context.getBean(MessageBean.class); // Bean class name
		System.out.println("Message 1 = "+ messageBean1.getMessage()); // calling get method
		
		MessageBean messageBean2 = context.getBean(MessageBean.class); // Bean class name
		System.out.println("Message 2 = "+messageBean2.getMessage()); // calling get method
		
		messageBean2.setMessage("Its new message for Bean 2");
		System.out.println("Message 1 = "+messageBean1.getMessage()); // calling get method		
		System.out.println("Message 2 = "+messageBean2.getMessage()); // calling get method		

	}// end of main()

}// end of class
