package com.capgemini.medicalstorecollection.controller;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.capgemini.medicalstorecollection.dao.UserDAO;
import com.capgemini.medicalstorecollection.dao.UserDAOImpl;

public class Payment {
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

			sc.nextLong();
			System.out.println("You will receive your product soon...");
			userdao.logout();
			break;

		case 3:
			userdao.logout();
		}// End of switch

	}// End of payment()
}// End of class
