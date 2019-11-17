package com.capgemini.JDBC.factory;

import com.capgemini.JDBC.dao.hotelDAO;
import com.capgemini.JDBC.dao.hotelDAOImpl;

public class HotelFactory {
private HotelFactory() {
	}

public static hotelDAO getDAOInstance() {
	hotelDAO dao = new hotelDAOImpl();
	return dao;
}


}

