package com.capgemini.medicalstorecollection.controller;

import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

import com.capgemini.medicalstorecollection.beans.AdminBean;
import com.capgemini.medicalstorecollection.beans.DiscussionBean;
import com.capgemini.medicalstorecollection.beans.ProductBean;
import com.capgemini.medicalstorecollection.beans.UserBean;
import com.capgemini.medicalstorecollection.dao.AdminDAO;
import com.capgemini.medicalstorecollection.dao.DiscussionDAO;
import com.capgemini.medicalstorecollection.dao.ProductDAO;
import com.capgemini.medicalstorecollection.dao.UserDAO;
import com.capgemini.medicalstorecollection.dao.UserDAOImpl;
import com.capgemini.medicalstorecollection.factory.AllFactory;

public class Operation {
	public static UserBean user;

	public static void startMedical() {
		DiscussionDAO discussionDAO = AllFactory.getDAOInstance4();
		AdminDAO admindao = AllFactory.getDAOInstance1();
		UserDAO userdao = AllFactory.getDAOInstance2();
		UserDAOImpl userimpl = new UserDAOImpl();
		List<UserBean> userlist = userimpl.userList;

		Scanner s = new Scanner(System.in);
		ProductDAO productDAO = AllFactory.getDAOInstance();
		ProductBean bean = new ProductBean();
		UserBean userBean = new UserBean();
		try {
			int option;
			boolean a = true;
			System.out.println("**************WELCOME TO ONLINE MEDICAL STORE*****************");
			System.out.println("Enter 1: Admin login   \n Enter 2 : To register as user \n Enter 3 : To login as user "
					+ "\n Enter 4: to see all products");
			option = s.nextInt();

			switch (option) {
			case 1:
				while (a) {

					String emailId = ValidationController.emailId();

					String password = ValidationController.password();
					AdminBean admin = admindao.getLogin(emailId, password);
					if (admin != null) {
						System.out.println("Logged in successfully....");
						a = false;
					} else {
						System.err.println("You may have entered wrong crendentials...");
					}
				}
				AdminOperation.admin();
				break;

			case 2:
				UserRegister.userRegister();

			case 3:
				boolean b = true;
				while (b) {

					String emailId = ValidationController.emailId();

					String password = ValidationController.password();
					user = userdao.getLogin(emailId, password);
					if (user != null) {
						System.out.println("Logged in successfully....");
						b = false;
					} else {
						System.out.println("You may have entered wrong crendentials...");
					}
				}
				System.out.println(
						"Enter A to see all products \n Enter B to update password \n Enter C to ask questions about products \n Enter D to logout");

				String select;
				select = s.next();
				switch (select) {
				case "A":
					GetProducts.getProduct();
					AddToCart.addToCart(userBean);
					break;

				case "B":
					userdao.updatePassword(user.getUserId());
					Operation.startMedical();

					break;

				case "C":
					discussionDAO.insertQusetion(user.getUserId());
					System.out.println("Question insertes successfully...");
					List<DiscussionBean> List = discussionDAO.getQuestion();
					System.out.println("**************************************************************");
					System.out.printf("%10s %20s %30s", "Mesage Id", "UserId", "question");
					System.out.println();
					System.out.println("**************************************************************");
					for (DiscussionBean discussionbean : List) {
						System.out.format("%10s %20s %30s", discussionbean.getMessageId(), discussionbean.getUserId(),
								discussionbean.getQuestion());
						System.out.println();
						System.out.println("**************************************************************");
					}
					break;

				case "D":
					userdao.logout();
				}
				break;

			case 4:
				GetProducts.getProduct();
				break;

			default:
				System.out.println("Enter valid number");

			}// End of switch
		} catch (InputMismatchException e) {
			System.out.println("Enter valid value");
		}

		startMedical();
	}// End of startMedical()

}// End of class
