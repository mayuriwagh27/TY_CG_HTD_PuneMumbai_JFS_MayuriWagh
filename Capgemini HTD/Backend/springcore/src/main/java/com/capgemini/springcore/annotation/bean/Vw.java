package com.capgemini.springcore.annotation.bean;

import com.capgemini.springcore.interfaces.Engine;

public class Vw implements Engine {

	@Override
	public int getCC() {
		return 1500;
	}

	@Override
	public String getType() {
		return "VW : 5-stroke diesel";
	}

}
