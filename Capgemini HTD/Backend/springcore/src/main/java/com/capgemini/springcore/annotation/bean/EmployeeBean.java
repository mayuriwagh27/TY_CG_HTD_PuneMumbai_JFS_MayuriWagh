package com.capgemini.springcore.annotation.bean;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class EmployeeBean {

	private int empId;
	private String empName;
	@Autowired (required = false) //used to make the variable as autowired 
	@Qualifier("testing") //used instead of primary 
	private DepartmentBean deptBean;

	// getters & setters
	public DepartmentBean getDeptBean() {
		return deptBean;
	}

	public void setDeptBean(DepartmentBean deptBean) {
		this.deptBean = deptBean;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	// Bean life-cycle methods
	@PostConstruct
	public void init() {
		System.out.println("This is Init Phase");
	}// end of init()

	@PreDestroy
	public void destroy() {
		System.out.println("This is destroy Phase");
	}// end of destroy()

}// End of class
