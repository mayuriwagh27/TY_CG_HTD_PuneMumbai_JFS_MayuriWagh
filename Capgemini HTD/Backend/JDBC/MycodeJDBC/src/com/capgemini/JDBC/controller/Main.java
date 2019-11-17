package com.capgemini.JDBC.controller;

import java.util.Scanner;

import com.capgemini.JDBC.dao.hotelDAOImpl;

public class Main {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		int option;
		System.out.println("Enter 1: to show all food items \n 2: to take order from customer \n 3: to operate on food items \n 4: to total bill of the day");
		option = s.nextInt();
		switch (option) {
		case 1: GetAllinfo.getAllInfo();
		break;
		
		case 3: String curd;
		System.out.println("Enter A: to Insert items \n B: to remove items \n C: to modify");
		{hotelDAOImpl impl = new hotelDAOImpl();
		curd =  s.next();
		switch (curd) {
		case "A":impl.Add();
		break;
		case "B":impl.delete();
		break;
		case "C": impl.update();
		break;
		}
		}
		break;
		
		default :
		}
	}
}

	
