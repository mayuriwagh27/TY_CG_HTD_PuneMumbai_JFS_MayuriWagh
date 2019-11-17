package com.capgemini.springmvc.controller;

import java.sql.Date;
import java.text.SimpleDateFormat;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.capgemini.springmvc.beans.UserBean;

@Controller      //used to make class controller
public class SpringMVCController {
	@InitBinder
	public void initBinder(WebDataBinder binder) {
		CustomDateEditor dateEditor = new CustomDateEditor(new SimpleDateFormat("yyyy-MM-dd"), true);
		
		binder.registerCustomEditor(Date.class, dateEditor);
	}//End of initBinder()
	
	//map the request
	@RequestMapping(path = "/hello", method = RequestMethod.GET)
	public ModelAndView display() {         // used to create Model & View
		ModelAndView modelAndView = new ModelAndView(); //object created
		modelAndView.setViewName("/hellouser."); //path of hellouser.jsp(hierarchy)
		
		return modelAndView;
	}//End of display
	
	
	@RequestMapping(path="/login", method = RequestMethod.GET)
	public ModelAndView  displayLoginForm() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("login");
		return modelAndView;
	}//End of displayLogin()
	
	@RequestMapping(path="/login", method=RequestMethod.POST)
	public ModelAndView login(HttpServletRequest req, ModelAndView modelAndView) {
		String empIdval = req.getParameter("empId");
		String password = req.getParameter("password");
		
		req.setAttribute("empId", empIdval);
		req.setAttribute("pwd", password);
		
		modelAndView.setViewName("/userdetails");
return modelAndView;
	}//End of login
	
	
	
	//2nd method of login using @RequestParam
	@RequestMapping(path = "/login2", method = RequestMethod.POST)
	public String login2 (@RequestParam("empId") int empId,
		@RequestParam("password") String password, ModelMap modelMap) {
		//ModelMap used to request
		modelMap.addAttribute("empId", empId);
		modelMap.addAttribute("pwd", password);
		
		return "userdetails";

	}//End of login2()
	
	
	//3rd method of login using @PostMapping
	@PostMapping("/login3")
	public String login3(int empId, String password, ModelMap modelMap) {
		modelMap.addAttribute("empId", empId);
		modelMap.addAttribute("pwd", password);
		return "userdetails";
	}//End of login3()
	
	//4th method of login using Bean class
	@PostMapping("/login4")
	public String login4(UserBean userBean, ModelMap modelMap) {
		 modelMap.addAttribute("userBean", userBean);
		 
		 return "userdetails";
	}//End of login4()
	

}//End of class












