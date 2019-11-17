package com.capgemini.JDBC.factory;

import com.capgemini.JDBC.dao.userDAO;
import com.capgemini.JDBC.dao.userDAO_Implement;

public class userFactory {
/*private userFactory() {          //constructor can be used or cannot be
	
} */
public static userDAO getInstance() {        // new method
	userDAO dao = new userDAO_Implement();
	return dao;
}
}
