package com.capgemini.medicalstore.bean;

public class AddToCartBean {
private int cardId;
private int id;
private String productName;
private String category;
private double price;

//Getters & setters

public int getcardId() {
	return cardId;
}
public void setcardId(int cardId) {
	this.cardId = cardId;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getproductName() {
	return productName;
}
public void setproductName(String productName) {
	this.productName = productName;
}
public String getCategory() {
	return category;
}
public void setCategory(String category) {
	this.category = category;
}
public double getPrice() {
	return price;
}
public void setPrice(double price) {
	this.price = price;
}




}//end of class
