package com.capgemini.medicalstorecollection.controller;

import java.util.InputMismatchException;
import java.util.Scanner;

import com.capgemini.medicalstorecollection.dao.AdminDAO;
import com.capgemini.medicalstorecollection.dao.DiscussionDAO;
import com.capgemini.medicalstorecollection.factory.AllFactory;

public class AdminOperation {
	public static void admin() {
		DiscussionDAO discussionDAO = AllFactory.getDAOInstance4();
		AdminDAO admindao = AllFactory.getDAOInstance1();
		Scanner s = new Scanner(System.in);
		try {
			System.out.println(
					"Enter: A to see all products \n Enter B: to Insert Product \n Enter C : to Update product \n Enter D : to Delete product"
							+ "\n Enter E : to Insert answers \n Enter F: to delete user");
			String choice;
			choice = s.next();
			switch (choice) {
			case "A":
				GetProducts.getProduct();

			case "B":
				InsertProduct.insertProduct();
				break;

			case "C":
				UpdateProduct.UpdateProduct();
				GetProducts.getProduct();
				break;

			case "D":
				DeleteProduct.deleteProduct();
				break;

			case "E":
				System.out.println("Enter Message Id to ehich you want to answer");
				int messageId = s.nextInt();
				discussionDAO.insertAnswer(messageId);
				System.out.println("Answer Added successfully....");

			case "F":
				GetUsers.getUsers();
				System.out.println("Enter userId to delete that user...");
				int userId = s.nextInt();
				boolean result = admindao.deleteUser(userId);
				if (result) {
					System.out.println("user deleted");
				} else {
					System.err.println("Wrong");
				}
				break;
			default:
				System.err.println("Enter valid value");
				admin();

			}
		} catch (InputMismatchException e) {
			System.err.println("Enter valid value");
			admin();
		}
	}
}// End of class
