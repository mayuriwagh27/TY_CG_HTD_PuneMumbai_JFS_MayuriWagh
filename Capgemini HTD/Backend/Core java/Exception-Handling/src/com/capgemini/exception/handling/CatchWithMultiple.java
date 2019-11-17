package com.capgemini.exception.handling;

public class CatchWithMultiple {

	public static void main(String[] args) {
		System.out.println("main started");
		String s= new String("Mayuri");
int[]a=new int[4];
try {
	System.out.println(s.length());
	System.out.println(a[5]);
	System.out.println(10/0);
}
catch(ArithmeticException | NullPointerException | ArrayIndexOutOfBoundsException b){
	b.printStackTrace();
}
System.out.println("main ended");
	}

}
