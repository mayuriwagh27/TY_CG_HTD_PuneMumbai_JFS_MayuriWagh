package com.capgemini.medicalstore.controller;

import java.util.Scanner;

import com.capgemini.medicalstore.bean.AddToCartBean;
import com.capgemini.medicalstore.bean.ProductBean;
import com.capgemini.medicalstore.dao.AddToCartDAO;
import com.capgemini.medicalstore.dao.AddToCartDAOImpl;
import com.capgemini.medicalstore.factory.AllFactory;

public class Cart {

	public static void addCart() {
		AddToCartBean bean = new AddToCartBean();
		AddToCartDAO cart = AllFactory.getDAOInstance3();

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter how many medicines you want");
		int number = sc.nextInt();
		for (int i = 1; i <= number; i++) {
			AddToCartDAO dao = AllFactory.getDAOInstance3();
			ProductBean product = new ProductBean();
			Scanner s = new Scanner(System.in);
			System.out.println("Enter product_id");
			int id = s.nextInt();
			boolean result = dao.addProduct(id);
			if (result) {
				System.out.println("Product Added");

			} else {
				System.out.println("Enter Valid Id");
			}
		}
		System.out.println("Entey Y to get bill \n Enter N to delete product from cart");
		String option;
		option = sc.next();
		switch (option) {
		case "Y":
			Cart.bill();
			break;
		case "N":
			cart.removeFormCart();
			Cart.bill();
			break;
		}

	}// End of addCart()

	public static void bill() {
		AddToCartDAO dao = AllFactory.getDAOInstance3();
		AddToCartBean bean = new AddToCartBean();
		int userId = GetUserLogin.bean.getUserId();
		System.out.println(userId);
		double i = bean.getPrice();
		double result = dao.getbill(userId);
		if (result > 0) {
			System.out.println("Your total bill is : " + result);
			AddToCartDAOImpl.payment();
		} else {
			System.out.println("Something went wrong");
		}
	}// End of bill()
}// End of class
