package com.capgemini.medicalstorecollection.controller;

import java.util.List;

import com.capgemini.medicalstorecollection.beans.UserBean;
import com.capgemini.medicalstorecollection.dao.AdminDAO;
import com.capgemini.medicalstorecollection.dao.UserDAO;
import com.capgemini.medicalstorecollection.dao.UserDAOImpl;
import com.capgemini.medicalstorecollection.factory.AllFactory;

public class GetUsers {
	public static void getUsers() {
		UserDAO userDAO = AllFactory.getDAOInstance2();
		List<UserBean> userList = userDAO.userList();
		System.out.println("User Id  \t  User name  \t Email Id");
		for (UserBean userBean : userList) {
			System.out.print(" \t" + userBean.getUserId() + "\t");
			System.out.print("  " + userBean.getUserName() + "\t");
			System.out.println("\t " + userBean.getEmailId());

		}

	}// End of getUsers()
}// End of class