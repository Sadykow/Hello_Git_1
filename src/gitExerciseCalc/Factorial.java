package gitExerciseCalc;


public class Factorial implements Calculator{
	
	private int value;
	
	/**
	 * Factorial Constructor
	 * @param number int
	 */
	public Factorial(int number) {
		value = number;
	}
	
	/**
	 * Provides the result
	 */
	@Override
	public String getResult() {
		int sum = 0;
		for(int factor = 1; factor <= value; factor++) {
			sum += factor;
		}
		return sum + "";
	}

}
