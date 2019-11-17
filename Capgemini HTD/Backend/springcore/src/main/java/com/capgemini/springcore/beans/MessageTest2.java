package com.capgemini.springcore.beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MessageTest2 {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
		
		MessageBean2  messageBean2 = context.getBean("messageBean2", MessageBean2.class);
		
		System.out.println("Message " +messageBean2.getMessage() );
		
	((AbstractApplicationContext)context).close(); //implicitly destroying container


	}//end of main()

}//end of class
