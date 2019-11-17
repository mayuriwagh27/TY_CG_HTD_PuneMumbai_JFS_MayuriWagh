package com.capgemini.springcore.beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MessageTest {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");//from which class we get data
		
		((AbstractApplicationContext)context).registerShutdownHook();//to destroy container
		
		MessageBean messageBean = (MessageBean) context.getBean("messageBean");   //id from bean.xml
		
		System.out.println(messageBean.getMessage());
		
		//((AbstractApplicationContext)context).close(); //implicitly destroying container

	}//end of main()

}//end of class
