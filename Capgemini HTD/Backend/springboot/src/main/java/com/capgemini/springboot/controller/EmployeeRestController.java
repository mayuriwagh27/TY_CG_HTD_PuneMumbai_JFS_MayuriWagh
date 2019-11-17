package com.capgemini.springboot.controller;

import java.util.List;

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

import com.capgemini.springboot.beans.EmployeeInfoBean;
import com.capgemini.springboot.beans.EmployeeResponce;
import com.capgemini.springboot.service.EmployeeService;


@RestController
// @Controller
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class EmployeeRestController {

	@Autowired
	private EmployeeService service;

	@GetMapping(path = "/getEmployee",
			/*consumes = { MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE, },*/
			produces = { MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE })
	// @ResponseBody
	public EmployeeResponce getEmployee(int empId) {
		EmployeeInfoBean employeeInfoBean = service.getEmployee(empId);
		EmployeeResponce responce = new EmployeeResponce();
		if(employeeInfoBean != null) {
			responce.setStatusCode(201);
			responce.setMessage("success");
			responce.setDescription("Employee record found...");
			responce.setEmployeeInfoBean(employeeInfoBean);
		}else {
			responce.setStatusCode(401);
			responce.setMessage("Failed");
			responce.setDescription("Employee Id" + empId + "not found");
		}
return responce;
	}// End of getEmployee()

	// @ResponseBody
	@PutMapping(path = "/addEmployee", consumes = { MediaType.APPLICATION_JSON_VALUE,
			MediaType.APPLICATION_XML_VALUE, }, produces = { MediaType.APPLICATION_JSON_VALUE,
					MediaType.APPLICATION_XML_VALUE })
	public EmployeeResponce addEmployee(@RequestBody EmployeeInfoBean employeeInfoBean) {
		boolean isAdded = service.addEmployee(employeeInfoBean);
		
		EmployeeResponce responce = new EmployeeResponce();
		
		if(isAdded) {
			responce.setStatusCode(201);
			responce.setMessage("success");
			responce.setDescription("Employee added successfully...");
		} else {
			responce.setStatusCode(401);
			responce.setMessage("failed");
			responce.setDescription("Unable to add employee...");
		}
		return responce;
	}// End of addEmployee()

	@DeleteMapping(path = "/deleteEmployee/{empId}",
			produces = { MediaType.APPLICATION_JSON_VALUE,
			MediaType.APPLICATION_XML_VALUE, })
	public EmployeeResponce deleteEmployee(@PathVariable("empId")int empId) {
		boolean isDeleted = service.deleteEmployee(empId);
		
EmployeeResponce responce = new EmployeeResponce();
		
		if(isDeleted) {
			responce.setStatusCode(201);
			responce.setMessage("success");
			responce.setDescription("Employee deleted successfully...");
		} else {
			responce.setStatusCode(401);
			responce.setMessage("failed");
			responce.setDescription("Unable to delete employee...");
		}
		return responce;
	}// End of deleteEmployee()

	@PostMapping(path = "/updateEmployee", produces = { MediaType.APPLICATION_JSON_VALUE,
			MediaType.APPLICATION_XML_VALUE })
	public EmployeeResponce updateEmployee(@RequestBody EmployeeInfoBean employeeInfoBean) {
		boolean isUpdated = service.updateEmployee(employeeInfoBean);
EmployeeResponce responce = new EmployeeResponce();
		
		if(isUpdated) {
			responce.setStatusCode(201);
			responce.setMessage("success");
			responce.setDescription("Employee updated successfully...");
		} else {
			responce.setStatusCode(401);
			responce.setMessage("failed");
			responce.setDescription("Unable to update employee...");
		}
		return responce;
		
	}// End of updateEmployee()

	@GetMapping("/getAll")
	public EmployeeResponce getAllEmployees() {
		List<EmployeeInfoBean> employeesList = service.getAllEmployees();
		EmployeeResponce responce = new EmployeeResponce();
		
		if(employeesList != null && !employeesList.isEmpty()) {
			responce.setStatusCode(201);
			responce.setMessage("success");
			responce.setDescription("Employess record found....");
			responce.setEmployeeList(employeesList);
		} else {
			responce.setStatusCode(401);
			responce.setMessage("failed");
			responce.setDescription("Unable to found record!!!");
		}
		return responce;
	}
}// End of class







