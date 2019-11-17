package com.capgemini.springcore.beans;

public class MobileBean {

	private String brandName;
	private String modelname;
	private int price;
	private MobileDislpayBean display;
	
	//getters & setters
	public String getBrandName() {
		return brandName;
	}
	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}
	public String getModelname() {
		return modelname;
	}
	public void setModelname(String modelname) {
		this.modelname = modelname;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public MobileDislpayBean getDisplay() {
		return display;
	}
	public void setDisplay(MobileDislpayBean display) {
		this.display = display;
	}
	
	
}
