package com.capgemini.medicalstore.controller;

import java.util.InputMismatchException;
import java.util.Scanner;

import com.capgemini.medicalstore.bean.AdminBean;
import com.capgemini.medicalstore.dao.AdminDAO;
import com.capgemini.medicalstore.dao.ProductDAOImpl;
import com.capgemini.medicalstore.dao.UserDAO;
import com.capgemini.medicalstore.factory.AllFactory;

public class GetAdminLogin {
	static Scanner sc = new Scanner(System.in);
	static UserDAO userdao = AllFactory.getDAOInstance2();

	public static boolean getLogin() {
		AdminDAO dao = AllFactory.getDAOInstance1();
		String emailId = ValidationController.emailId();
		String password = ValidationController.password();
		AdminBean bean = dao.getLogin(emailId, password);

		if (bean != null) {
			return true;
		} else {
			return false;
		}
	}// End of getLogin

	public static void productOperation() {
		try {
			System.out.println("Enter a: To continue \n Enter b: to logout");
			String choice = sc.next();
			switch (choice) {
			case "a":
				System.out.println(
						" Enter A: To see All products  \n Enter B: To Add products \n Enter C: To remove products \n Enter D: To udpate products");
				ProductDAOImpl impl = new ProductDAOImpl();

				String crud = sc.next();

				switch (crud) {

				case "A":
					GetAllInfo.getAllInfo();

				case "B":
					AddProduct.addProduct();
					break;

				case "C":
					impl.deleteProduct();
					break;

				case "D":
					impl.updateproduct();
					break;
				default:
					System.out.println("Please enter valid input");
					productOperation();
				}
				break;
			case "b":
				userdao.logout();
				System.out.println("Logged out successfully!!");
				Operation.startMedical();
				break;
			default:
				System.out.println("Please Enter valid input");
				productOperation();
			}
		} catch (InputMismatchException e) {
			System.out.println("Enter valid value");
		}
		Operation.startMedical();
	}// End of productOperation
}// End of class
