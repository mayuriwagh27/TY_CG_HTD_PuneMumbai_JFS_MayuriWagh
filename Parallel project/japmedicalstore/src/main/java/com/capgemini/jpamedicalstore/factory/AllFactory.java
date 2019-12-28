package com.capgemini.jpamedicalstore.factory;

import com.capgemini.jpamedicalstore.dao.AdminDAO;
import com.capgemini.jpamedicalstore.dao.AdminDAOImpl;
import com.capgemini.jpamedicalstore.dao.CartDAO;
import com.capgemini.jpamedicalstore.dao.CartDAoImpl;
import com.capgemini.jpamedicalstore.dao.DiscussionDAO;
import com.capgemini.jpamedicalstore.dao.DiscussionDAOImpl;
import com.capgemini.jpamedicalstore.dao.ProductDAO;
import com.capgemini.jpamedicalstore.dao.ProductDAOImpl;
import com.capgemini.jpamedicalstore.dao.UserDAO;
import com.capgemini.jpamedicalstore.dao.UserDAOImpl;
import com.capgemini.jpamedicalstore.validation.ValidationDAO;
import com.capgemini.jpamedicalstore.validation.ValidationDAOImpl;

public class AllFactory {

	public static UserDAO getUserInstance() {
		UserDAO userdao = new UserDAOImpl();
		return userdao;
	}

	public static ProductDAO getProductInstance() {
		ProductDAO productDAO = new ProductDAOImpl();
		return productDAO;
	}

	public static CartDAO getCartInstance() {
		CartDAO cartdao = new CartDAoImpl();
		return cartdao;
	}

	public static DiscussionDAO getDiscussionInstance() {
		DiscussionDAO discussiondao = new DiscussionDAOImpl();
		return discussiondao;
	}

	public static AdminDAO getAdminInstance() {
		AdminDAO admindao = new AdminDAOImpl();
		return admindao;
	}

	public static ValidationDAO getValidInstance() {
		ValidationDAO valid = new ValidationDAOImpl();
		return valid;
	}

}// End of class
