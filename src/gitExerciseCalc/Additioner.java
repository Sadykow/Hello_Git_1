/**
 * 
 */
package gitExerciseCalc;

/**
 * @author smuggler
 *
 */
public class Additioner implements Calculator {

	/* (non-Javadoc)
	 * @see gitExerciseCalc.Calculator#getResult()
	 */
	private double valueA, valueB;
	private int method;

	/**
	*The best comment
	*/
	
	/**
	 * Constructor deals with integers.
	 * @param a int
	 * @param b int
	 * @param method will define way of performing operation.
	 */
	public Additioner(int a, int b, int method) {
		valueA = a; valueB = b;
		this.method = method;
	}
	
	/**
	 * Constructor deals with doubles.
	 * @param a doubles
	 * @param b doubles
	 * @param method will define way of performing operation.
	 */
	public Additioner(double a, double b, double method) {
		valueA = a; valueB = b;
		this.method = (int)method;
	}
	
	/**
	 * Constructor deals with strings.
	 * @param a doubles
	 * @param b doubles
	 * @param method will define way of performing operation.
	 */
	public Additioner(String a, String b, String method) {
		// Develop something
		/*...*/
		this.method = Integer.parseInt(method);
	}
	
	/*
	 * Develop your methods...
	 */
	
	/**
	 * Use cases to switch between your methods
	 */
	@Override
	public String getResult() {
		switch(method) {
		case 1:
			return valueA + valueB+"";
			default:
				return null;
		}		
	}

}
