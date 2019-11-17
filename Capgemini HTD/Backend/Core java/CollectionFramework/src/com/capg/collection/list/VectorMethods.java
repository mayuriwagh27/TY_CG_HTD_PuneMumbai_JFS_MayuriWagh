package com.capg.collection.list;

import java.util.Iterator;
import java.util.Vector;

public class VectorMethods {

	public static void main(String[] args) {
		Vector v= new Vector();
		v.add(2);
		v.add(2.5);
		v.add("Mayuri");
		v.add('M');
Iterator it= v.iterator();
while(it.hasNext()) {
	Object r=it.next();
	System.out.println(r);
}
	}

}
