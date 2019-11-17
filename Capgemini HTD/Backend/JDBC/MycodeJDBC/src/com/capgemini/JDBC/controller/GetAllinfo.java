package com.capgemini.JDBC.controller;

import java.util.List;

import com.capgemini.JDBC.dao.hotelDAO;
import com.capgemini.JDBC.factory.HotelFactory;
import com.capgemini.JDBC.hotel.Hotel;

public class GetAllinfo {
	public static void getAllInfo() {
	hotelDAO dao = HotelFactory.getDAOInstance();
List<Hotel> li = dao.getAllInfo();
if(li!=null) {
	for (Hotel hotel : li) {
		System.out.println(hotel);
		
	}
}
else {
	System.out.println("Something went wrong");
}
}
}