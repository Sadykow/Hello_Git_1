/**
 * 
 */
package gitExerciseCalc;

/**
 * @author smuggler
 *
 */
public class Multiplier implements Calculator {

	/* (non-Javadoc)
	 * @see gitExerciseCalc.Calculator#getResult()
	 */
	
	private double valueA, valueB;
	private int method;
	
	/**
	 * Multiplier constructor for ints
	 * @param a int
	 * @param b int
	 */
	public Multiplier(int a, int b) {
		valueA = a; valueB = b;
		method = 1;
	}
	
	/**
	 * Multiplier constructor for doubles
	 * @param a int
	 * @param b int
	 */
	public Multiplier(double a, double b) {
		valueA = a; valueB = b;
		method = 2;
	}
	
	@Override
	public String getResult() {
		switch(method) {
		case 1:
			return valueA * valueB + "";
		case 2:
			return valueA * valueB + "";
		default:
			return null;
		}
	}

}
