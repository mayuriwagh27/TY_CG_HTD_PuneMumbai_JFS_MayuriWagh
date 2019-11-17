package Methods;

public class Testc {

	public static void main(String[] args) {
		Pen p = new Marker();//up-casting
		Marker i=(Marker)p;//down-casting
		i.cost=100;
		i.size=2.4;
		i.color();
		i.write();
	}
}