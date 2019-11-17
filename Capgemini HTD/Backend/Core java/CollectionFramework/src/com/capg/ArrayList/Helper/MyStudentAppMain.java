package com.capg.ArrayList.Helper;

import java.util.Scanner;

public class MyStudentAppMain {

	public static void main(String[] args) {
		MyStudentApp m=new MyStudentApp();
		Scanner s= new Scanner(System.in);
		while(true) {
			System.out.println("Enter option");
			int opt=s.nextInt();
			switch(opt) {
			case 1:m.add();
			break;
			case 2:m.display();
			break;
			case 3:System.exit(0);
			break;
			default:System.out.println("wrong option");
			}
		}

	}

}
