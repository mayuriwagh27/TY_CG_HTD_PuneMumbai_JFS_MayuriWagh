package com.capgemini.jpamedicalstore.controller;

import java.util.Scanner;

import com.capgemini.jpamedicalstore.bean.UserLoginBean;
import com.capgemini.jpamedicalstore.dao.CartDAO;
import com.capgemini.jpamedicalstore.dao.DiscussionDAO;
import com.capgemini.jpamedicalstore.dao.UserDAO;
import com.capgemini.jpamedicalstore.dao.UserDAOImpl;
import com.capgemini.jpamedicalstore.factory.AllFactory;

public class UserController {
	static boolean i;
	static UserLoginBean user;
	static Scanner sc = new Scanner(System.in);
	UserDAOImpl impl = new UserDAOImpl();
	static ValidationController valid = new ValidationController();

	public static void userOperations() {
		DiscussionDAO disscssDao = AllFactory.getDiscussionInstance();
		CartDAO cartDao = AllFactory.getCartInstance();
		UserDAO userDao = AllFactory.getUserInstance();
		String emailId = null;
		String password = null;
		String role = null;
		i = true;
		while (i) {
			System.out.println("Enter 1 To Register" + "\n Enter 2 To Login" + "\n Enter 3 To see all products");
			System.out.println("-----------------------");
			int option = ValidationController.input();
		try {
			switch (option) {
			case 1:
				UserLoginBean userbean = new UserLoginBean();
				String userName = valid.name();
				String emailid = valid.emailId();
				String password1 = valid.password();
				userbean.setName(userName);
				userbean.setEmail(emailid);
				userbean.setPassword(password1);
				userDao.register(userbean);
				System.out.println("Registered successfully");

			case 2:
				System.out.println("Continue with login");
				String emailId1 = valid.emailId();
				String password2 = valid.password();

				System.out.println("Enter role");
				role = sc.next();

				user = userDao.authenticate(emailId1, password2, role);
				System.out.println("Loggedin successfully......");

			case 3:
				GetProductList.getAllProducts();
				System.out.println(
						"Enter 1 to add product in cart \n Enter 2 to to logout \n Enter 3 to change password \n"
								+ "Enter 4 to ask question about products");
				String select = sc.next();
				switch (select) {
				case "1":
					CartController.addToCart();
					break;
				case "2":
					System.out.println("Logged out successfully");
					Operation.medical();
					break;
				case "3":
					userDao.changePassword(emailId);
					System.out.println("Your paassword has been changed successfully....");
					break;
				case "4":
					Discussion.question();
					break;
				default:
					System.out.println("please select valid option");
					userOperations();
				}
				break;

			}//End  of switch
		} catch (Exception e) {
			System.out.println("Please enter valid value");
		}

		}
	}
}// End of class
