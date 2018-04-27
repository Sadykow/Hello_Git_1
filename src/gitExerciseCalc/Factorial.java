package gitExerciseCalc;


public class Factorial implements Calculator{
	
	private int values;
	
	/**
	 * Factorial Constructor
	 * @param number int
	 */
	public Factorial(int number) {
		values = number;
	}
	
	/**
	 * Provides the result
	 */
	@Override
	public String getResult() {
		int sum = 0;
		for(int factor = 1; factor <= values; factor++) {
			sum += factor;
		}
		return sum + "";
	}

}
