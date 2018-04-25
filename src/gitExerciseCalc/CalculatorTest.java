package gitExerciseCalc;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class CalculatorTest {

	Calculator calc;
	/*
	 * Test first method of simple addition.
	 */
	@Test
	public void test() {
		calc = new Additioner(3,3,1);
		System.out.println(calc.getResult());
		assertEquals("Addition of two integers does't match",
				"6.0", calc.getResult());
	}

	@Test
	public void testDouble() {
		calc = new Additioner(6.0,3.0,1.0);
		System.out.println(calc.getResult());
		assertEquals("Addition of two integers does't match",
				"9.0", calc.getResult());
	}
	
}
