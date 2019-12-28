package com.capgemini.medicalstore.controller;

import java.util.List;

import com.capgemini.medicalstore.bean.ProductBean;
import com.capgemini.medicalstore.dao.ProductDAO;
import com.capgemini.medicalstore.dao.UserDAO;
import com.capgemini.medicalstore.factory.AllFactory;

public class GetAllProduct {

	public static void getAllProduct() {
		UserDAO dao = AllFactory.getDAOInstance2();
		List<ProductBean> li = dao.getAllInfo();
		if(li != null) {
			System.out.println("Product Id |   Catagory    |    Product Name    |   Availability | Price ");
			for (ProductBean productBean : li) {
				
				System.out.print(" "+ productBean.getId());
				System.out.print("\t       "+ productBean.getCatagory());
				System.out.print("\t "+ productBean.getProduct_name());
				System.out.print("\t      "+ productBean.getAvailability());
				System.out.println("\t   "+ productBean.getPrice() );
				}
		}
		else {
			System.out.println("Something went wrong");
		}
		
		}
	}

