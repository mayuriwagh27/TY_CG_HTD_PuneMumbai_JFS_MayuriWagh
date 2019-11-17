package com.capg.collection.list;

import java.util.ArrayList;

public class ArrayUsingForeach {

	public static void main(String[] args) {
		//Creating object
	    ArrayList a= new ArrayList();
	    	a.add(24);
	    	a.add("Mayuri");
	    	a.add(2.34);
	    	a.add('A');
	    	
	    	//Getting elements from array
	    	for(Object r: a) {
	    		System.out.println(r);
	    	}

	}

}
