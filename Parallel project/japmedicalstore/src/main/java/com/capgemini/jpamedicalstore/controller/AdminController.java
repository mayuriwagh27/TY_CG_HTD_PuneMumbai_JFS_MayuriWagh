package com.capgemini.jpamedicalstore.controller;

import java.util.Scanner;

import com.capgemini.jpamedicalstore.bean.ProductBean;
import com.capgemini.jpamedicalstore.bean.UserLoginBean;
import com.capgemini.jpamedicalstore.dao.AdminDAO;
import com.capgemini.jpamedicalstore.dao.DiscussionDAO;
import com.capgemini.jpamedicalstore.dao.ProductDAO;
import com.capgemini.jpamedicalstore.dao.UserDAO;
import com.capgemini.jpamedicalstore.factory.AllFactory;

public class AdminController {
	static AdminDAO adminDao = AllFactory.getAdminInstance();
	static DiscussionDAO discussionDAO = AllFactory.getDiscussionInstance();
	static ProductDAO productDAO = AllFactory.getProductInstance();
	static UserDAO dao = AllFactory.getUserInstance();
	static Scanner sc = new Scanner(System.in);
	static ValidationController valid = new ValidationController();
	static boolean b;
	static UserLoginBean user;

	public static void addProduct() {
		System.out.println("To add product");
		ProductBean product = new ProductBean();
		String name = valid.name();
		String category = valid.category();
		System.out.println("Enter price");
		String priceInput = sc.nextLine();
		double price = sc.nextDouble();
		System.out.println("Enter quantity");
		sc.nextLine();
		int quantity = sc.nextInt();
		System.out.println("Enter Availability");
		String available = sc.nextLine();
		product.setName(name);
		product.setCategory(category);
		product.setPrice(price);
		product.setQuantity(quantity);
		product.setAvailability(available);
		if (productDAO.addProduct(product)) {
			System.out.println("New Products list");
			GetProductList.getAllProducts();
		} else {
			System.out.println("Product not added");
		}
	}// End of addProduct()

	public static void adminOperation() {
		System.out.println("Enter 1 to see all products \n Enter 2 to add product \n Enter 3 Delete product"
				+ "\n Enter 4 to update product \n Enter 5 to get userlist  \n Enter 6 to see questions \n Enter 7 to logout");

		String option = sc.next();
		try {
			switch (option) {
			case "1":
				GetProductList.getAllProducts();
				break;
			case "2":
				AdminController.addProduct();
				break;
			case "3":
				System.out.println("Enter product id to delete");
				int pid = sc.nextInt();
				productDAO.deleteProduct(pid);
				break;
			case "4":
				System.out.println("To update Product");
				ProductBean product = new ProductBean();
				System.out.println("Enter product id");
				int productId = sc.nextInt();
				System.out.println("Enter new product name");
				String name = sc.next();
				System.out.println("Enter new product price");
				double price = sc.nextDouble();
				System.out.println("Enter quantity");
				int quantity = sc.nextInt();
				productDAO.updateProduct(productId, name, price, quantity);
				System.out.println("Product updated successfully....");
				break;
			case "5":
				GetUsers.getAllUsers();
				break;
			case "6":
				Discussion.listQuestion();
				break;
			case "7":
				System.out.println("Logged out successfully");
				Operation.medical();
			default:

			}// End of switch
		} catch (Exception e) {
			System.out.println("please enter valid value");
			adminOperation();
		}

	}

}// End of class
