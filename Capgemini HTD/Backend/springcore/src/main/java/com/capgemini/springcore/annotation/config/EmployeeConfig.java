package com.capgemini.springcore.annotation.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.Primary;

import com.capgemini.springcore.annotation.bean.DepartmentBean;
import com.capgemini.springcore.annotation.bean.EmployeeBean;

@Import(DepartmentConfig.class) //importing the DepartmentConfig.class
@Configuration
public class EmployeeConfig {
	
	@Bean
	public EmployeeBean getEmployeeBean() {
		
		EmployeeBean employeeBean = new EmployeeBean(); 
		employeeBean.setEmpId(101);
		employeeBean.setEmpName("Mayuri");
		return employeeBean;
		}//End of getEmployee()
	
	
	

}//End of class
