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
	public void testAdditionerStrings() {
		calc = new Additioner("Hello ", "there.", "3");
		System.out.println(calc.getResult());
		assertEquals("Addition of two strings doesn't match",
				"Hello there.", calc.getResults());
	}

}
