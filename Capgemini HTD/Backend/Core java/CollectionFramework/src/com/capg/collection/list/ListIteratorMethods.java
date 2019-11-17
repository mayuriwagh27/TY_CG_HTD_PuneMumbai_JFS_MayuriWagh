package com.capg.collection.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ListIteratorMethods {

	public static void main(String[] args) {
		//Creating object
	    ArrayList a= new ArrayList();
	    	a.add(24);
	    	a.add("Mayuri");
	    	a.add(2.34);
	    	a.add('A');
	    	
	    	//Getting elements from array
	    	ListIterator it = a.listIterator();
	    	while(it.hasNext()) {
	    		Object r=it.next();
	    		System.out.println(r);
	    		
	    	}
	    	System.out.println("--------------------------"); 
	   
	    	
	    	while(it.hasPrevious()) {
	    		Object r = it.previous();
	    		System.out.println(r);
	    	}

	}

}
