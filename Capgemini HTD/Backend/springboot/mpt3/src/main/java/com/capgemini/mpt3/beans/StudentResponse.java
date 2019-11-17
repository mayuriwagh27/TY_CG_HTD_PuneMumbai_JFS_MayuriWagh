package com.capgemini.mpt3.beans;

import java.util.List;

public class StudentResponse {

	private int statusCode;
	private String message;
	private String description;
	private StudentInfoBean studentInfoBean;
	private List<StudentInfoBean> studentList;

	// Getters & setters
	public int getStatusCode() {
		return statusCode;
	}

	public void setStatusCode(int statusCode) {
		this.statusCode = statusCode;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public StudentInfoBean getStudentInfoBean() {
		return studentInfoBean;
	}

	public void setStudentInfoBean(StudentInfoBean studentInfoBean) {
		this.studentInfoBean = studentInfoBean;
	}

	public List<StudentInfoBean> getStudentList() {
		return studentList;
	}

	public void setStudentList(List<StudentInfoBean> studentList) {
		this.studentList = studentList;
	}

}// End of class
