package com.capgemini.medicalstore.controller;

import java.util.Scanner;

import com.capgemini.medicalstore.factory.AllFactory;
import com.capgemini.medicalstore.validation.ValidationDAO;

public class ValidationController {
	static ValidationDAO valid = AllFactory.validation();
	static Scanner sc = new Scanner(System.in);
	static String emailId;
	static String password;
	static String category;
	static String name;

	public static String emailId() {

		System.out.println("Enter email id");
		emailId = sc.nextLine();
		// sc.next();
		if (valid.emailValidation(emailId) == false) {
			System.out.println("please Enter valid email");
			emailId();
			
		}
		return emailId;
	}// End of emailId()

	public static String password() {
		System.out.println("Enter Padssword");
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
}// End of class
