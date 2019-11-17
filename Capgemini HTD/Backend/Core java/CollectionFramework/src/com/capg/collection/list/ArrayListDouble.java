package com.capg.collection.list;

import java.util.ArrayList;

public class ArrayListDouble {

	public static void main(String[] args) {
	ArrayList<Double> a= new ArrayList<Double>();
	a.add(2.3);
	a.add(3.2);
	a.add(5.9);
	a.add(4.6);
for(int i=0;i<4;i++) {
	Double r=a.get(i);
	System.out.println(r);
}
	}

}
