package com.capgemini.medicalstorecollection.controller;

import java.util.List;
import java.util.Scanner;

import com.capgemini.medicalstorecollection.beans.UserBean;
import com.capgemini.medicalstorecollection.dao.UserDAO;
import com.capgemini.medicalstorecollection.factory.AllFactory;

public class UserRegister {
	public static List<UserBean> userList;

	public static void userRegister() {
		UserDAO userDAO = AllFactory.getDAOInstance2();
		UserBean userBean = new UserBean();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter userId");
		int userId = sc.nextInt();
		userBean.setUserId(userId);
		sc.nextLine();

		String name = ValidationController.name();
		userBean.setUserName(name);

		String email = ValidationController.emailId();
		userBean.setEmailId(email);

		String password = ValidationController.password();
		userBean.setPassword(password);
		List<UserBean> result = userDAO.registeUser(userBean);
		if (result != null) {
			System.out.println("Registered successfully....");
		} else {
			System.out.println("Something went wrong");
		}

	}// end of userRegister()
}// end of class
