package com.capgemini.springcore.beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmployeeTest {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml"); //name of .xml file
		EmployeeBean employeeBean =  (EmployeeBean) context.getBean("employee");  //id given in bean.xml
		//other way of getBean
		EmployeeBean employeeBean1 =  context.getBean("employee1", EmployeeBean.class) ;   //id given in bean.xml

		
		System.out.println("Employee Id is "+ employeeBean.getEmpId());
		System.out.println("Employee Name is  "+ employeeBean.getEmpName()); //for employee from bean.xml
		
		System.out.println("---------------------------------");
		System.out.println("Employee Id is "+ employeeBean1.getEmpId());         //for employee1 from bean.xml
		System.out.println("Employee Name is  "+ employeeBean1.getEmpName());

		
	}//end of main

}//end of class
