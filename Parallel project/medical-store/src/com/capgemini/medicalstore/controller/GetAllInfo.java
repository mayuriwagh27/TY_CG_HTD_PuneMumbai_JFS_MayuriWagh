package com.capgemini.medicalstore.controller;

import java.util.List;

import com.capgemini.medicalstore.bean.ProductBean;
import com.capgemini.medicalstore.dao.ProductDAO;
import com.capgemini.medicalstore.factory.AllFactory;

public class GetAllInfo {
	public static void getAllInfo() {
		ProductDAO dao = AllFactory.getDAOInstance();
		List<ProductBean> li = dao.getAllInfo();
		if(li!=null) {
			System.out.println("Product Id |   Catagory        |    Product Name    |   Availability | Price ");

			for (ProductBean adminBean : li) {
				System.out.print(" "+ adminBean.getId());
				System.out.print("\t       "+ adminBean.getCatagory());
				System.out.print("\t    "+ adminBean.getProduct_name());
				System.out.print("\t        "+ adminBean.getAvailability());
				System.out.println("\t"+ adminBean.getPrice() );
				
				}
		}
		else {
			System.out.println("Something went wrong");
		}
		
	}

}
