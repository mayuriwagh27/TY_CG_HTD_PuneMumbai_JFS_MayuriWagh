package com.capgemini.springmvc.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.capgemini.springmvc.beans.EmployeeInfoBean;
import com.capgemini.springmvc.service.EmployeeService;

@Controller
public class EmployeeController {

	@Autowired
	private EmployeeService service;

	@GetMapping("/empLogin")
	public String displayLoginForm() {

		return "empLogin";
	}// End of displayLoginForm()

	@PostMapping("/empLogin")
	public String empLogin(int empId, String password, ModelMap modelMap, HttpServletRequest req) {
		EmployeeInfoBean employeeInfoBean = service.authenticate(empId, password);
		if (employeeInfoBean != null) {
			// valid Credentials
			HttpSession session = req.getSession(true);
			session.setAttribute("employeeInfoBean", employeeInfoBean);
			return "empHomePage";
		} else {
			// Invalid Credentials

			// modelMap.addAttribute("msg","Invalid Credentials");
			return "empLogin";
		}

	}// End of empLogin()

	@GetMapping("/addEmployeeForm")
	public String displayAddForm(HttpSession session, ModelMap modelMap) {
		if (session.isNew()) {
			modelMap.addAttribute("msg", "Please login first");
			return "empLogin";
		} else {
			return "addEmployeeForm";
		}

	}// End of displayAddForm()

	@PostMapping("/addEmployeeForm")
	public String addEmployee(EmployeeInfoBean employeeInfoBean, HttpSession session, ModelMap modelMap) {
		if (session.isNew()) {
			// Invalid session
			modelMap.addAttribute("msg", "Please login first");
			return "empLogin";
		} else {
			// valid session
			if (service.addEmployee(employeeInfoBean)) {
				modelMap.addAttribute("msg", "Employee added successfully");
			} else {
				modelMap.addAttribute("msg", "Unable to add Employee");

			}
			return "addEmployeeForm";
		}
	}// End of addEmployee

	@GetMapping("/logout")
	public String logout(HttpSession session, ModelMap modelMap) {
		session.invalidate();

		modelMap.addAttribute("msg", "Logged out successfully");
		return "empLogin";
	}// End of logout()

	@GetMapping("/updateEmployeeForm")
	public String displayUpdateForm(HttpSession session, ModelMap modelMap) {
		if (session.isNew()) {
			// Invalid session
			modelMap.addAttribute("msg", "Please login first");
			return "empLogin";
		} else {
			// Valid session
			return "updateEmployeeForm";

		}
	}// End of displayUpdateForm()

	@PostMapping("/updateEmployeeForm")
	public String updateEmployee(EmployeeInfoBean employeeInfoBean, HttpSession session, ModelMap modelMap) {
		if (session.isNew()) {
			// Invalid session
			modelMap.addAttribute("msg", "Please login first");
			return "empLogin";
		} else {
			// valid session
			if (service.updateEmployee(employeeInfoBean)) {
				modelMap.addAttribute("msg", "Employee details uodates successfully...");

			} else {
				modelMap.addAttribute("msg", "Unable to update detils...");

			}
			return "updateEmployeeForm";

		}

	}// End of UpdateeEmployee()a
}// End of class
