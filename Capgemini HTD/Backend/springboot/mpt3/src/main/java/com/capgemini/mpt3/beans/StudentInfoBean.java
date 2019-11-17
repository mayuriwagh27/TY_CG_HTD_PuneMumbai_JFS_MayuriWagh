package com.capgemini.mpt3.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonRootName;

@JsonPropertyOrder({ "Id", "Name" })
@JsonRootName("studentInfo")
@XmlRootElement(name = "student-info")
@Entity
@Table(name = "students")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class StudentInfoBean {

	@JsonProperty("Id")
	@XmlElement(name = "student-id")
	@Id
	@Column(name = "student_id")
	private int student_id;

	@JsonProperty("Name")
	@XmlElement(name = "student-name")
	@Column(name = "student_name")
	private String student_name;

	@XmlElement
	@Column
	private String email_id;

	@XmlElement
	@Column
	private double total_marks;

	@XmlElement
	@Column
	private String password;

	@XmlElement
	@Column
	private String grade;

//Getters & setters
	public int getStudent_id() {
		return student_id;
	}

	public void setStudent_id(int student_id) {
		this.student_id = student_id;
	}

	public String getStudent_name() {
		return student_name;
	}

	public void setStudent_name(String student_name) {
		this.student_name = student_name;
	}

	public String getEmail_id() {
		return email_id;
	}

	public void setEmail_id(String email_id) {
		this.email_id = email_id;
	}

	public double getTotal_marks() {
		return total_marks;
	}

	public void setTotal_marks(double total_marks) {
		this.total_marks = total_marks;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

}// End of class
