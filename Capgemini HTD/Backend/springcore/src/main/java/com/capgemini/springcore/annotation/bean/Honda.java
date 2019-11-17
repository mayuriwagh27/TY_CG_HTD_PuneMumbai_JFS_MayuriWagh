package com.capgemini.springcore.annotation.bean;

import com.capgemini.springcore.interfaces.Engine;

public class Honda implements Engine {

	@Override
	public int getCC() {
		
		return 1700;
	}

	@Override
	public String getType() {
		return "Honda : 4-stroke petrol";
	}

}//End of class
