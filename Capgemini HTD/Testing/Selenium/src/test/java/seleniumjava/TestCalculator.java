package seleniumjava;

import org.junit.Assert;
import org.junit.Test;

public class TestCalculator {
	Calculator cal = new Calculator();

@Test
	public void addTest() {
		int a = 10;
		int b = 20;
		int expected = 30;
		int actual = cal.add(a,b);
		
		Assert.assertEquals(expected, actual);
	}

@Test
public void sub() {
	int a = 10;
	int b = 5;
	int expected = 5;
	int actual = cal.sub(a,b);
	
	Assert.assertEquals(expected, actual);
}

}
