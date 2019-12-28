package com.capgemini.jpamedicalstore.controller;

import java.util.Scanner;

import com.capgemini.jpamedicalstore.bean.ProductBean;
import com.capgemini.jpamedicalstore.bean.UserLoginBean;
import com.capgemini.jpamedicalstore.dao.AdminDAO;
import com.capgemini.jpamedicalstore.dao.CartDAO;
import com.capgemini.jpamedicalstore.dao.DiscussionDAO;
import com.capgemini.jpamedicalstore.dao.ProductDAO;
import com.capgemini.jpamedicalstore.dao.UserDAO;
import com.capgemini.jpamedicalstore.factory.AllFactory;
import com.capgemini.jpamedicalstore.validation.ValidationDAO;

public class Operation {
	static boolean i;
	static Scanner s = new Scanner(System.in);
	static AdminDAO admindao = AllFactory.getAdminInstance();
	static UserDAO dao = AllFactory.getUserInstance();
	static ProductDAO productdao = AllFactory.getProductInstance();
	static CartDAO cartdao = AllFactory.getCartInstance();
	static DiscussionDAO dicussdao = AllFactory.getDiscussionInstance();
	static ValidationController valid = new ValidationController();
	static ValidationDAO validdao = AllFactory.getValidInstance();
	static UserLoginBean user;
	static ProductBean bean;

	public static void medical() {

		System.out.println(
				"Enter 1 To perform user operations \n Enter 2 for Admin operations \n Enter 3 to see all product");
		System.out.println("*************************");
		String emailId = null;
		String password = null;
		String role = null;
		int input = 0;
		do {
			System.out.println("Select an option:");
			String choice = s.next();
			switch (choice) {
			case "1":
				UserController.userOperations();
			case "2":
				System.out.println("Enter 1 to Register \n Enter 2 to Login");
				String select = s.next();
				validdao.numberValidaton(select);

				switch (select) {
				case "1":
					UserLoginBean userbean = new UserLoginBean();
					String userName = valid.name();
					String emailId1 = valid.emailId();
					String password1 = valid.password();
					System.out.println("Enter Role");
					role = s.next();
					userbean.setName(userName);
					userbean.setEmail(emailId1);
					userbean.setPassword(password1);
					userbean.setRole(role);
					dao.register(userbean);
					System.out.println("Registered successfully");

				case "2":
					String emailId2 = valid.emailId();
					String password2 = valid.password();
					System.out.println("Enter role");
					role = s.next();
					user = admindao.login(emailId2, password2, role);
					System.out.println("Logged in successfully");
					AdminController.adminOperation();

				default:
					System.out.println("Please enter valid input");
					medical();
				}
			case "3":
				GetProductList.getAllProducts();
			}
			System.out.println("Want to continue press 1");
			String i = s.nextLine();
			while (!validdao.numberValidaton(i)) {
				System.out.println("Please enter valid value");

				i = s.nextLine();
			}
			input = Integer.parseInt(i);
		} while (input == 1);

	}

}// End of class
