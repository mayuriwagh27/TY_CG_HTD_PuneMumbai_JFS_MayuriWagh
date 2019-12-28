package com.capgemini.medicalstore.controller;

import java.util.InputMismatchException;
import java.util.Scanner;

import com.capgemini.medicalstore.bean.AddToCartBean;
import com.capgemini.medicalstore.bean.UserBean;
import com.capgemini.medicalstore.dao.AddToCartDAO;
import com.capgemini.medicalstore.dao.DiscussionDAO;
import com.capgemini.medicalstore.dao.UserDAO;
import com.capgemini.medicalstore.factory.AllFactory;
import com.capgemini.medicalstore.validation.ValidationDAO;

public class GetUserLogin {
	static UserBean bean;

	public static boolean getLogin() {
		UserDAO dao = AllFactory.getDAOInstance2();
		DiscussionDAO duscussion = AllFactory.getDAOInstance4();
		ValidationDAO valid = AllFactory.validation();
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter 1 for login");
		sc.nextInt();
		String emailId = ValidationController.emailId();
		String password = ValidationController.password();

		bean = dao.getLogin(emailId, password);
		System.out.println("Logged in sucessfully");
		userInfo();
		return true;
	}

	public static void userInfo() {
		Scanner sc = new Scanner(System.in);
		DiscussionDAO duscussion = AllFactory.getDAOInstance4();

		if (bean != null) {
			System.out.println("Enter 1 to Display all products");
			System.out.println("Enter 2 to Add products in Cart");
			System.out.println("Enter 3 to insert questions \nEnter 4 To logout");
			try {
				int option = sc.nextInt();

				switch (option) {
				case 1:
					GetAllProduct.getAllProduct();
					System.out.println("Add product to cart");

				case 2:
					AddToCartDAO cart = AllFactory.getDAOInstance3();
					Cart.addCart();

					break;
				case 3:
					duscussion.insertQusetion(bean.getUserId());
				case 4:
					System.out.println("Logged out successfully....");
					System.out.println("-------------------------------------");
					Operation.startMedical();
					break;
				default:
					System.out.println("Enter valid number");

				}
			} catch (InputMismatchException e) {
				System.out.println("Enter valid value");

			}

		}
		userInfo();
	}

}// End of class
