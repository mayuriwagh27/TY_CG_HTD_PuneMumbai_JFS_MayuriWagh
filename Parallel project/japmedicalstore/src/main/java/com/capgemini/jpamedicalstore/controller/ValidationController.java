package com.capgemini.jpamedicalstore.controller;

import java.util.Scanner;

import com.capgemini.jpamedicalstore.factory.AllFactory;
import com.capgemini.jpamedicalstore.validation.ValidationDAO;

public class ValidationController {
	static ValidationDAO valid = AllFactory.getValidInstance();
	static Scanner sc = new Scanner(System.in);
	static String emailId;
	static String password;
	static String category;
	static String name;
	static String role;
	static String input;

	public static String emailId() {

		System.out.println("Enter email id");
		emailId = sc.nextLine();
		if (valid.emailValidation(emailId) == false) {
			System.out.println("please Enter valid email");
			emailId();

		}
		return emailId;
	}// End of emailId()

	public static String password() {
		System.out.println("Enter Password");
		password = sc.nextLine();
		if (valid.passValidation(password) == false) {
			System.out.println("Please Enter valid password");
			password();
		}
		return password;
	}

	public static String category() {
		System.out.println("Enter Category");
		category = sc.nextLine();
		if (valid.categoryValidation(category) == false) {
			System.out.println("Please enter valid category");
			category();
		}
		return category;
	}

	public static String name() {
		System.out.println("Enter name");
		name = sc.nextLine();
		if (valid.nameValidation(name) == false) {
			System.out.println("Please enter valid name");
			name();
		}
		return name;
	}
	
	public static int input() {
		input = sc.nextLine();
		if (valid.numberValidaton(input) == false) {
			System.out.println("Please enter valid input");
			input();
		}
		return Integer.parseInt(input);
	}

//	public static String role() {
//		System.out.println("Enter role");
//		role = sc.nextLine();
//		if (role == "admin" | role == "user") {
//			System.out.println("Successful");
//		} else {
//			System.out.println("please enter valid role");
//			role();
//		}
//		return role;
//	}

}// End of class
