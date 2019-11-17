package com.capgemini.custom.exception;

public class Amount {
	void check(int val) throws Invalid_limit_Exception {
		if(val>40000) {
			Invalid_limit_Exception b=new Invalid_limit_Exception();
			throw b;
			
	}

}
}