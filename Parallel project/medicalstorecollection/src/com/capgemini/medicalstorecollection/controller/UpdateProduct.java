package com.capgemini.medicalstorecollection.controller;

import java.util.Scanner;

import com.capgemini.medicalstorecollection.beans.ProductBean;
import com.capgemini.medicalstorecollection.dao.ProductDAO;
import com.capgemini.medicalstorecollection.factory.AllFactory;

public class UpdateProduct {
public static void UpdateProduct() {
	ProductDAO productDAO = AllFactory.getDAOInstance();
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter product Id");
	int productid = sc.nextInt();
	System.out.println("Enter price");
	double price = sc.nextDouble();
	System.out.println("Enter Availability");
	String availability = sc.next();
	ProductBean result = productDAO.updateProduct(productid, price, availability);
if(result != null) {
	System.out.println("Data updated successfully");
	productDAO.getAllInfo();
	} else {
		System.out.println("Something went wrong");
	}
}//End of UpdateProduct()
}//End of class
