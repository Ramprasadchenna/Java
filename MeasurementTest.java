package chocky;

import static org.junit.Assert.*;

import org.junit.Test;

import junit.framework.TestCase;

public class MeasurementTest extends TestCase 
{
	public MeasurementTest(String name) {
		super(name);
	}
	public void testAddMeasurement() {
		Measurement m1=new Measurement(30);
		Measurement m2=new Measurement(50);
		m1.add(m2);
		assertEquals(80,m1.getValue());
		assertEquals(50,m2.getValue());
		
	}

}
