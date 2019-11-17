package com.capg.collection.list;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorMethods {

	public static void main(String[] args) {
		//Creating object
	    ArrayList a= new ArrayList();
	    	a.add(24);
	    	a.add("Mayuri");
	    	a.add(2.34);
	    	a.add('A');
	    	
	    	//Getting elements from array
	    	Iterator it = a.iterator();
	    	while(it.hasNext()) {
	    		Object r=it.next();
	    		System.out.println(r);
	    	}
	    	
	    			
	    			
	    			
	    			


	}

}
