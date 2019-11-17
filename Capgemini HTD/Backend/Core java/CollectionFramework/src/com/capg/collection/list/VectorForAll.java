package com.capg.collection.list;

import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class VectorForAll {

	public static void main(String[] args) {
	Vector v=new Vector();
	v.add(2);
	v.add(2.5);
	v.add("Mayuri");
	v.add('M');
	 System.out.println("-------------For loop------------");
     for(int i=0; i<3;i++) {
     	Object r=v.get(i);
     	System.out.println(r);
     }
   System.out.println("----------------for Each--------------");  
	for(Object r:v) {
	System.out.println(r);
	}
	System.out.println("------------------Iterator---------------");
	Iterator it=v.iterator();
	while(it.hasNext()) {
	    Object r=it.next();
		System.out.println(r);
	}
	System.out.println("------------------ListIterator--------------");
	ListIterator it1 = v.listIterator();
	while(it1.hasNext()) {
		Object r=it1.next();
		System.out.println(r);
		
	}
	System.out.println("--------------------------"); 

	
	while(it1.hasPrevious()) {
		Object r = it1.previous();
		System.out.println(r);


}

	}

}
