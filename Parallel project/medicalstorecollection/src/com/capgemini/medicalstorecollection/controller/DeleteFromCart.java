package com.capgemini.medicalstorecollection.controller;

import java.util.List;
import java.util.Scanner;

import com.capgemini.medicalstorecollection.beans.CartBean;
import com.capgemini.medicalstorecollection.dao.CartDAO;
import com.capgemini.medicalstorecollection.factory.AllFactory;

public class DeleteFromCart {
	public static void delete() {
		CartDAO cartDAO = AllFactory.getDAOInstance3();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter cart Id which you want to delete");
		int cartId = sc.nextInt();
		List<CartBean> li = cartDAO.deleteCart(cartId);
		if (li != null) {
			System.out.println("Product deleted from cart successfully....");
		} else {
			System.out.println("Failed to delete product from cart.....");
		}
	}
}
