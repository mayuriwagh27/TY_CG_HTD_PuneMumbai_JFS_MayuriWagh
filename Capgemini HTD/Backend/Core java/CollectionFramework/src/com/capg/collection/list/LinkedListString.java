package com.capg.collection.list;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListString {

	public static void main(String[] args) {
		LinkedList<String>li=new LinkedList<String>();
        li.add("Mayuri");
        li.add("Pranjali");
        li.add("Chetana");
         Iterator<String>it=li.iterator();
         while(it.hasNext()) {
        	 String r=it.next();
        	 System.out.println(r);
         }
	}

}
