package com.capgemini.jpamedicalstore.controller;

import java.util.List;

import com.capgemini.jpamedicalstore.bean.UserLoginBean;
import com.capgemini.jpamedicalstore.dao.AdminDAO;
import com.capgemini.jpamedicalstore.factory.AllFactory;

public class GetUsers {
	static AdminDAO adminDao = AllFactory.getAdminInstance();

	public static void getAllUsers() {
		List<UserLoginBean> usersList = adminDao.getAllUsers();
		System.out.println("*****************************************************************");
		System.out.printf("%10s %20s %20s", "User ID", "User Name", "User Email-id");
		System.out.println();
		System.out.println("*****************************************************************");
		for (UserLoginBean user : usersList) {
			System.out.format("%10s %20s %20s", user.getId(), user.getName(), user.getEmail());
			System.out.println();
		}
		System.out.println("*****************************************************************");
	}

}// End of class
