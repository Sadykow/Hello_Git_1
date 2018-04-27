/**
 * 
 */
package gitExerciseCalc;

/**
 * @author smuggler
 *
 */
public class Additioner implements Calculator {

	/*
	 * (non-Javadoc)
	 * 
	 * @see gitExerciseCalc.Calculator#getResult()
	 */
	private double valueAlpha, valueBeta;
	private String stringAlpha, stringBeta;
	private int method;

	/**
	 * Constructor deals with integers.
	 * 
	 * @param a
	 *            int
	 * @param b
	 *            int
	 * @param method
	 *            will define way of performing operation.
	 */
	public Additioner(int a, int b, int method) {
		this.valueAlpha = a;
		this.valueBeta = b;
		this.method = method;
	}

	/**
	 * Constructor deals with doubles.
	 * 
	 * @param a
	 *            doubles
	 * @param b
	 *            doubles
	 * @param method
	 *            will define way of performing operation.
	 */
	public Additioner(double a, double b, double method) {
		this.valueAlpha = a;
		this.valueBeta = b;
		this.method = (int)method;
	}

	/**
	 * Constructor deals with strings.
	 * 
	 * @param a
	 *            doubles
	 * @param b
	 *            doubles
	 * @param method
	 *            will define way of performing operation.
	 */
	public Additioner(String a, String b, String method) {

		stringAlpha = a;
		stringBeta = b;
		this.method = Integer.parseInt(method);
	}
	
	/*
	 * Develop your methods...
	 */
	 
	 public String useless(){
		 return valueAlpha + valueBeta +"";
	 }
	 
	 public String Worthless() {
		 return stringAlpha + stringBeta;
	 }

	/**
	 * Use cases to switch between your methods
	 */
	@Override
	public String getResult() {

		switch(method) {
		case 1:
			return valueAlpha + valueBeta +"";
		case 2:
			return useless();
		case 3:
			return Worthless();
		default:
			return null;
		}		

	}

}
