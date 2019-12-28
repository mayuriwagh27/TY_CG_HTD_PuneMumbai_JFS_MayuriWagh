package com.capgemini.medicalstore.dao;

public interface AddToCartDAO {
	public boolean addProduct(int id);

	public void removeFormCart();

	public double getbill(double price);

	

}
