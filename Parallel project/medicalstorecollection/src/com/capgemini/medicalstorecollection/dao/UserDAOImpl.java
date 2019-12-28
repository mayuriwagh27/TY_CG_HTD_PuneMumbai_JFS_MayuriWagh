package com.capgemini.medicalstorecollection.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.capgemini.medicalstorecollection.beans.AdminBean;
import com.capgemini.medicalstorecollection.beans.ProductBean;
import com.capgemini.medicalstorecollection.beans.UserBean;
import com.capgemini.medicalstorecollection.controller.MainTest;
import com.capgemini.medicalstorecollection.controller.Operation;

public class UserDAOImpl implements UserDAO {
	Scanner sc = new Scanner(System.in);
	UserBean userbean;
	public static List<UserBean> userList;
	static {
		userList = new ArrayList<UserBean>();
		UserBean user1 = new UserBean();
		user1.setUserId(1);
		user1.setUserName("sakshi");
		user1.setEmailId("sakshi@gmail.com");
		user1.setPassword("sakshi");
		userList.add(user1);

		UserBean user2 = new UserBean();
		user2.setUserId(2);
		user2.setUserName("Aniket");
		user2.setEmailId("aniket@gmail.com");
		user2.setPassword("aniket");
		userList.add(user2);

		UserBean user3 = new UserBean();
		user3.setUserId(3);
		user3.setUserName("Pranjali");
		user3.setEmailId("pranjalit@gmail.com");
		user3.setPassword("pranjali");
		userList.add(user3);
	}// End of static

	@Override
	public UserBean getLogin(String emailId, String password) {
		for (UserBean user : userList) {
			if (user.getEmailId().equals(emailId)) {
				if (user.getPassword().equals(password)) {
					this.userbean = user;
					break;

				} // End of if

			} // End of if

		} // End of for

		return userbean;
	}// End of getLogin()

	@Override
	public List<UserBean> registeUser(UserBean userBean) {
		userList.add(userBean);
		return userList;
	}// end of registeUser()

	@Override
	public List<UserBean> userList() {
		return userList;
	}

	@Override
	public boolean logout() {
		System.out.println("Logged out successfilly...");
		System.out.println("Thank you");
		Operation.startMedical();
		return false;
	}

	@Override
	public void updatePassword(int userId) {
		for (UserBean user : userList) {
			if (user.getUserId() == userId) {
				System.out.println("Enter new password");
				String password = sc.next();
				user.setPassword(password);
				System.out.println("Passowrd has been updated");
			}
		}

	}
}// End of class
