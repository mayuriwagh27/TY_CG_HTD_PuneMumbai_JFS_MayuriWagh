package com.capgemini.mpt3.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.mpt3.beans.StudentInfoBean;
import com.capgemini.mpt3.beans.StudentResponse;
import com.capgemini.mpt3.service.StudentService;

@RestController
//@Controller
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class StudentRestController {
	@Autowired
	private StudentService service;

	@GetMapping(path = "/getStudent", produces = { MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE })
	// @ResponseBody
	public StudentResponse getStudent(int student_id) {
		StudentInfoBean studentInfoBean = service.getStudent(student_id);
		StudentResponse responce = new StudentResponse();
		if (studentInfoBean != null) {
			responce.setStatusCode(201);
			responce.setMessage("success");
			responce.setDescription("Student record found...");
			responce.setStudentInfoBean(studentInfoBean);
		} else {
			responce.setStatusCode(401);
			responce.setMessage("Failed");
			responce.setDescription("Student Id" + student_id + "not found");
		}
		return responce;
	}// End of getStudent()

	@PutMapping(path = "/addstudent", consumes = { MediaType.APPLICATION_JSON_VALUE,
			MediaType.APPLICATION_XML_VALUE, }, produces = { MediaType.APPLICATION_JSON_VALUE,
					MediaType.APPLICATION_XML_VALUE })
	public StudentResponse addStudent(@RequestBody StudentInfoBean studentInfoBean) {
		boolean isAdded = service.addStudent(studentInfoBean);

		StudentResponse responce = new StudentResponse();

		if (isAdded) {
			responce.setStatusCode(201);
			responce.setMessage("success");
			responce.setDescription("Student added successfully...");
		} else {
			responce.setStatusCode(401);
			responce.setMessage("failed");
			responce.setDescription("Unable to add student...");
		}
		return responce;
	}// End of addStudent()

	@DeleteMapping(path = "/deleteStudent", produces = { MediaType.APPLICATION_JSON_VALUE,
			MediaType.APPLICATION_XML_VALUE, })
	public StudentResponse deleteStudent(@PathVariable("student_id") int student_id) {
		boolean isDeleted = service.deleteStudent(student_id);

		StudentResponse responce = new StudentResponse();

		if (isDeleted) {
			responce.setStatusCode(201);
			responce.setMessage("success");
			responce.setDescription("Student deleted successfully...");
		} else {
			responce.setStatusCode(401);
			responce.setMessage("failed");
			responce.setDescription("Unable to delete student...");
		}
		return responce;
	}// End of deleteStudent()
	
	@PostMapping(path = "/updateStudent", produces = { MediaType.APPLICATION_JSON_VALUE,
			MediaType.APPLICATION_XML_VALUE })
	public StudentResponse updateStudent(@RequestBody StudentInfoBean studentInfoBean) {
		boolean isUpdated = service.updateStudent(studentInfoBean);
		StudentResponse responce = new StudentResponse();
		
		
		if(isUpdated) {
			responce.setStatusCode(201);
			responce.setMessage("success");
			responce.setDescription("Student updated successfully...");
		} else {
			responce.setStatusCode(401);
			responce.setMessage("failed");
			responce.setDescription("Unable to update student...");
		}
		return responce;
		
	}// End of updateEmployee()


}// End of class
