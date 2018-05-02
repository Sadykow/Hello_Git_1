package gitExerciseCalc;

public class RecursiveFactorial implements Calculator{

	private int value;
	
	public RecursiveFactorial(int number){
		this.value = number;
	}

	@Override
	public String getResult() {
		return factorial(value) + "";
	}
	
	public int factorial(int n) {
		int result = 0;
		if (n==0 || n==1) {
			return 1;
		}
		result = factorial(n-1) * n;
		return result;
	}
}
