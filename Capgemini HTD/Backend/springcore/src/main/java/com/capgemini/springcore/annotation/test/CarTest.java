package com.capgemini.springcore.annotation.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.capgemini.springcore.annotation.bean.Car;

public class CarTest {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("carConfig.xml");
		Car myCar = context.getBean("myCar", Car.class);
		
		System.out.println("Moedel name is "+ myCar.getModelName());
		System.out.println("Moedel number is "+ myCar.getModelNum());
		System.out.println("Engine details----------------");
		System.out.println("cc = "+ myCar.getEngine().getCC());
		System.out.println("Type = "+ myCar.getEngine().getType());



	}//End of main()

}//End of class
