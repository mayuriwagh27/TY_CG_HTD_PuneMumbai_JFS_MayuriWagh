package com.capgemini.medicalstorecollection.controller;

import java.util.List;
import java.util.Scanner;

import com.capgemini.medicalstorecollection.beans.ProductBean;
import com.capgemini.medicalstorecollection.dao.ProductDAO;
import com.capgemini.medicalstorecollection.factory.AllFactory;

public class InsertProduct {
	public static void insertProduct() {
		ProductDAO productDAO = AllFactory.getDAOInstance();
		ProductBean productBean = new ProductBean();
		Scanner sc = new Scanner(System.in);
		int id = ValidationController.id();
		productBean.setProductid(id);
		String name = ValidationController.name();
		productBean.setProductname(name);
		String category = ValidationController.category();
		productBean.setCatagory(category);
		System.out.println("Enter price");
		productBean.setPrice(sc.nextDouble());
		System.out.println("Enter Availability of product");
		productBean.setAvailability(sc.next());
		sc.nextLine();
		List<ProductBean> result = productDAO.insertProduct(productBean);
		if (result != null) {
			System.out.println("Product inserted successfully....");
			System.out.println("Enter 1 to display all products");
			int input = sc.nextInt();
			switch (input) {
			case 1:
				GetProducts.getProduct();
				break;

			}

		} else {
			System.out.println("Something went wrong....");
		}
	}// end of insertProduct()
}// End of class
