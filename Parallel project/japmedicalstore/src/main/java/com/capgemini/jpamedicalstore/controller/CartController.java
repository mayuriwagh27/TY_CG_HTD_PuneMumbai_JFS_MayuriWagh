package com.capgemini.jpamedicalstore.controller;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.capgemini.jpamedicalstore.bean.CartBean;
import com.capgemini.jpamedicalstore.bean.ProductBean;
import com.capgemini.jpamedicalstore.bean.UserLoginBean;
import com.capgemini.jpamedicalstore.dao.CartDAO;
import com.capgemini.jpamedicalstore.dao.UserDAO;
import com.capgemini.jpamedicalstore.dao.UserDAOImpl;
import com.capgemini.jpamedicalstore.factory.AllFactory;

public class CartController {
	static UserDAO userdao = AllFactory.getUserInstance();
	static CartDAO cartdao = AllFactory.getCartInstance();
	static UserLoginBean user;
	static ProductBean productBean;
	static CartBean cartBean;
	static Scanner s = new Scanner(System.in);
	static int quantity;

	public static void addToCart() {
		System.out.println("How many products you want?");
		int products = s.nextInt();
		if (products != 0) {
			while (products != 0) {

				productBean = cartdao.getProduct();
				System.out.println("Enter quantity you want to buy for " + productBean.getName());
				quantity = s.nextInt();
				if (productBean != null) {
					System.out.println("Product successfully added to cart");
					System.out.println("Enter 1 for payment \n Enter 2 to add another product in cart");
					int choice = s.nextInt();
					switch (choice) {
					case 1:
						CartController.doPayment();
						break;
					case 2:
						CartController.addToCart();
						break;
					}
				}

				if (quantity < productBean.getQuantity()) {
					cartBean = new CartBean();
					cartBean.setProductid(productBean.getProductid());
					cartBean.setProductname(productBean.getName());
					cartBean.setUserid(Operation.user.getId());
					cartBean.setUsername(Operation.user.getName());
					cartBean.setPrice(productBean.getPrice() * quantity);
					cartBean.setQuantity(quantity);
					boolean isInserted = cartdao.addToCart(cartBean);
					cartdao.updateQuantity(quantity, productBean);
				} else {
					System.out.println("Quantity which you want to buy is not available...\n Available quamtity is "
							+ productBean.getQuantity());

				}
				products--;
			}
		}
	}// End of addProduct()

	public static void doPayment() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Your total bill is " + cartdao.payment(Operation.user.getId()));
		System.out.println("Enter 1: for Online payment \n Enter 2: for cash on delivary");
		int option = sc.nextInt();
		switch (option) {
		case 1:

			System.out.println("For payment please enter your 16 digit card number");
			Pattern pat = Pattern.compile("\\d{16}");
			long number = sc.nextLong();
			String str = Long.toString(number);
			Matcher match = pat.matcher(str);
			if (match.matches()) {
				System.out.println("Enter your 3 digit CW number");
				Pattern pat2 = Pattern.compile("\\d{3}");
				int m = sc.nextInt();
				String str2 = Integer.toString(m);
				Matcher match2 = pat2.matcher(str2);
				if (match2.matches()) {
					System.out.println("Transaction is successfull....");
					System.out.println("Enter 1 to logout");
					int i = sc.nextInt();
					if (i == 1) {
						UserDAO dao = new UserDAOImpl();

					} else {
						System.out.println("Enter correct number");
					}
				} else {
					System.out.println("Sorry for inconvience");
				}
			}
			break;

		case 2:
			System.out.println("Enter your address..");
			String address = sc.next();
			System.out.println("Enter your mobile number...");
			long mobile = sc.nextLong();
			System.out.println("You will receive your product soon...");
			System.out.println("Logged out successfully....");

			break;

		}

	}
}// End of controller
