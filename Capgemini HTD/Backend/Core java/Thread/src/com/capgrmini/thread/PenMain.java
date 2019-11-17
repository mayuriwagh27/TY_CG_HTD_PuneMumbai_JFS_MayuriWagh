package com.capgrmini.thread;

public class PenMain {

	public static void main(String[] args) {
		System.out.println("Main Started");
Pen p = new Pen();
p.start();
try {
	p.join();
} catch (InterruptedException e) {
	e.printStackTrace();
}
Pen t = new Pen();
  t.start();
try {
	t.join();
} catch (InterruptedException e) {
	e.printStackTrace();
}
   System.out.println("Main Ended");
	}

}
