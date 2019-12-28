package com.capgemini.medicalstorecollection.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.capgemini.medicalstorecollection.beans.CartBean;
import com.capgemini.medicalstorecollection.beans.ProductBean;
import com.capgemini.medicalstorecollection.beans.UserBean;
import com.capgemini.medicalstorecollection.dao.CartDAO;
import com.capgemini.medicalstorecollection.dao.ProductDAO;
import com.capgemini.medicalstorecollection.dao.UserDAO;
import com.capgemini.medicalstorecollection.factory.AllFactory;

public class AddToCart {
	static List<CartBean> cartList = new ArrayList<CartBean>();
	static double totalBill = 0;

	public static void addToCart(UserBean user) {
		UserBean userbean = Operation.user;
		UserDAO userDAO = AllFactory.getDAOInstance2();
		CartDAO cartDao = AllFactory.getDAOInstance3();
		ProductDAO productDAO = AllFactory.getDAOInstance();
		Payment payment = new Payment();

		Scanner s = new Scanner(System.in);
		System.out.println("Enter How Many Products You want to Add to Cart");
		int count = s.nextInt();
		for (int i = 1; i <= count; i++) {
			System.out.println("Enter Product Id");
			int productId = s.nextInt();
			ProductBean productBean = productDAO.oneProduct(productId);

			cartList = cartDao.addCart(user, productBean);
			productDAO.updateQuantity(productBean);

		}
		System.out.println(
				"Cart ID \t User ID \t User Name \t Product Id \t Product Name \t " + "Product Category \t Price");
		for (CartBean cartBean : cartList) {
			System.out.print(cartBean.getCartid() + "\t");
			System.out.print("\t " + userbean.getUserId() + "\t");
			System.out.print("\t  " + userbean.getUserName() + "\t");
			System.out.print("\t   " + cartBean.getProductid() + "\t");
			System.out.print("\t  " + cartBean.getProductname());
			System.out.print("\t  " + cartBean.getCategory() + "\t");
			System.out.println("\t " + cartBean.getPrice() + "\t");
			totalBill += cartBean.getPrice() * cartBean.getQuantity();

		}
		System.out.println(" Enter 1 To get Bill \n Enter 2 to Delete Product from Cart " + "\n Enter 3 to Logout");
		int userInput = s.nextInt();
		switch (userInput) {
		case 1:
			System.out.println("Your Total Bill is " + totalBill);
			System.out.println("Enter Y to Continue \n Enter N to Logout");
			char input = s.next().charAt(0);
			switch (input) {
			case 'Y':
				payment.payment();
				break;
			case 'N':
				Operation.startMedical();
				break;
			}// end of inner switch
			break;
		case 2:
			DeleteFromCart.delete();
			break;
		case 3:
			userDAO.logout();
			break;
		default:
			System.out.println("Wrong Credentials");
			addToCart(user);
		}// ENd of switch
	}// end of addToCart()
}// End of class
