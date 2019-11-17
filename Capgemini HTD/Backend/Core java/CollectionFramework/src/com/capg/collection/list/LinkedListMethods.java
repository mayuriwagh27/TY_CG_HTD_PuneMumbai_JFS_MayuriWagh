package com.capg.collection.list;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListMethods {

	public static void main(String[] args) {
		LinkedList li= new LinkedList();
        li.add(20);
        li.add(2.6);
        li.add("sonu");
        
        System.out.println("-------------For loop------------");
        for(int i=0; i<3;i++) {
        	Object r=li.get(i);
        	System.out.println(r);
        }
      System.out.println("----------------for Each--------------");  
	for(Object r:li) {
	System.out.println(r);
	}
	System.out.println("------------------Iterator---------------");
	Iterator it=li.iterator();
	while(it.hasNext()) {
	    Object r=it.next();
		System.out.println(r);
	}
	System.out.println("------------------List Iterator--------------");
	ListIterator it1 = li.listIterator();
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















