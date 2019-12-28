package com.capgemini.medicalstore.dao;

import java.util.List;

import com.capgemini.medicalstore.bean.ProductBean;

public interface ProductDAO {
	public List<ProductBean> getAllInfo();

	public boolean addProduct(ProductBean product);

	public void updateproduct();

	public void deleteProduct();
	

}//End of Interface
