package com.capgemini.JDBC.hotel;
public class Hotel {
	private int Item_code;
	private String Food_name;
	private double Price;

	public int getItem_code() {
		return Item_code;
	}
	public void setItem_code(int Item_code) {
		this.Item_code = Item_code;
	}
	public String getFood_name() {
		return Food_name;
	}
	public void setFood_name(String Food_name) {
		this.Food_name = Food_name;
	}
	public double getPrice() {
		return Price;
	}
	public void setPrice(double price) {
		this.Price = price;
	}
	@Override
	public String toString() {
		return "Hotel [Item_code=" + Item_code + ", Food_name=" + Food_name + ", Price=" + Price + "]";
	}

}


