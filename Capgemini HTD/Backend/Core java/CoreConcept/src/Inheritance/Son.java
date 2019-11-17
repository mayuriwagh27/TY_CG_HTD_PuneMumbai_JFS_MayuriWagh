package Inheritance;

public class Son extends Father implements InterfaceExample{
	String Sname= "Aniket";
	public static void main(String[] args) {
		// TODO Auto-generated method stub
new Son().printname();
new Son().display();
new Son().show();

	}
	public void printname() {
		System.out.println(Sname+" "+fname +" "+lastname);

}
	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("Display method");
	}
	@Override
	public void show() {
		// TODO Auto-generated method stub
		System.out.println("Show method");
		
	}
}
