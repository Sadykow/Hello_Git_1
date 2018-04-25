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
	
	@Test
	public void testAdditionerDoubles() {
		calc = new Additioner(0.34, 0.42, 2);
		System.out.println(calc.getResult());
		assertEquals("Addition of two doubles doesn't match",
				"0.76", calc.getResults())
	}
	
	@Test
	public void testFactorial() {
		calc = new Factorial(7);
		System.out.println(calc.getResult());
		assertEquals("Factorial value doesn't match",
				"28", calc.getResults())
	}

}
