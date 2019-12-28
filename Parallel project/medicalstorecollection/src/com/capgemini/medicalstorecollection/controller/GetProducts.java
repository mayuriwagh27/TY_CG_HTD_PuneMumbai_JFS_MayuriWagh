package com.capgemini.medicalstorecollection.controller;

import java.util.List;

import com.capgemini.medicalstorecollection.beans.ProductBean;
import com.capgemini.medicalstorecollection.dao.ProductDAO;
import com.capgemini.medicalstorecollection.factory.AllFactory;

public class GetProducts {

	public static void getProduct() {
		ProductDAO productDAO = AllFactory.getDAOInstance();
		List<ProductBean> productlist = productDAO.getAllInfo();
		System.out.println("Product Id  \t  Product name  \t Category  \t price  \t Availability");
		for (ProductBean productBean : productlist) {
			System.out.print(" \t" + productBean.getProductid() + "\t");
			System.out.print("  " + productBean.getProductname() + "\t");
			System.out.print("\t " + productBean.getCatagory());
			System.out.print("\t " + productBean.getPrice() + "\t");
			System.out.println("\t " + productBean.getAvailability() + "\t");
		}

	}// End of getProduct()
}// End of class