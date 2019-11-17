package com.capgemini.springcore.annotation.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.capgemini.springcore.annotation.bean.DepartmentBean;

@Configuration
public class DepartmentConfig {
	
	@Bean (name ="developer")    //
	//@Primary        //to give preference 
	public DepartmentBean getDevelopment() {
		
		DepartmentBean bean = new DepartmentBean();
		bean.setDeptId(1);
		bean.setDeptame("Developer");
		return bean;
		}//End of getDepartment()
	
	@Bean(name ="testing")
	public DepartmentBean getTesting() {
		
		DepartmentBean bean = new DepartmentBean();
		bean.setDeptId(2);
		bean.setDeptame("Testing");
		return bean;
		}//End of getTesting()
	
	

}//End of class
