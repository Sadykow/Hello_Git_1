/**
 * 
 */
package gitExerciseCalc;

/**
 * @author smuggler
 *
 */
public class Divider implements Calculator {

	/* (non-Javadoc)
	 * @see gitExerciseCalc.Calculator#getResult()
	 */
	
	private double valueA, valueB;
	private int method;
	
	/**
	 * Divider constructor for ints
	 * @param a int
	 * @param b int
	 */
	public Divider(int a, int b) {
		valueA = a; valueB = b;
		method = 1;
	}
	
	/**
	 * Divider constructor for doubles
	 * @param a int
	 * @param b int
	 */
	public Divider(double a, double b) {
		valueA = a; valueB = b;
		method = 2;
	}
	
	@Override
	public String getResult() {
		switch(method) {
		case 1:
			return valueA / valueB + "";
		case 2:
			return valueA / valueB + "";
		default:
			return null;
		}
	}

}
