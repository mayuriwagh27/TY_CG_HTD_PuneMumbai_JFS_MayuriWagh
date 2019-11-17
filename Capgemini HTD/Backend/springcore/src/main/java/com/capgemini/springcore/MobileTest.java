package com.capgemini.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.capgemini.springcore.beans.MobileBean;

public class MobileTest {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("mobile.xml");
		
		MobileBean mobileBean =  context.getBean("mobile", MobileBean.class);
		
		System.out.println("Brand name is "+ mobileBean.getBrandName());
		System.out.println("Model name is "+ mobileBean.getModelname());
		System.out.println("price is "+ mobileBean.getPrice());

		System.out.println("Display size is "+ mobileBean.getDisplay().getDisplaysize());
		System.out.println("resolution  is "+ mobileBean.getDisplay().getResolution());

	}

}
