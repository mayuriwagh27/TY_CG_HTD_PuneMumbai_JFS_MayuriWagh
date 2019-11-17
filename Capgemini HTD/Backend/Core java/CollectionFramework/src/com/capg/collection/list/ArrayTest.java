package com.capg.collection.list;

import java.util.ArrayList;

public class ArrayTest {

	public static void main(String[] args) {
		//Creating object
    ArrayList a= new ArrayList();
    	a.add(24);
    	a.add("Mayuri");
    	a.add(2.34);
    	a.add('A');
    	
    	//Getting elements from array
    	Object r=a.get(0);
    	Object s=a.get(1);
    	Object b=a.get(2);    	
    	
    	System.out.println(r);
    	System.out.println(s);
    	System.out.println(b);
    }
 	}


