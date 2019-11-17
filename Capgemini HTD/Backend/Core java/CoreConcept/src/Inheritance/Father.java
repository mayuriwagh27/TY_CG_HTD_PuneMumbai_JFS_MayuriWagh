package Inheritance;

public class Father extends Grandfather implements InterfaceExample {
	String fname= "Mahendra";
	public static void main(String[] args) {
		// TODO Auto-generated method stub
new Father().printname();
new Father().display();
new Father().show();

	}
	public void printname() {
		System.out.println(fname +" "+name+" "+lastname);
	}
	@Override
	public void display() {
		System.out.println("Display method");
		// TODO Auto-generated method stub
		
	}
	@Override
	public void show() {
		System.out.println("Show method");
		// TODO Auto-generated method stub
		
	}
}
