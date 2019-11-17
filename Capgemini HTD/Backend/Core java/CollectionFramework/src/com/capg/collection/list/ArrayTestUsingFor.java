package com.capg.collection.list;

import java.util.ArrayList;

public class ArrayTestUsingFor {

	public static void main(String[] args) {
		//Creating object
	    ArrayList a= new ArrayList();
	    	a.add(24);
	    	a.add("Mayuri");
	    	a.add(2.34);
	    	a.add('A');
	    	
	    	//Getting elements from array
	    	for(int i=0;i<4;i++) {
	    		Object r=a.get(i);
	    		System.out.println(r);
	    	}

	}

}
