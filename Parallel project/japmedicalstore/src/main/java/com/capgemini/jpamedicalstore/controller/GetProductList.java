package com.capgemini.jpamedicalstore.controller;

import java.util.List;

import com.capgemini.jpamedicalstore.bean.ProductBean;
import com.capgemini.jpamedicalstore.dao.ProductDAO;
import com.capgemini.jpamedicalstore.factory.AllFactory;

public class GetProductList {
	public static void getAllProducts() {
		ProductDAO productDao = AllFactory.getProductInstance();
		List<ProductBean> List = productDao.getAllInfo();
		System.out.println(
				"*******************************************************************************************************************");
		System.out.printf("%10s %20s %20s %20s %20s %20s", "Product ID", "Product Name", "Category", "Price",
				"Quantity", "Availability");
		System.out.println();
		System.out.println(
				"*******************************************************************************************************************");
		for (ProductBean product : List) {
			System.out.format("%10s %20s %20s %20s %20s %20s", product.getProductid(), product.getName(), product.getCategory(),
					product.getPrice(), product.getQuantity(), product.getAvailability());
			System.out.println();
		}
		System.out.println(
				"*******************************************************************************************************************");
	}
}// End of class
