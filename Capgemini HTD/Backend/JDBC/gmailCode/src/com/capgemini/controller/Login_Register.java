package com.capgemini.controller;

import java.util.Scanner;

import com.capgemini.dao.UserImplement;
import com.capgemini.dao.Userdao;
import com.capgemini.factory.Userfactory;

public class Login_Register {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int option;
		System.out.println("Press 1 to login \n 2 to register");
		option = sc.nextInt();
		switch (option) {
		case 1:String gmail;
		UserImplement user = new UserImplement(); 
		user.userlogin();
			System.out.println("press A to open compose \n press B to open show box");
			gmail=sc.next();
switch (gmail) {
case "A":user.compose();
break;
case "B":
}
break;
	case 2:
			{UserImplement user1 = new UserImplement();
			user1.register();
		
			}
			default:
				break;

	}

	}
}
