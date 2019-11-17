package com.capgemini.JDBC.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.capgemini.JDBC.dao.hotelDAO;
import com.capgemini.JDBC.factory.HotelFactory;
import com.capgemini.JDBC.hotel.Hotel;

public class TakeOrder {
public static void getOrder() {
	System.out.println("Enter Item code: ");
	hotelDAO dao = HotelFactory.getDAOInstance();
	Scanner s= new Scanner(System.in);
	ArrayList<Hotel> a = new ArrayList<Hotel>();
	double sum =0;
	while(true) {
		int i=s.nextInt();
	if(i==0) {
			System.out.println("Exit");
			System.exit(i);
			}
	else if(i>0 && i<6) {
	user = dao.getOrder();
		for(Hotel h :hotel) {
	}
		System.out.println("Something went wrong");
	}

System.out.println("Total amount: Rs."+sum);
}
}
}
