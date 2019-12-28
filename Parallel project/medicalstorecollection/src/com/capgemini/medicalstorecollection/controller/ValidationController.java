package com.capgemini.medicalstorecollection.controller;

import java.util.Scanner;

import com.capgemini.medicalstorecollection.factory.AllFactory;
import com.capgemini.medicalstorecollection.validation.ValidationDAO;

public class ValidationController {
	static ValidationDAO valid = AllFactory.getDAOInstance5();
	static Scanner sc = new Scanner(System.in);
	static String emailId;
	static String password;
	static String category;
	static String name;
	static String id;
	static String price;

	public static String emailId() {

		System.out.println("Enter email id");
		emailId = sc.nextLine();
		// sc.next();
		if (valid.emailValidation(emailId) == false) {
			System.err.println("please Enter valid email");
			emailId();

		}
		return emailId;
	}// End of emailId()

	public static String password() {
		System.out.println("Enter Padssword");
		password = sc.nextLine();
		if (valid.passValidation(password) == false) {
			System.err.println("Please Enter valid password");
			password();
		}
		return password;
	}

	public static String category() {
		System.out.println("Enter Category");
		category = sc.nextLine();
		if (valid.categoryValidation(category) == false) {
			System.err.println("Please enter valid category");
			category();
		}
		return category;
	}

	public static String name() {
		System.out.println("Enter name");
		name = sc.nextLine();
		if (valid.nameValidation(name) == false) {
			System.err.println("Please enter valid name");
			name();
		}
		return name;
	}

	public static int id() {
		System.out.println("Enter product Id to be added");
		id = sc.nextLine();
		if (valid.idValidation(id) == false) {
			System.err.println("Please enter valid value");
			id();
		}
		return Integer.parseInt(id);
	}

	// public static
}// End of class
