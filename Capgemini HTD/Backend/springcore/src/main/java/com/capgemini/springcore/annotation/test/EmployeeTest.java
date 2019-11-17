package com.capgemini.springcore.annotation.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import com.capgemini.springcore.annotation.bean.EmployeeBean;
import com.capgemini.springcore.annotation.config.DepartmentConfig;
import com.capgemini.springcore.annotation.config.EmployeeConfig;
import com.capgemini.springcore.beans.DepartmentBean;

public class EmployeeTest {

	public static void main(String[] args) {

		ApplicationContext context = new AnnotationConfigApplicationContext(EmployeeConfig.class);
		EmployeeBean employeeBean = context.getBean(EmployeeBean.class);

		System.out.println("Emp ID is " + employeeBean.getEmpId());
		System.out.println("Emp Name is " + employeeBean.getEmpName());
		System.out.println("Dept info.......");
		System.out.println("Dept ID is "+employeeBean.getDeptBean().getDeptId());
		System.out.println("Dept Name is "+employeeBean.getDeptBean().getDeptame());

		((AbstractApplicationContext) context).close();
		
		

	}// End of main()

}// End of class
