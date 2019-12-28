package com.capgemini.medicalstore.dao;

import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Properties;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.capgemini.medicalstore.bean.AddToCartBean;
import com.capgemini.medicalstore.controller.Cart;
import com.capgemini.medicalstore.factory.AllFactory;

public class AddToCartDAOImpl implements AddToCartDAO {
	UserDAO userDAO = AllFactory.getDAOInstance2();
	Connection connection = null;
	PreparedStatement preparedStatement = null;
	FileReader reader = null;
	Statement statement = null;
	Properties property = null;
	ResultSet resultSet = null;
	AddToCartBean bean;

	Scanner sc = new Scanner(System.in);

	public AddToCartDAOImpl() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			reader = new FileReader("db.properties");
			property = new Properties();

			property.load(reader);
		} catch (Exception e) {
			e.printStackTrace();

		}
	}

	@Override
	public boolean addProduct(int id) {
		boolean add = false;
		try (Connection connection = DriverManager.getConnection(property.getProperty("dbUrl"),
				property.getProperty("user"), property.getProperty("password"))) {

			preparedStatement = connection.prepareStatement(property.getProperty("query10"));
			preparedStatement.setInt(1, id);

			int count = preparedStatement.executeUpdate();
			if (count > 0) {
				add = true;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		return add;

	}

	@Override
	public void removeFormCart() {
		try (Connection connection = DriverManager.getConnection(property.getProperty("dbUrl"),
				property.getProperty("user"), property.getProperty("password"))) {
			preparedStatement = connection.prepareStatement(property.getProperty("query11"));
			System.out.println("Enter Product_id");
			preparedStatement.setInt(1, sc.nextInt());
			int count = preparedStatement.executeUpdate();

			if (count > 0) {
				System.out.println("product removed from cart");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	@Override
	public double getbill(double price) {
		double bill = 0;
		try (Connection connection = DriverManager.getConnection(property.getProperty("dbUrl"),
				property.getProperty("user"), property.getProperty("password"))) {
			Statement statement = connection.createStatement();
			ResultSet resultSet = statement.executeQuery(property.getProperty("query12"));
			if (resultSet.next()) {
				bill = resultSet.getDouble(1);

			} else {
				System.out.println("Enter correct number");
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		return bill;
	}

	public static void payment() {
		UserDAO userdao = new UserDAOImpl();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1: for Online payment \n Enter 2: for cash on delivary \n Enter 3: to logout");
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
						dao.logout();

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
			userdao.logout();
			System.out.println("Logged out successfully....");

			break;

		case 3:
			userdao.logout();
		}
	}

}
