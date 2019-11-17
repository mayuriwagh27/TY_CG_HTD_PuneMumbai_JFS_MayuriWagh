package com.capgrmini.thread;

public class PVR_Main {

	public static void main(String[] args) {
		System.out.println("main started");
 PVR a = new PVR();
 
 Paytm t1 = new Paytm(a);
 t1.start();

 Paytm t2 = new Paytm(a);
 t2.start();
 try {
	Thread.sleep(1000);
} catch (InterruptedException e) {
	e.printStackTrace();
}
 a.leaveMe();
 System.out.println("main ended");
	}

}
