package com.capgemini.medicalstorecollection.controller;

import java.util.Scanner;

import com.capgemini.medicalstorecollection.dao.ProductDAO;
import com.capgemini.medicalstorecollection.factory.AllFactory;

public class DeleteProduct {
	public static void deleteProduct() {
		ProductDAO productDAO = AllFactory.getDAOInstance();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter product Id which you want to delete");
		int productId = sc.nextInt();
		boolean result = productDAO.deleteProduct(productId);
		if (result) {
			System.out.println("Product deleted successfully....");
			GetProducts.getProduct();
		} else {
			System.out.println("Unable to delete Product");
			deleteProduct();
		}
	}// End of deleteProduct()
}// end of class
