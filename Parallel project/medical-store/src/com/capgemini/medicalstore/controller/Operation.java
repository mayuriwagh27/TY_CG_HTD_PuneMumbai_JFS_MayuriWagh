package com.capgemini.medicalstore.controller;

import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

import com.capgemini.medicalstore.bean.DiscussionBean;
import com.capgemini.medicalstore.dao.AdminDAOImpl;
import com.capgemini.medicalstore.dao.DiscussionDAOImpl;
import com.capgemini.medicalstore.dao.ProductDAOImpl;
import com.capgemini.medicalstore.dao.UserDAO;
import com.capgemini.medicalstore.factory.AllFactory;

public class Operation {
	public static void startMedical() {
		UserDAO userdao = AllFactory.getDAOInstance2();

		Scanner s = new Scanner(System.in);

		DiscussionDAOImpl question = new DiscussionDAOImpl();
		try {
			int option;
			System.out.println("*********WELCOME TO ONLINE MEDICAL STORE***********");
			System.out.println("Enter 1: To login as admin  \n Enter 2: to See all products\n "
					+ "Enter 3: To Get all users \n Enter 4: To delete user \n Enter 5: To see all questions \n Enter 6:to register as user \n "
					+ "Enter 7: to Login as user \n Enter 8: to change password ");
			option = s.nextInt();

			switch (option) {

			case 1:
				if (GetAdminLogin.getLogin()) {
					System.out.println("Logged in successfully");
				} else {
					System.err.println("Invalid login password or email");
					GetAdminLogin.getLogin();

				}
			case 2:
				GetAllProduct.getAllProduct();
				GetAdminLogin.productOperation();

				break;
			case 3:
				GetAllUsers.getAllUsers();
				break;

			case 4:
				AdminDAOImpl impl = new AdminDAOImpl();
				System.out.println("Enter UserId");
				int userId = s.nextInt();
				impl.deleteUser(userId);
				break;

			case 5:

				question.getQuestion();
				System.out.println("Message Id | User Id |   Question   ");
				List<DiscussionBean> discussionList = question.getQuestion();

				for (DiscussionBean li : discussionList) {
					System.out.print("    " + li.getMessageId());
					System.out.print("          " + li.getuserId());
					System.out.println("         " + li.getQuestion());
				}
				System.out.println("----------------------------------");
				System.out.println("Enter Message Id to answer the question");
				int msgId = s.nextInt();
				question.answerquestion(msgId);
				break;

			case 6:
				userdao.getRegister();
			case 7:

				GetUserLogin.getLogin();
				break;

			case 8:
				userdao.updatePassword();
				break;

			default:
				System.out.println("Enter valid input");
			}
		} catch (InputMismatchException e) {
			System.out.println("Enter valid value");
		}
		startMedical();
	}

}// End of class
