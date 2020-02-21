package chocky;

import static org.junit.Assert.*;

import org.junit.Test;

import junit.framework.TestCase;
@SuppressWarnings("unused")
public class CalculatorTest extends TestCase{
public  CalculatorTest() {
super();
}
	@Test
	public void testFact() {
		Calculator cal=new Calculator();
		assertEquals(120,cal.factorial(5));
	}
}


