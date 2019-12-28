package com.capgemini.medicalstore.controller;

import java.util.Scanner;

import com.capgemini.medicalstore.bean.ProductBean;
import com.capgemini.medicalstore.dao.ProductDAO;
import com.capgemini.medicalstore.factory.AllFactory;
import com.capgemini.medicalstore.validation.ValidationDAO;

public class AddProduct {
	public static void addProduct() {
		ValidationDAO valid = AllFactory.validation();
		ProductDAO dao = AllFactory.getDAOInstance();
		ProductBean product = new ProductBean();
		Scanner sc = new Scanner(System.in);

		String category = ValidationController.category();
		product.setCatagory(category);

		System.out.println("enter name");
		String product_name = sc.next();

		System.out.println("price");
		double price = sc.nextDouble();
		System.out.println("availablity");
		String availability = sc.next();

		product.setAvailability(availability);

		product.setPrice(price);
		product.setProduct_name(product_name);

		boolean res = dao.addProduct(product);
		if (res) {
			System.out.println("Product added");
		} else {
			System.out.println("something went wrong");
		}
	}

}// End of class
