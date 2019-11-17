package com.capg.collection.list;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDouble_Iterator {

	public static void main(String[] args) {
		ArrayList<Double> a= new ArrayList<Double>();
		a.add(2.3);
		a.add(3.2);
		a.add(5.9);
		a.add(4.6);
		
		Iterator<Double>it= a.iterator();
		while(it.hasNext()) {
			Double r=it.next();
			System.out.println(r);
		}

	}

}
