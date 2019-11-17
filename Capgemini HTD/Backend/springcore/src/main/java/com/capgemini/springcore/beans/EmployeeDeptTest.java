package com.capgemini.springcore.beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmployeeDeptTest {

	public static void main(String[] args) {

		
		//ApplicationContext context = new ClassPathXmlApplicationContext("employeeConfig.xml");
	//	ApplicationContext context = new ClassPathXmlApplicationContext("EmployeeConfig2.xml", "departmentConfig.xml"); //if u create two .xml files
		ApplicationContext context = new ClassPathXmlApplicationContext("EmployeeConfig2.xml"); //if you provide import in "EmployeeConfig2.xml"

        EmployeeDeptBean employeeDeptBean  = context.getBean("employee", EmployeeDeptBean.class );
		
		System.out.println("Employee Id is "+ employeeDeptBean.getEmpId());
		System.out.println("Employee name is "+ employeeDeptBean.getEmpName());
		System.out.println("Dept Id is "+ employeeDeptBean.getDeptBean().getDeptId());
		System.out.println("Dept name is "+ employeeDeptBean.getDeptBean().getDeptName());

		
	}//end of main()

}//end of class
