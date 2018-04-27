package gitExerciseCalc;

public class Divide implements Calculator {
	private double a;
	private double b;
	

	public Divide(double a, double b) {
		this.a = a;
		this.b = b;
	}

	@Override
	public String getResult() {
		Double c = a/b;
		return c.toString();
	}
}
