package com.capgemini.springcore.beans;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmplyeeTest2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		ApplicationContext context = new ClassPathXmlApplicationContext("employeeConfig.xml");
		EmployeeBean emp = context.getBean("employee", EmployeeBean.class);

		System.out.println("Enter you ID: ");
		int Id = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter you Name: ");
		String name = sc.nextLine();

		emp.setEmpId(Id);
		emp.setEmpName(name);

		System.out.println("Emp Id: " + emp.getEmpId());
		System.out.println("Emp Name: " + emp.getEmpName());
		
System.out.println("-------------------------------");
		
		//emp-1
		EmployeeBean emp1 = context.getBean("employee", EmployeeBean.class);
		
		System.out.println("Enter you ID: ");
		int Id1 = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter you Name: ");
		String name1 = sc.nextLine();

		emp1.setEmpId(Id1);
		emp1.setEmpName(name1);

		System.out.println("Emp Id: " + emp.getEmpId());
		System.out.println("Emp Name: " + emp.getEmpName());
		System.out.println("Emp-1 Id: " + emp1.getEmpId());
		System.out.println("Emp-1 Name: " + emp1.getEmpName());

	}// end of main()

}// end of class
